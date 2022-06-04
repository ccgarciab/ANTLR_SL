package Visitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

public class SLVisitorImpl<T> extends SLBaseVisitor<T> {

    HashMap<String,Object> values = new HashMap<>();

    @Override public T visitPotencia(SLParser.PotenciaContext ctx) {
        Double base = (Double) visitAcceso(ctx.acceso(0));
        Double potencia = 1.0;
        int i = 1;
        while (ctx.acceso(i)!=null){
            potencia *= (Float) visitAcceso(ctx.acceso(i));
            i++;
        }
        Double result = 1.0;
        Double cero = 0.0;
        if(base > 0 && potencia==0){
            return (T)result;
        }
        else if(base == 0 && potencia>=1){
            return (T) cero;
        }
        else{
            i = 1;
            while (i<potencia){
                result *= base;
                i++;
            }
            return (T) result;
        }
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
                i++;
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
        List<T> argumentos = new ArrayList<>();
        argumentos.add(visitExpr(ctx.expr(0))) ;
        int i = 1;
        while (ctx.expr(i)!=null){
            argumentos.add(visitExpr(ctx.expr(i)));
            i++;
        }
        return (T) argumentos;
    }

    @Override public T visitRetorno(SLParser.RetornoContext ctx){
        if (ctx.RETORNA()!= null){
            return visitExpr(ctx.expr());
        }else{
            return null;
        }
    }

     @Override public T visitExpr_signo(SLParser.Expr_signoContext ctx) {

        if (ctx.OP_SUMA().getText().equals("+")){
            return visitExpr_signo(ctx.expr_signo());
        }else{
            Double value = (Double) visitExpr_signo(ctx.expr_signo());
            value = -value;
            return (T)value;
        }
    }
    public T visitIdentificador(TerminalNode ctx){
        String name = ctx.getText();
        T value;
        if ((value = (T)values.get(name)) == null) {
            int line = ctx.getSymbol().getLine();
            int col = ctx.getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + name + "\" no fue declarada.\n", line, col);
            System.exit(-1);
            return null;
        } else {
            return value;
        }
    }

}
