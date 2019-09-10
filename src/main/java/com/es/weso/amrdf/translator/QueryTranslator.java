package com.es.weso.amrdf.translator;

import org.apache.jena.rdf.model.Statement;

import java.util.List;

public interface QueryTranslator extends Translator<String>{

    String AMRUNKNOWN = "amr-unknown";
    String QUESTION_VARIABLE = "?q";

    default String createTripleQuestion(String s, String p, String o) {
        return s + " " + p + " " + o + " ";
    }

    default String createSparqlQuery(String queryVariableName, List<String> tripleFilters) {
        return "SELECT " + queryVariableName + " WHERE { \n" + String.join("; \n", tripleFilters) + ". \n}";
    }

    default String createSparqlAskQuery(List<String> tripleFilters) {
        return "ASK { \n" + String.join("; \n", tripleFilters) + ". \n}";
    }
}
