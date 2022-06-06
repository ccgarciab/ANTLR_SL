
import java.util.List;
import java.util.Map;

import Funcion.Funcion;
import Gen.SLLexer;
import Gen.SLParser;
import Visitors.CompiladorFunciones;
import Visitors.CompiladorPrograma;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String [] args) throws Exception{
        SLLexer lexer = new SLLexer(CharStreams.fromFileName("input/entrada.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SLParser parser = new SLParser(tokens);
        ParseTree tree = parser.inicial();

        CompiladorPrograma compiladorPrograma = new CompiladorPrograma();
        compiladorPrograma.visit(tree);
        CompiladorFunciones compiladorFunciones = new CompiladorFunciones(compiladorPrograma.tiposGlobales, compiladorPrograma.referenciasGlobales, compiladorPrograma.funciones);
        Map<String, Funcion> funcionMap = compiladorFunciones.visit(tree);
        funcionMap.get("$main").llamar(List.of());

    }
}
