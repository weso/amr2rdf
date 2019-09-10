package com.es.weso.amrdf.translator;

import java.util.Optional;

public class NonCoreRuleTranslation {

    private String nonCoreRuleTitle;
    private Optional<String> nonCoreRuleEntityType;
    private String value;

    public NonCoreRuleTranslation(String nonCoreRuleTitle, Optional<String> nonCoreRuleEntityType, String value) {
        this.nonCoreRuleTitle = nonCoreRuleTitle;
        this.nonCoreRuleEntityType = nonCoreRuleEntityType;
        this.value = value;
    }

    public String getNonCoreRuleTitle() {
        return nonCoreRuleTitle;
    }

    public Optional<String> getNonCoreRuleEntityType() {
        return nonCoreRuleEntityType;
    }

    public String getValue() {
        return value;
    }
}
