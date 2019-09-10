package com.es.weso.amrdf.translator;

import org.apache.jena.rdf.model.Statement;

import java.util.*;
import java.util.stream.Collectors;

public class Bear02 implements FactTranslator {

    private List<NonCoreRuleTranslation> nonCoreRuleTranslations;
    private Map<String, String> nonCoreRulesDictionary = createNonCoreRulesDictionary();

    @Override
    public List<Statement> translate(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        List<Optional<Statement>> statements = new ArrayList<>(Arrays.asList(
                bear(arg0, arg1)
        ));
        statements.addAll(createNonCoreRulesStatements(arg1));
        return statements.stream().filter(o -> o.isPresent()).map(o -> o.get()).collect(Collectors.toList());
    }

    @Override
    public void addNonCoreRules(List<NonCoreRuleTranslation> nonCoreRules) {
        this.nonCoreRuleTranslations = nonCoreRules;
    }

    private Optional<Statement> bear(String mother, String child) {
        return mother != null && child != null ?
                Optional.of(createStatement(mother, "http://example.com/bear", child)) :
                Optional.empty();
    }

    private List<Optional<Statement>> createNonCoreRulesStatements(String subject) {
        List<String> acceptedNonCoreRules = Arrays.asList("location", "time");
        return nonCoreRuleTranslations.stream().filter(ncr -> acceptedNonCoreRules.contains(ncr.getNonCoreRuleTitle())).map(ncr -> {
            String predicate = ncr.getNonCoreRuleEntityType().orElse("");
            return Optional.of(createStatement(subject, nonCoreRulesDictionary.get(predicate), ncr.getValue()));
        }).collect(Collectors.toList());
    }

    private Map<String, String> createNonCoreRulesDictionary() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("location", "http://example.com/bearPlace");
        dictionary.put("time", "http://example.com/bearTime");
        return dictionary;
    }

}
