package VBAObfuscator.Morphs.UselessCodeMorph;

import VBAObfuscator.CodeGenerator.CodeGenerator;
import VBAObfuscator.Morphs.MorphListener;
import VBAObfuscator.parser.vbaParser;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.util.List;

public class UselessCodeMorphListener extends MorphListener {

    private final CodeGenerator gen;

    public UselessCodeMorphListener(TokenStreamRewriter rewriter) {
        super(rewriter);

        this.gen = new CodeGenerator();
    }

    @Override
    public void enterModuleBody(vbaParser.ModuleBodyContext ctx) {
        List<vbaParser.ModuleBodyElementContext> moduleElements = ctx.moduleBodyElement();

        for(vbaParser.ModuleBodyElementContext ele: moduleElements)
        {
            rewriter.insertBefore(ele.getStart(), gen.generateUselessSub());
            rewriter.insertAfter(ele.getStop(), gen.generateUselessSub());
        }
    }
}
