package Visitors;

import Gen.SLBaseVisitor;
import Gen.SLParser;
import Valor.Valor;
import Funcion.Funcion;
import Tipo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EjecutorDeProcedimientos extends SLBaseVisitor<Valor> {

    Map<String, Valor> referenciasGlobales;
    Map<String, Valor> referenciasLocales;
    Map<String, Funcion> funciones;

    @Override
    public Valor visitSentencia(SLParser.SentenciaContext ctx){
        if(ctx.expr() != null){
            return this.visitExpr(ctx.expr());
        }

        if(ctx.si() != null){
            this.visitSi(ctx.si());
        } else if(ctx.mientras() != null){
            this.visitMientras(ctx.mientras());
        } else if (ctx.repetir_hasta() != null) {
            this.visitRepetir_hasta(ctx.repetir_hasta());
        } else if (ctx.desde() != null) {
            this.visitDesde(ctx.desde());
        } else if (ctx.eval() != null) {
            this.visitEval(ctx.eval());
        } else if (ctx.asignacion() != null) {
            this.visitAsignacion(ctx.asignacion());
        }
        return null;
    }

    @Override public Valor visitMientras(SLParser.MientrasContext ctx) {
        while ((Boolean)visitCondicion(ctx.condicion()).valor){
            for (SLParser.SentenciaContext sentencia : ctx.sentencias().sentencia()) {
                visitSentencia(sentencia);
            }
        }
        return null;
    }
    @Override public Valor visitRepetir_hasta(SLParser.Repetir_hastaContext ctx) {
        do {
            for (SLParser.SentenciaContext sentencia : ctx.sentencias().sentencia()) {
                visitSentencia(sentencia);
            }
        } while ((Boolean) visitCondicion(ctx.condicion()).valor);
        return null;
    }
    @Override public Valor visitDesde(SLParser.DesdeContext ctx) {
        Integer inicio, limite, paso;
        String cadena = ctx.IDENTIFICADOR().getText();

        inicio = (Integer) this.visitExpr(ctx.expr(0)).valor;
        limite = (Integer)this.visitExpr(ctx.expr(1)).valor;
        if (this.visitExpr(ctx.expr(2)) != null){
            paso = (Integer)this.visitExpr(ctx.expr(2)).valor;
        }else{
            paso =  1;
        }
        for (int i = inicio; i < limite; i+=paso) {
            this.referenciasLocales.put(cadena, new Valor(new TipoNumerico(), false, i));
            for (SLParser.SentenciaContext sentencia : ctx.sentencias().sentencia()) {
                visitSentencia(sentencia);
            }
        }
        return null;
    }
    @Override public Valor visitSi(SLParser.SiContext ctx) {
        int i = 0;
        for (;i < ctx.condicion().size(); i++) {
            if ((Boolean) visitCondicion(ctx.condicion(i)).valor) {
                visitSentencias(ctx.sentencias(i));
                return null;
            }
        }
        if (i<ctx.sentencias().size()){
            visitSentencias(ctx.sentencias(i));
        }
        return null;
    }

    @Override public Valor visitAsignacion(SLParser.AsignacionContext ctx) {
        String name = ctx.IDENTIFICADOR().getText();
        Tipo tipo;
        if (this.referenciasLocales.containsKey(name)){
            tipo = this.referenciasLocales.get(name).tipo;
        }
        else if (this.referenciasGlobales.containsKey(name)){
            tipo = this.referenciasGlobales.get(name).tipo;
        }
        else {
            tipo = null;
            System.exit(0);
        }
        Valor valor = visitExpr(ctx.expr());
        if (!valor.tipo.igualA(tipo)){
            System.exit(0);
        }
        return null;
    }

    @Override public Valor visitEval(SLParser.EvalContext ctx) {
        int i = 0;
        for (;i < ctx.condicion().size(); i++) {
            if ((Boolean) visitCondicion(ctx.condicion(i)).valor) {
                visitSentencias(ctx.sentencias(i));
                return null;
            }
        }
        if (i<ctx.sentencias().size()){
            visitSentencias(ctx.sentencias(i));
        }
        return null;
    }

    @Override public Valor visitCondicion(SLParser.CondicionContext ctx) {
        return visitExpr(ctx.expr());
    }

    @Override public Valor visitSentencias(SLParser.SentenciasContext ctx) {
        for (SLParser.SentenciaContext sentencia : ctx.sentencia()) {
            visitSentencia(sentencia);
        }
        return null;
    }

    HashMap<String,Object> values = new HashMap<>();

    @Override public Valor visitPotencia(SLParser.PotenciaContext ctx) {
        Valor valor = new Valor(new TipoNumerico(), false, 0);

        Double base = (Double) visitAcceso(ctx.acceso(0)).valor;
        Double potencia = 1.0;
        int i = 1;
        while (ctx.acceso(i)!=null){
            potencia *= (Float) visitAcceso(ctx.acceso(i)).valor;
            i++;
        }
        double result = 1.0;
        double cero = 0.0;
        if(base > 0 && potencia==0){
            valor.valor = result;
        }
        else if(base == 0 && potencia>=1){
            valor.valor = cero;
        }
        else{
            i = 1;
            while (i<potencia){
                result *= base;
                i++;
            }
            return valor;
        }
        return valor;
    }

    @Override public Valor visitAcceso(SLParser.AccesoContext ctx){
        visitPrimario(ctx.primario());
        if(ctx.argumentos() != null){
            int i = 0;
            while (ctx.argumentos(i)!= null){
                List<Valor> argumentos = new ArrayList<>();
                argumentos = visitaArgumentos(ctx.argumentos(i));
                i ++;
            }
            //LLamar a la funcion
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

    @Override public Valor visitPrimario(SLParser.PrimarioContext ctx){
        if (ctx.literal() != null) return visitLiteral(ctx.literal());
        else if (ctx.IDENTIFICADOR()!= null) {
            return visitIdentificador(ctx.IDENTIFICADOR());
        }else {
            return visitExpr(ctx.expr());
        }

    }


    public List<Valor> visitaArgumentos(SLParser.ArgumentosContext ctx){
        List<Valor> argumentos = new ArrayList<>();
        argumentos.add(visitExpr(ctx.expr(0))) ;
        int i = 1;
        while (ctx.expr(i)!=null){
            argumentos.add(visitExpr(ctx.expr(i)));
            i++;
        }
        return  argumentos;
    }

    @Override public Valor visitRetorno(SLParser.RetornoContext ctx){
        if (ctx.RETORNA()!= null){
            return visitExpr(ctx.expr());
        }else{
            return null;
        }
    }

    @Override public Valor visitExpr_signo(SLParser.Expr_signoContext ctx) {

        if (ctx.OP_SUMA().getText().equals("+")){
            return visitExpr_signo(ctx.expr_signo());
        }else if(ctx.OP_SUMA().getText().equals("-")){
            Valor valor =  visitExpr_signo(ctx.expr_signo());
            double value = (double) valor.valor;
            value = - value;
            valor.valor = value;
            return valor;
        }else{
            return visitPotencia(ctx.potencia());
        }
    }
    public Valor visitIdentificador(TerminalNode ctx){
        String name = ctx.getText();
        Valor value;
        if ((value = (Valor)values.get(name)) == null) {
            int line = ctx.getSymbol().getLine();
            int col = ctx.getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + name + "\" no fue declarada.\n", line, col);
            System.exit(-1);
            return null;
        } else {
            return value;
        }
    }

    @Override public Valor visitLiteral(SLParser.LiteralContext ctx) {

        if (ctx.LITERAL_NUMERICO() != null){
            return new Valor(new TipoNumerico(), false, Integer.parseInt(ctx.LITERAL_NUMERICO().getText()));
        }
        else if (ctx.LITERAL_CADENA() != null){
            return new Valor(new TipoCadena(), false, ctx.LITERAL_CADENA().getText());
        }
        else if (ctx.LITERAL_LOGICO() != null){
            return switch (ctx.LITERAL_LOGICO().getText()) {
                case "TRUE", "SI" -> new Valor(new TipoLogico(), false, true);
                default -> new Valor(new TipoLogico(), false, false);
            };

        }
        else {
            return visitLiteral_compuesto(ctx.literal_compuesto());
        }
    }


    @Override public Valor visitLiteral_compuesto(SLParser.Literal_compuestoContext ctx) {
        ArrayList<Valor> argumentos = new ArrayList<>();
        for (SLParser.ExprContext expr : ctx.expr()) {
            argumentos.add(visitExpr(expr));
        }
        return new Valor(new TipoVector(argumentos.size(), argumentos.get(0).tipo), false, argumentos);
    }

    @Override public Valor visitExpr(SLParser.ExprContext ctx) {
        return visitDisyuncion(ctx.disyuncion());
    }

    @Override public Valor visitDisyuncion(SLParser.DisyuncionContext ctx) {
        int i = 0;
        while (ctx.conjuncion(i)!= null){
            visitConjuncion(ctx.conjuncion(i));
        }
        return null;
    }

}
