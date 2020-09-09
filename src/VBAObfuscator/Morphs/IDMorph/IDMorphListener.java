package VBAObfuscator.Morphs.IDMorph;

import VBAObfuscator.Morphs.MorphListener;
import VBAObfuscator.parser.vbaParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Random;

public class IDMorphListener extends MorphListener {

    private final Scope scope;

    public IDMorphListener(TokenStreamRewriter rewriter)
    {
        super(rewriter);

        this.scope = new Scope();
    }

    @Override public void enterModule(vbaParser.ModuleContext ctx)
    {
        this.scope.pushLevel();
    }

    @Override public void exitModule(vbaParser.ModuleContext ctx)
    {
        this.scope.popLevel();
    }

    @Override public void enterSubStmt(vbaParser.SubStmtContext ctx) {
        TerminalNode terminalNode = ctx.ambiguousIdentifier().getToken(vbaParser.IDENTIFIER, 0);
        Token token = terminalNode.getSymbol();

        replaceID(token);

        this.scope.pushLevel();
    }

    @Override public void exitSubStmt(vbaParser.SubStmtContext ctx)
    {
        this.scope.popLevel();
    }

    @Override public void enterVariableSubStmt(vbaParser.VariableSubStmtContext ctx)
    {
        TerminalNode terminalNode = ctx.ambiguousIdentifier().getToken(vbaParser.IDENTIFIER, 0);
        Token token = terminalNode.getSymbol();

        replaceID(token);
    }

    @Override public void enterICS_S_VariableOrProcedureCall(vbaParser.ICS_S_VariableOrProcedureCallContext ctx)
    {
        TerminalNode terminalNode = ctx.ambiguousIdentifier().getToken(vbaParser.IDENTIFIER, 0);
        Token token = terminalNode.getSymbol();

        replaceID(token);
    }

    private void replaceID(Token token)
    {
        String qwe = generateRandomIdentifier();
        if(this.scope.inScope(token.getText()))
            qwe = this.scope.get(token.getText());
        else
            this.scope.insert(token.getText(), qwe);

        rewriter.replace(token, qwe);
    }

    /* TODO: Abstract in another class RandomIdentifier */
    private String generateRandomIdentifier()
    {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

}
