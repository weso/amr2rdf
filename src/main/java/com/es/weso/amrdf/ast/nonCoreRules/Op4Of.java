package com.es.weso.amrdf.ast.nonCoreRules;

import com.es.weso.amrdf.ast.RuleGeneric;
import com.es.weso.amrdf.ast.Terminal;
import com.es.weso.amrdf.visitors.Visitor;

public class Op4Of extends RuleGeneric implements Op {

    public Op4Of(Terminal terminal) {
        super(terminal);
    }

    @Override
    public <A, B> B accept(Visitor<A, B> visitor, A optionalArgument) {
        return visitor.visit(this, optionalArgument);
    }
}
