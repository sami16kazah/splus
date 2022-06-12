import Classes.Splus;
import ast.visitor.BaseVisitor;
import gen.HTMLLexer;
import gen.HTMLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        try {
            String source = "samples/samples.txt";
            CharStream cs = fromFileName(source);
            HTMLLexer lexer = new HTMLLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            HTMLParser parser = new HTMLParser(token);
            boolean check = true;


            ParseTree tree = parser.splus();

            Splus doc = (Splus) new BaseVisitor().visit(tree);

            //System.out.println(doc);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
