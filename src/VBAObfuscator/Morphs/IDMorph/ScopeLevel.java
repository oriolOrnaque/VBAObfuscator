package VBAObfuscator.Morphs.IDMorph;

import java.util.HashMap;
import java.util.Map;

public class ScopeLevel {

    private Map<String, String> translations;

    public ScopeLevel()
    {
        this.translations = new HashMap<>();
    }

    public boolean contains(String id)
    {
        return this.translations.containsKey(id);
    }

    public String get(String id)
    {
        return this.translations.get(id);
    }

    public void insert(String k, String v)
    {
        this.translations.put(k, v);
    }

}