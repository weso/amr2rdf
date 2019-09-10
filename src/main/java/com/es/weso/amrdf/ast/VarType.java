package com.es.weso.amrdf.ast;

import com.es.weso.amrdf.visitors.Visitor;

public class VarType implements AST {

    private String text;

    public VarType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public <A, B> B accept(Visitor<A, B> visitor, A optionalArgument) {
        return visitor.visit(this, optionalArgument);
    }
}
