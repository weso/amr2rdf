package com.es.weso.amrdf.ast;

import com.es.weso.amrdf.visitors.Visitor;

public interface AST {

    <A, B> B accept(Visitor<A, B> visitor, A optionalArgument);
}
