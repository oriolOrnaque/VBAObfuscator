package VBAObfuscator.Morphs.UselessCodeMorph;

import VBAObfuscator.Morphs.Morph;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class UselessCodeMorph implements Morph {

    public String morph(ParseTree program, CommonTokenStream tokens)
    {
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();

        UselessCodeMorphListener morph = new UselessCodeMorphListener(rewriter);

        walker.walk(morph, program);

        return rewriter.getText();
    }

    public String getDescription()
    {
        return "adds useless code to distract";
    }
}
