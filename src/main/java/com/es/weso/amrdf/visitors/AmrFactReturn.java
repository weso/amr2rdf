package com.es.weso.amrdf.visitors;

import com.es.weso.amrdf.translator.NonCoreRuleTranslation;
import org.apache.jena.rdf.model.Statement;

import java.util.List;

public class AmrFactReturn {

    private String amrType;
    private List<Statement> statements;
    private String query;
    private List<NonCoreRuleTranslation> nonCoreRuleTranslations;

    public AmrFactReturn(String amrType, List<Statement> statements, List<NonCoreRuleTranslation> nonCoreRuleTranslations) {
        this.amrType = amrType;
        this.statements = statements;
        this.nonCoreRuleTranslations = nonCoreRuleTranslations;
    }

    public String getAmrType() {
        return amrType;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public List<NonCoreRuleTranslation> getNonCoreRuleTranslations() {
        return nonCoreRuleTranslations;
    }
}
