package VBAObfuscator.Morphs.LiteralEncoderMorph;

import VBAObfuscator.Morphs.MorphListener;
import VBAObfuscator.parser.vbaParser;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigInteger;
import java.util.List;
import java.util.Random;

public class LiteralEncoderMorphListener extends MorphListener {

    // https://www.vbforums.com/showthread.php?466942-Hex-and-String-Conversions
    private static String vbaHex2Str = "\nPublic Function HexToString(ByVal HexToStr As String) As String\n" +
            "Dim strTemp   As String\n" +
            "Dim strReturn As String\n" +
            "Dim I         As Long\n" +
            "    For I = 1 To Len(HexToStr) Step 2\n" +
            "        strTemp = Chr$(Val(\"&H\" & Mid$(HexToStr, I, 2)))\n" +
            "        strReturn = strReturn & strTemp\n" +
            "    Next I\n" +
            "    HexToString = strReturn\n" +
            "End Function\n";

    public LiteralEncoderMorphListener(TokenStreamRewriter rewriter) {
        super(rewriter);
    }

    @Override
    public void enterModuleBody(vbaParser.ModuleBodyContext ctx) {
        List<vbaParser.ModuleBodyElementContext> moduleElements = ctx.moduleBodyElement();

        Random r = new Random();
        rewriter.insertAfter(moduleElements.get(r.nextInt(moduleElements.size())).getStop(), vbaHex2Str);
    }

    @Override
    public void enterVsLiteral(vbaParser.VsLiteralContext ctx) {
        if(ctx.literal().SHORTLITERAL() != null)
            replaceShortLiteral(ctx.literal().getToken(vbaParser.SHORTLITERAL, 0));
        else if(ctx.literal().FALSE() != null)
            replaceBooleanLiteral(ctx.literal().getToken(vbaParser.FALSE, 0));
        else if(ctx.literal().TRUE() != null)
            replaceBooleanLiteral(ctx.literal().getToken(vbaParser.TRUE, 0));
        else if(ctx.literal().STRINGLITERAL() != null)
            replaceStringLiteral(ctx.literal().getToken(vbaParser.STRINGLITERAL, 0));
    }

    private void replaceShortLiteral(TerminalNode shortLiteral)
    {
        short n = Short.parseShort(shortLiteral.getText());
        rewriter.replace(shortLiteral.getSymbol(), encodeShort(n));
    }

    private void replaceBooleanLiteral(TerminalNode booleanLiteral)
    {
        boolean b = Boolean.parseBoolean(booleanLiteral.getText());
        rewriter.replace(booleanLiteral.getSymbol(), encodeBoolean(b));
    }

    private void replaceStringLiteral(TerminalNode stringLiteral)
    {
        String hex = String.format("%x", new BigInteger(1, stringLiteral.getText().getBytes()));
        rewriter.replace(stringLiteral.getSymbol(), "HexToString(\"" + hex + "\")");
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
