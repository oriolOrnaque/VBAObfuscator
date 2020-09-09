package VBAObfuscator.Morphs.IDMorph;

import java.util.ArrayDeque;
import java.util.Deque;

public class Scope {

    private Deque<ScopeLevel> scope;

    public Scope()
    {
        this.scope = new ArrayDeque<>();
    }

    public void pushLevel()
    {
        this.scope.push(new ScopeLevel());
    }

    public void popLevel() { this.scope.pop(); }

    public void insert(String k, String v)
    {
        this.scope.peek().insert(k, v);
    }

    public boolean inScope(String id)
    {
        for(ScopeLevel lvl: scope)
        {
            if(lvl.contains(id))
                return true;
        }

        return false;
    }

    public String get(String id)
    {
        ScopeLevel lvl = findScopeOf(id);
        assert lvl != null;
        return lvl.get(id);
    }

    private ScopeLevel findScopeOf(String id) {
        for (ScopeLevel lvl : scope) {
            if (lvl.contains(id))
                return lvl;
        }

        return null;
    }

}