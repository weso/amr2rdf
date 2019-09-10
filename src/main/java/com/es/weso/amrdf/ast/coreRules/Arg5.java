package com.es.weso.amrdf.ast.coreRules;

import com.es.weso.amrdf.ast.RuleGeneric;
import com.es.weso.amrdf.ast.Terminal;
import com.es.weso.amrdf.visitors.Visitor;

public class Arg5 extends RuleGeneric implements CoreRule {

    public Arg5(Terminal terminal) {
        super(terminal);
    }

    public <A, B> B accept(Visitor<A, B> visitor, A optionalArgument) {
        return visitor.visit(this, optionalArgument);
    }
}
