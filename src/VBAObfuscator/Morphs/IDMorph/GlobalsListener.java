package VBAObfuscator.Morphs.IDMorph;

import VBAObfuscator.CodeGenerator.CodeGenerator;
import VBAObfuscator.Morphs.MorphListener;
import VBAObfuscator.parser.vbaParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GlobalsListener extends MorphListener {

    private final Scope scope;
    private final CodeGenerator gen;

    public GlobalsListener(TokenStreamRewriter rewriter, Scope scope)
    {
        super(rewriter);

        this.scope = scope;
        this.gen = new CodeGenerator();
    }

    @Override public void enterModule(vbaParser.ModuleContext ctx)
    {
        this.scope.pushLevel();
    }

    @Override public void enterSubStmt(vbaParser.SubStmtContext ctx) {
        TerminalNode terminalNode = ctx.ambiguousIdentifier().getToken(vbaParser.IDENTIFIER, 0);
        Token token = terminalNode.getSymbol();

        replaceID(token);
    }

    @Override public void enterFunctionStmt(vbaParser.FunctionStmtContext ctx)
    {
        TerminalNode terminalNode = ctx.ambiguousIdentifier().getToken(vbaParser.IDENTIFIER, 0);
        Token token = terminalNode.getSymbol();

        replaceID(token);
    }

    private void replaceID(Token token)
    {
        String qwe = this.gen.generateRandomIdentifier();
        if(this.scope.inScope(token.getText()))
        {
            qwe = this.scope.get(token.getText());
        }
        else
            this.scope.insert(token.getText(), qwe);

        rewriter.replace(token, qwe);
    }
}
