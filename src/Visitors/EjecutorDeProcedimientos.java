package Visitors;

import Gen.SLBaseVisitor;
import Gen.SLParser;
import Valor.Valor;
import Funcion.Funcion;
import java.util.Map;
import Tipo.*;

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
            for (SLParser.SentenciaContext sentencia : ctx.sentencia()) {
                visitSentencia(sentencia);
            }
        }
        return null;
    }
    @Override public Valor visitRepetir_hasta(SLParser.Repetir_hastaContext ctx) { 
        do {
            for (SLParser.SentenciaContext sentencia : ctx.sentencia()) {
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
        }
        paso =  1;
        for (int i = inicio; i < limite; i+=paso) {
            this.referenciasLocales.put(cadena, new Valor(new TipoNumerico(), false, new Integer(i)));
            for (SLParser.SentenciaContext sentencia : ctx.sentencia()) {
                visitSentencia(sentencia);
            }
        }
        return null;
    }
    @Override public T visitSi(SLParser.SiContext ctx) {
        if ((Boolean) visitCondicion(ctx.condicion()).valor) {
            for (SLParser.SentenciaContext sentencia : ctx.sentencia()) {
                visitSentencias(sentencia);
            }
        } else {
            for (SLParser.SentenciaContext sentencia : ctx.sentencia()) {
                visitSentencias(sentencia);
            }
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
    
    @Override public T visitSentencias(SLParser.SentenciasContext ctx) { 
        for (SLParser.SentenciaContext sentencia : ctx.sentencia()) {
            visitSentencia(sentencia);
        }
        return null;
    }
    
}
