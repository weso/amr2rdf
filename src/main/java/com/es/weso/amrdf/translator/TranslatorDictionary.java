package com.es.weso.amrdf.translator;

import java.util.HashMap;
import java.util.Map;

public class TranslatorDictionary {

    private Map<String, Translator<?>> dict = new HashMap<>();


    public TranslatorDictionary() {
        createDictionary();
    }

    public Translator get(String key) {
        return dict.get(key);
    }

    private void createDictionary() {
        dict.put("work-01", new Work01());
        dict.put("work-01-question", new Work01Question());
        dict.put("bear-02", new Bear02());
    }
}
