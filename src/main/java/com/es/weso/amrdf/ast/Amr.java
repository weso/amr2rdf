package com.es.weso.amrdf.ast;

import com.es.weso.amrdf.ast.coreRules.CoreRule;
import com.es.weso.amrdf.ast.nonCoreRules.NonCoreRule;
import com.es.weso.amrdf.visitors.Visitor;

import java.util.List;

public class Amr implements Terminal {

    private VarName varName;
    private VarType varType;
    private List<CoreRule> coreRules;
    private List<NonCoreRule> nonCoreRules;

    public Amr(VarName varName, VarType varType, List<CoreRule> coreRules, List<NonCoreRule> nonCoreRules) {
        this.varName = varName;
        this.varType = varType;
        this.coreRules = coreRules;
        this.nonCoreRules = nonCoreRules;
    }

    public VarName getVarName() {
        return varName;
    }

    public VarType getVarType() {
        return varType;
    }

    public List<CoreRule> getCoreRules() {
        return coreRules;
    }

    public List<NonCoreRule> getNonCoreRules() {
        return nonCoreRules;
    }

    @Override
    public <A, B> B accept(Visitor<A, B> visitor, A optionalArgument) {
        return visitor.visit(this, optionalArgument);
    }
}
