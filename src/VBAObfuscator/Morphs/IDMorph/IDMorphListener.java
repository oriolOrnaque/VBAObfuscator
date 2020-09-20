package VBAObfuscator.Morphs.IDMorph;

import VBAObfuscator.CodeGenerator.CodeGenerator;
import VBAObfuscator.Morphs.MorphListener;
import VBAObfuscator.parser.vbaParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Random;

public class IDMorphListener extends MorphListener {

    private final Scope scope;
    private final CodeGenerator gen;

    public IDMorphListener(TokenStreamRewriter rewriter)
    {
        super(rewriter);

        this.scope = new Scope();
        this.scope.pushLevel();
        this.gen = new CodeGenerator();
    }

    public IDMorphListener(TokenStreamRewriter rewriter, Scope scope)
    {
        super(rewriter);

        this.scope = scope;
        this.gen = new CodeGenerator();
    }

    /*@Override public void enterModule(vbaParser.ModuleContext ctx)
    {
        this.scope.pushLevel();
    }

    @Override public void exitModule(vbaParser.ModuleContext ctx)
    {
        this.scope.popLevel();
    }*/

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

    @Override public void enterFunctionStmt(vbaParser.FunctionStmtContext ctx)
    {
        TerminalNode terminalNode = ctx.ambiguousIdentifier().getToken(vbaParser.IDENTIFIER, 0);
        Token token = terminalNode.getSymbol();

        replaceID(token);

        this.scope.pushLevel();

        for(vbaParser.ArgContext arg: ctx.argList().arg())
        {
            replaceID(arg.ambiguousIdentifier().getToken(vbaParser.IDENTIFIER, 0).getSymbol());
        }
    }

    @Override public void exitFunctionStmt(vbaParser.FunctionStmtContext ctx)
    {
        this.scope.popLevel();
    }

    @Override public void enterForNextStmt(vbaParser.ForNextStmtContext ctx)
    {
        for(vbaParser.AmbiguousIdentifierContext id: ctx.ambiguousIdentifier())
            replaceID(id.getToken(vbaParser.IDENTIFIER, 0).getSymbol());
    }

    @Override public void enterVariableSubStmt(vbaParser.VariableSubStmtContext ctx)
    {
        TerminalNode terminalNode = ctx.ambiguousIdentifier().getToken(vbaParser.IDENTIFIER, 0);
        Token token = terminalNode.getSymbol();

        replaceID(token);
    }

    @Override public void enterICS_S_VariableOrProcedureCall(vbaParser.ICS_S_VariableOrProcedureCallContext ctx)
    {
        if(ctx.ambiguousIdentifier().ambiguousKeyword(0) == null)
        {
            TerminalNode terminalNode = ctx.ambiguousIdentifier().getToken(vbaParser.IDENTIFIER, 0);
            Token token = terminalNode.getSymbol();

            replaceID(token);
        }
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
