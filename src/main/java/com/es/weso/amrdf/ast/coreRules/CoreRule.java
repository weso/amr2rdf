package com.es.weso.amrdf.ast.coreRules;

import com.es.weso.amrdf.ast.AST;
import com.es.weso.amrdf.ast.Terminal;

public interface CoreRule extends AST {

    Terminal getTerminal();

}
