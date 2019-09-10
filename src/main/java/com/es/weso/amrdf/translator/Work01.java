package com.es.weso.amrdf.translator;

import org.apache.jena.rdf.model.Statement;

import java.util.*;
import java.util.stream.Collectors;

public class Work01 implements FactTranslator {

    private List<NonCoreRuleTranslation> nonCoreRuleTranslations;
    private Map<String, String> nonCoreRulesDictionary = createNonCoreRulesDictionary();

    @Override
    public List<Statement> translate(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        List<Optional<Statement>> statements = new ArrayList<>(Arrays.asList(
                workIn(arg0, arg2),
                workIn(arg3, arg2),
                workAs(arg0, arg1),
                //workAs(arg3, arg1), // not always true
                coworker(arg0, arg3),
                coworker(arg3, arg0)
        ));
        statements.addAll(createNonCoreRulesStatements(arg0));
        return statements.stream().filter(o -> o.isPresent()).map(o -> o.get()).collect(Collectors.toList());
    }

    @Override
    public void addNonCoreRules(List<NonCoreRuleTranslation> nonCoreRules) {
        this.nonCoreRuleTranslations = nonCoreRules;
    }

    private Optional<Statement> workIn(String worker, String organisation) {
        return worker != null && organisation != null ?
                Optional.of(createStatement(worker, "http://example.com/workIn", organisation)) :
                Optional.empty();
    }

    private Optional<Statement> workAs(String worker, String occupation) {
        return worker != null && occupation != null ?
                Optional.of(createStatement(worker, "http://example.com/workAs", occupation)) :
                Optional.empty();
    }

    private Optional<Statement> coworker(String worker, String coworker) {
        return worker != null && coworker != null ?
                Optional.of(createStatement(worker, "http://example.com/coworker", coworker)) :
                Optional.empty();
    }

    private List<Optional<Statement>> createNonCoreRulesStatements(String subject) {
        return nonCoreRuleTranslations.stream().filter(ncr -> ncr.getNonCoreRuleTitle().equals("time")).map(ncr -> {
            String predicate = ncr.getNonCoreRuleEntityType().orElse("");
            return Optional.of(createStatement(subject, nonCoreRulesDictionary.get(predicate), ncr.getValue()));
        }).collect(Collectors.toList());
    }

    private Map<String, String> createNonCoreRulesDictionary() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("after", "http://example.com/workFrom");
        dictionary.put("before", "http://example.com/workUntil");
        return dictionary;
    }

}
