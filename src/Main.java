
import Visitors.SLVisitorImpl;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String [] args) throws Exception{
        SLLexer lexer = new SLLexer(CharStreams.fromFileName("input/entrada.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SLParser parser = new SLParser(tokens);
        ParseTree tree = parser.expr();

        SLVisitorImpl loader = new SLVisitorImpl();
        loader.visit(tree);
    }
}
