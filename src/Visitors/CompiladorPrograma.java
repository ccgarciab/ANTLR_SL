package Visitors;

import Funcion.Funcion;
import Funcion.SubrutinaDefinida;
import Funcion.*;
import Gen.SLBaseVisitor;
import Gen.SLParser;
import Tipo.*;
import Valor.Valor;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CompiladorPrograma extends SLBaseVisitor<Void> {

    public Map<String, Tipo> tiposGlobales;
    public Map<String, Valor> referenciasGlobales;
    public EjecutorDeProcedimientos ejecutor;
    public Map<String, Funcion> funciones = new HashMap<>();


    public CompiladorPrograma(){
        this.referenciasGlobales = new HashMap<>();
        this.tiposGlobales = new HashMap<>();
        this.ejecutor = new EjecutorDeProcedimientos(this.referenciasGlobales, this.referenciasGlobales, new HashMap<>());
    }

    @Override
    public Void visitInicial(SLParser.InicialContext ctx) {

        this.registrarPrincipal(ctx.programa().programa_principal(), funciones);
        return null;
    }

    public void registrarPrincipal(SLParser.Programa_principalContext ctx, Map<String, Funcion> funciones) {

        procesarDeclaraciones(ctx.declaraciones());
        SLParser.SentenciasContext sentencias = ctx.cuerpo_principal().sentencias();

        Funcion principal = new SubrutinaDefinida(
                new ArrayList<>(),
                new ArrayList<>(),
                referenciasGlobales,
                referenciasGlobales,
                funciones,
                sentencias
                );

        funciones.put("$main", principal);
        funciones.put("imprimir", new Imprimir());
        funciones.put("leer", new Leer());
        funciones.put("ascii", new Ascii());
    }

    public void procesarDeclaraciones(SLParser.DeclaracionesContext ctx) {
        if(ctx == null || ctx.children== null) {
            return;
        }
        for(ParseTree child: ctx.children){
            if(child instanceof SLParser.TiposContext){
                SLParser.TiposContext tiposCtx = (SLParser.TiposContext) child;
                for(SLParser.Decl_tipoContext declCtx: tiposCtx.decl_tipo()){
                    String id = declCtx.IDENTIFICADOR().getText();
                    Tipo tipo = this.procesarTipo(declCtx.tipo());
                    this.tiposGlobales.put(id, tipo);
                }
            } else if (child instanceof SLParser.VarsContext) {
                SLParser.VarsContext varsCtx = (SLParser.VarsContext) child;
                for(SLParser.Decl_varsContext declCtx: varsCtx.decl_vars()){
                    Tipo tipo = this.procesarTipo(declCtx.tipo());
                    for(TerminalNode idNode: declCtx.IDENTIFICADOR()){
                        this.referenciasGlobales.put(idNode.getText(), tipo.valorPorDefecto(false));
                    }
                }
            } else if (child instanceof SLParser.ConstsContext) {
                SLParser.ConstsContext constsCtx = (SLParser.ConstsContext) child;
                for(SLParser.Decl_constContext declCtx: constsCtx.decl_const()){
                    String id = declCtx.IDENTIFICADOR(0).getText();
                    if(declCtx.literal() != null){
                        Valor valor = this.ejecutor.visitLiteral(declCtx.literal());
                        this.referenciasGlobales.put(id, valor);
                    } else {
                        Valor valorOrig = this.referenciasGlobales.get(declCtx.IDENTIFICADOR(1).getText());
                        //TODO: fix lack of clonning
                        Valor valorNuevo = new Valor(valorOrig.tipo, true, valorOrig);
                        this.referenciasGlobales.put(id, valorNuevo);
                    }
                }
            }
        }
    }

    public Tipo procesarTipo(SLParser.TipoContext ctx){

        if(ctx.tipo_escalar() != null){
            SLParser.Tipo_escalarContext escalarCtx = ctx.tipo_escalar();
            return procesarTipoEscalar(escalarCtx);
        } else if (ctx.tipo_vector() != null) {
            SLParser.Tipo_vectorContext vecCtx = ctx.tipo_vector();
            SLParser.Tipo_escalarContext escalarCtx = vecCtx.tipo_escalar();
            Tipo tipoEscalar = procesarTipoEscalar(escalarCtx);
            Double dimension;
            if(vecCtx.IDENTIFICADOR() != null){
                String idDim = vecCtx.IDENTIFICADOR().getText();
                dimension = (Double) this.referenciasGlobales.get(idDim).valor;
            } else if (vecCtx.LITERAL_NUMERICO() != null) {
                dimension = Double.parseDouble(vecCtx.LITERAL_NUMERICO().getText());
            } else {
                dimension = -1.0;
            }
            return new TipoVector(dimension, tipoEscalar);
        } else if (ctx.tipo_matriz() != null) {
            SLParser.Tipo_matrizContext matCtx = ctx.tipo_matriz();
            SLParser.Tipo_escalarContext escalarCtx = matCtx.tipo_escalar();
            Tipo tipoEscalar = procesarTipoEscalar(escalarCtx);
            ArrayList<Double> dimensiones = new ArrayList<>();
            if(matCtx.dimensiones_fijas() != null){
                SLParser.Dimensiones_fijasContext dimFijaCtx = matCtx.dimensiones_fijas();
                for(SLParser.DimensionContext dimCtx: dimFijaCtx.dimension()){
                    if(dimCtx.LITERAL_NUMERICO() != null){
                        dimensiones.add(Double.parseDouble(dimCtx.LITERAL_NUMERICO().getText()));
                    } else {
                        Valor dimValor = referenciasGlobales.get(dimCtx.IDENTIFICADOR().getText());
                        dimensiones.add((Double) dimValor.valor);
                    }
                }
            }else{
                SLParser.Dimensiones_variablesContext dimVarCtx = matCtx.dimensiones_variables();
                for(SLParser.DimensionContext dimCtx: dimVarCtx.dimension()){
                    if(dimCtx.LITERAL_NUMERICO() != null){
                        dimensiones.add(Double.parseDouble(dimCtx.LITERAL_NUMERICO().getText()));
                    } else {
                        Valor dimValor = referenciasGlobales.get(dimCtx.IDENTIFICADOR().getText());
                        dimensiones.add((Double) dimValor.valor);
                    }
                }
            }
            return new TipoMatriz(dimensiones, tipoEscalar);
        } else {
            String id = ctx.IDENTIFICADOR().getText();
            return this.tiposGlobales.get(id);
        }
    }

    public Tipo procesarTipoEscalar(SLParser.Tipo_escalarContext ctx){
        switch (ctx.getText()){
            case "numerico":
                return new TipoNumerico();
            case "logico":
                return new TipoLogico();
            default:
                return new TipoCadena();
        }
    }
}
