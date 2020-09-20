package VBAObfuscator.Morphs.IDMorph;

import VBAObfuscator.Morphs.Morph;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class IDMorph implements Morph {

    public String morph(ParseTree program, CommonTokenStream tokens)
    {
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();

        Scope scope = new Scope();

        /* Collect global identifiers so the order of declaration doesnt matter on the second pass */
        GlobalsListener firstMorph = new GlobalsListener(rewriter, scope);
        walker.walk(firstMorph, program);

        /* second pass */
        IDMorphListener secondMorph = new IDMorphListener(rewriter, scope);
        walker.walk(secondMorph, program);

        return rewriter.getText();
    }

    public String getDescription()
    {
        return "renaming variables and functions identifiers for random strings";
    }

}
