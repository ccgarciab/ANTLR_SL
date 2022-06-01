package Visitors;

import Gen.SLBaseVisitor;
import Gen.SLParser;
import Valor.Valor;

public class EjecutorDeProcedimientos extends SLBaseVisitor<Valor> {

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

    @Override
    public Valor visitSi(SLParser.SiContext ctx) {

        return null;
    }
}
