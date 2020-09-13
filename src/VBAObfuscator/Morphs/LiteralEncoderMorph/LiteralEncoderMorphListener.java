package VBAObfuscator.Morphs.LiteralEncoderMorph;

import VBAObfuscator.Morphs.MorphListener;
import VBAObfuscator.parser.vbaParser;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LiteralEncoderMorphListener extends MorphListener {

    public LiteralEncoderMorphListener(TokenStreamRewriter rewriter) {
        super(rewriter);
    }

    @Override
    public void enterVsLiteral(vbaParser.VsLiteralContext ctx) {
        if(ctx.literal().SHORTLITERAL() != null)
            encodeShortLiteral(ctx.literal().getToken(vbaParser.SHORTLITERAL, 0));
    }

    private void encodeShortLiteral(TerminalNode shortLiteral)
    {
        short n = Short.parseShort(shortLiteral.getText());
        rewriter.replace(shortLiteral.getSymbol(), shortLiteral.getText().replace("\n", "") + " + 1 - 3 + 2");
    }

}
