package VBAObfuscator.Morphs.LiteralEncoderMorph;

import VBAObfuscator.Morphs.IDMorph.IDMorphListener;
import VBAObfuscator.Morphs.Morph;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class LiteralEncoderMorph implements Morph {
    @Override
    public String morph(ParseTree program, CommonTokenStream tokens) {
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();

        LiteralEncoderMorphListener morph = new LiteralEncoderMorphListener(rewriter);

        walker.walk(morph, program);

        return rewriter.getText();
    }

    @Override
    public String getDescription() {
        return "encode literal tokens to be unreadable at plain sight";
    }
}
