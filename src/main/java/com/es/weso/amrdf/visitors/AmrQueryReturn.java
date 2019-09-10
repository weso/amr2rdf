package com.es.weso.amrdf.visitors;

import com.es.weso.amrdf.translator.NonCoreRuleTranslation;
import org.apache.jena.rdf.model.Statement;

import java.util.List;

public class AmrQueryReturn extends AmrFactReturn {

    private String query;

    public AmrQueryReturn(String amrType, List<Statement> statements, List<NonCoreRuleTranslation> nonCoreRuleTranslations, String query) {
        super(amrType, statements, nonCoreRuleTranslations);
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
