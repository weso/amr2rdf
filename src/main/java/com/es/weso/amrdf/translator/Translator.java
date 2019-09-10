package com.es.weso.amrdf.translator;

import java.util.List;

public interface Translator<T> {

    T translate(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5);

    void addNonCoreRules(List<NonCoreRuleTranslation> nonCoreRules);

}
