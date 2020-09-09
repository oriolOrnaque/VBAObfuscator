package VBAObfuscator;

import VBAObfuscator.Morphs.IDMorph.IDMorph;
import VBAObfuscator.Morphs.Morph;
import VBAObfuscator.parser.vbaLexer;
import VBAObfuscator.parser.vbaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class VBAObfuscator {

    private final List<Morph> morphs;

    public VBAObfuscator()
    {
        this.morphs = new LinkedList<>();
        this.morphs.add(new IDMorph());
    }

    public void obfuscate(String src)
    {
        boolean firstRead = false;

        for(Morph morph: morphs)
        {
            System.out.println("Applying morph: " + morph.getDescription());
            try {
                CharStream cs = fromFileName(src);

                vbaLexer lexer = new vbaLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                vbaParser parser = new vbaParser(tokens);
                ParseTree root = parser.startRule();

                String morphed = morph.morph(root, tokens);

                BufferedWriter writer = new BufferedWriter(new FileWriter(src));
                writer.write(morphed);
                writer.close();
            }
            catch(IOException e)
            {
                System.out.println("Exception");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("Obfuscation terminated");
    }

}
