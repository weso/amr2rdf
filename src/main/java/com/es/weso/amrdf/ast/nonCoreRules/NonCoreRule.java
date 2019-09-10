package com.es.weso.amrdf.ast.nonCoreRules;

import com.es.weso.amrdf.ast.AST;
import com.es.weso.amrdf.ast.Terminal;

public interface NonCoreRule extends AST {

    Terminal getTerminal();
}
