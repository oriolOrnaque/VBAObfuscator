package VBAObfuscator;

import VBAObfuscator.Morphs.IDMorph.IDMorph;
import VBAObfuscator.Morphs.LiteralEncoderMorph.LiteralEncoderMorph;
import VBAObfuscator.Morphs.Morph;
import VBAObfuscator.Morphs.UselessCodeMorph.UselessCodeMorph;
import VBAObfuscator.parser.vbaLexer;
import VBAObfuscator.parser.vbaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromString;

public class VBAObfuscator {

    private final List<Morph> morphs;

    public VBAObfuscator()
    {
        this.morphs = new LinkedList<>();
        this.morphs.add(new UselessCodeMorph());
        this.morphs.add(new LiteralEncoderMorph());
        this.morphs.add(new IDMorph());
    }

    public void obfuscate(String src)
    {
        try
        {
            CharStream cs = fromFileName(src);
            boolean firstRead = true;
            String source = "";

            for(Morph morph: morphs)
            {
                System.out.println("Applying morph: " + morph.getDescription());
                if(!firstRead)
                    cs = fromString(source);

                vbaLexer lexer = new vbaLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                vbaParser parser = new vbaParser(tokens);
                ParseTree tree = parser.startRule();

                source = morph.morph(tree, tokens);

                firstRead = false;
            }

            String[] splits = src.split("\\.");
            String output = splits[0].concat("_obfuscated.").concat(splits[1]);

            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            writer.write(source);
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }


        System.out.println("Obfuscation terminated");
    }

}
