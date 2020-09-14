package VBAObfuscator.Morphs.LiteralEncoderMorph;

import VBAObfuscator.Morphs.MorphListener;
import VBAObfuscator.parser.vbaParser;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Random;

public class LiteralEncoderMorphListener extends MorphListener {

    public LiteralEncoderMorphListener(TokenStreamRewriter rewriter) {
        super(rewriter);
    }

    @Override
    public void enterVsLiteral(vbaParser.VsLiteralContext ctx) {
        if(ctx.literal().SHORTLITERAL() != null)
            replaceShortLiteral(ctx.literal().getToken(vbaParser.SHORTLITERAL, 0));
        else if(ctx.literal().FALSE() != null)
            replaceFalseLiteral(ctx.literal().getToken(vbaParser.FALSE, 0));
        else if(ctx.literal().TRUE() != null)
            replaceTrueLiteral(ctx.literal().getToken(vbaParser.TRUE, 0));
        else if(ctx.literal().STRINGLITERAL() != null)
            replaceStringLiteral(ctx.literal().getToken(vbaParser.STRINGLITERAL, 0));
    }

    private void replaceShortLiteral(TerminalNode shortLiteral)
    {
        short n = Short.parseShort(shortLiteral.getText());
        rewriter.replace(shortLiteral.getSymbol(), encodeShort(n));
    }

    private void replaceFalseLiteral(TerminalNode falseLiteral)
    {
        boolean b = Boolean.parseBoolean(falseLiteral.getText());
        rewriter.replace(falseLiteral.getSymbol(), encodeBoolean(b));
    }

    private void replaceTrueLiteral(TerminalNode trueLiteral)
    {
        boolean b = Boolean.parseBoolean(trueLiteral.getText());
        rewriter.replace(trueLiteral.getSymbol(), encodeBoolean(b));
    }

    private void replaceStringLiteral(TerminalNode stringLiteral)
    {

    }

    private String encodeBoolean(boolean b)
    {
        StringBuilder builder = new StringBuilder();

        if(!b)
            builder.append("((True And (False Or (False Or ((True) Xor ((True)) Xor Not (False Xor Not True)))) And (False Xor Not True)))");
        else
            builder.append("True And False Or False Or True Xor (True Xor Not False Xor Not True) And False Xor Not True");

        return builder.toString();
    }

    private String encodeShort(short n)
    {
        StringBuilder builder = new StringBuilder();
        Random r = new Random();
        short n2 = 0;
        builder.append(0);

        while(n2 != n)
        {
            int i = r.nextInt((Math.abs(n) - Math.abs(n2)) + 1);
            if(n > 0)
            {
                builder.append(" + ");
                n2 += i;
            }
            else
            {
                builder.append(" - ");
                n2 -= i;
            }
            builder.append(String.valueOf(i));
        }

        return builder.toString();
    }

}
