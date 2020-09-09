package VBAObfuscator.Morphs;

import VBAObfuscator.parser.vbaBaseListener;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class MorphListener extends vbaBaseListener {

    protected TokenStreamRewriter rewriter;

    public MorphListener(TokenStreamRewriter rewriter)
    {
        this.rewriter = rewriter;
    }
}
