package com.es.weso.amrdf.translator;

import com.es.weso.amrdf.ast.nonCoreRules.NonCoreRule;
import org.apache.jena.rdf.model.Statement;

import java.util.*;
import java.util.stream.Collectors;

public class Work01Question implements QueryTranslator {

    private List<NonCoreRuleTranslation> nonCoreRuleTranslations;
    private Map<String, String> nonCoreRulesDictionary = createNonCoreRulesDictionary();

    @Override
    public String translate(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        String currentArg0 = arg0 != null && arg0.contains(AMRUNKNOWN) ? QUESTION_VARIABLE : arg0;
        String currentArg1 = arg1 != null && arg1.contains(AMRUNKNOWN) ? QUESTION_VARIABLE : arg1;
        String currentArg2 = arg2 != null && arg2.contains(AMRUNKNOWN) ? QUESTION_VARIABLE : arg2;
        String currentArg3 = arg3 != null && arg3.contains(AMRUNKNOWN) ? QUESTION_VARIABLE : arg3;
        String currentArg4 = arg4 != null && arg4.contains(AMRUNKNOWN) ? QUESTION_VARIABLE : arg4;
        String currentArg5 = arg5 != null && arg5.contains(AMRUNKNOWN) ? QUESTION_VARIABLE : arg5;
        List<Optional<String>> statements = new ArrayList<>(Arrays.asList(
                workIn(currentArg0, currentArg2),
                workIn(currentArg3, currentArg2),
                workAs(currentArg0, currentArg1),
                workAs(currentArg3, currentArg1),
                coworker(currentArg0, currentArg3),
                coworker(currentArg3, currentArg0)
        ));
        statements.addAll(createNonCoreRulesStatements(arg0));
        List<String> finalValues = statements.stream().filter(o -> o.isPresent()).map(o -> o.get()).collect(Collectors.toList());
        return isAskQuestion() ? createSparqlAskQuery(finalValues) : createSparqlQuery("?q", finalValues);
    }

    @Override
    public void addNonCoreRules(List<NonCoreRuleTranslation> nonCoreRules) {
        this.nonCoreRuleTranslations = nonCoreRules;
    }

    private Optional<String> workIn(String worker, String organisation) {
        return worker != null && organisation != null ?
                Optional.of(createTripleQuestion(worker, "http://example.com/workIn", organisation)) :
                Optional.empty();
    }

    private Optional<String> workAs(String worker, String occupation) {
        return worker != null && occupation != null ?
                Optional.of(createTripleQuestion(worker, "http://example.com/workAs", occupation)) :
                Optional.empty();
    }

    private Optional<String> coworker(String worker, String coworker) {
        return worker != null && coworker != null ?
                Optional.of(createTripleQuestion(worker, "http://example.com/coworker", coworker)) :
                Optional.empty();
    }

    private List<Optional<String>> createNonCoreRulesStatements(String subject) {
        return nonCoreRuleTranslations.stream().filter(ncr -> ncr.getNonCoreRuleTitle().equals("time")).map(ncr -> {
            String predicate = ncr.getNonCoreRuleEntityType().orElse("time");
            String type = predicate.equals(AMRUNKNOWN) ? "time" : predicate;
            return Optional.of(createTripleQuestion(subject, nonCoreRulesDictionary.get(type), ncr.getValue()));
        }).collect(Collectors.toList());
    }

    private boolean isAskQuestion() {
        Optional<NonCoreRuleTranslation> polarity =
                nonCoreRuleTranslations.stream().filter(ncr -> ncr.getNonCoreRuleTitle().equals("polarity")).findFirst();
        return polarity.isPresent() && polarity.get().getValue().equals(AMRUNKNOWN);
    }

    private Map<String, String> createNonCoreRulesDictionary() {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("after", "http://example.com/workFrom");
        dictionary.put("before", "http://example.com/workUntil");
        dictionary.put("time", "http://example.com/workFrom");
        return dictionary;
    }
}
