package VBAObfuscator.Morphs;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public interface Morph {

    public String morph(ParseTree program, CommonTokenStream tokens);

    public String getDescription();

}
