package com.es.weso.amrdf.ast.coreRules;

import com.es.weso.amrdf.ast.RuleGeneric;
import com.es.weso.amrdf.ast.Terminal;
import com.es.weso.amrdf.visitors.Visitor;

public class Arg0 extends RuleGeneric implements CoreRule {

    public Arg0(Terminal terminal) {
        super(terminal);
    }

    @Override
    public <A, B> B accept(Visitor<A, B> visitor, A optionalArgument) {
        return visitor.visit(this, optionalArgument);
    }
}
