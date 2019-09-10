package com.es.weso.amrdf.ast;

public class RuleGeneric {

    private Terminal terminal;

    protected RuleGeneric(Terminal terminal) {
        this.terminal = terminal;
    }

    public Terminal getTerminal() {
        return terminal;
    }
}
