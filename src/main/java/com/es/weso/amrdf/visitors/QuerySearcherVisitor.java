package com.es.weso.amrdf.visitors;

import com.es.weso.amrdf.ast.*;
import com.es.weso.amrdf.ast.coreRules.*;
import com.es.weso.amrdf.ast.nonCoreRules.*;
import org.apache.jena.query.QueryVisitor;

public class QuerySearcherVisitor extends BaseVisitor<String, Void> {

    private final static String AMRUNKNOWN = "amr-unknown";
    private boolean question = false;

    @Override
    public Void visit(Text text, String optionalArgument) {
        if(text.getText().equals(AMRUNKNOWN)) setQuestion(true);
        return super.visit(text, optionalArgument);
    }

    @Override
    public Void visit(VarName varName, String optionalArgument) {
        if(varName.getText().equals(AMRUNKNOWN)) setQuestion(true);
        return super.visit(varName, optionalArgument);
    }

    @Override
    public Void visit(VarType varType, String optionalArgument) {
        if(varType.getText().equals(AMRUNKNOWN)) setQuestion(true);
        return super.visit(varType, optionalArgument);
    }

    public boolean isQuestion() {
        return question;
    }

    private void setQuestion(boolean question) {
        this.question = question;
    }
}
