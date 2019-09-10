package com.es.weso.amrdf.ast;

import com.es.weso.amrdf.visitors.Visitor;

import java.util.List;

public class AmrSet implements AST {

    private List<Amr> amrs;

    public AmrSet(List<Amr> amrs) {
        this.amrs = amrs;
    }

    public List<Amr> getAmrs() {
        return amrs;
    }

    @Override
    public <A, B> B accept(Visitor<A, B> visitor, A optionalArgument) {
        return visitor.visit(this, optionalArgument);
    }
}
