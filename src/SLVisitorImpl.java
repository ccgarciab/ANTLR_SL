import java.util.HashMap;

import org.antlr.v4.runtime.tree.TerminalNode;

public class SLVisitorImpl<T> extends SLBaseVisitor<T> {

    HashMap<String,Object> values = new HashMap<>();

    @Override public T visitPotencia(SLParser.PotenciaContext ctx) {

        return visitChildren(ctx);
    }

    @Override public T visitAcceso(SLParser.AccesoContext ctx){
        visitPrimario(ctx.primario());
        if(ctx.argumentos() != null){
            int i = 0;
            while (ctx.argumentos(i)!= null){
                visitArgumentos(ctx.argumentos(i));
                i ++;
            }
        } else if (ctx.expr()!= null) {
            int i = 0;
            while (ctx.expr(i)!= null){
                visitExpr(ctx.expr(i));
                i ++;
            }
        }else if (ctx.IDENTIFICADOR() != null){
            int i = 0;
            while (ctx.IDENTIFICADOR(i)!=  null) {
                visitIdentificador(ctx.IDENTIFICADOR(i));
            }
        }
        return null;
    }

    @Override public T visitPrimario(SLParser.PrimarioContext ctx){
        if (ctx.literal() != null) return visitLiteral(ctx.literal());
        else if (ctx.IDENTIFICADOR()!= null) {
            return visitIdentificador(ctx.IDENTIFICADOR());
        }else {
            return visitExpr(ctx.expr());
        }

    }

    @Override public T visitArgumentos(SLParser.ArgumentosContext ctx){
        return null;
    }

    public T visitIdentificador(TerminalNode ctx){
        String name = ctx.getText();
        Object value;
        if ((value = values.get(name)) == null) {
            int line = ctx.getSymbol().getLine();
            int col = ctx.getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + name + "\" no fue declarada.\n", line, col);
            System.exit(-1);
            return null;
        } else {
            return (T) value;
        }
    }
}
