package Visitors;

import Gen.SLBaseVisitor;

import Funcion.*;
import Gen.SLParser;
import Tipo.*;
import Valor.Valor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompiladorFunciones extends SLBaseVisitor<Map<String, Funcion>>{

    Map<String, Funcion> funciones;
    Map<String, Tipo> tiposGlobales;
    Map<String, Valor> referenciasGlobales;
    EjecutorDeProcedimientos ejecutor;

    public CompiladorFunciones(Map<String, Tipo> tiposGlobales, Map<String, Valor> referenciasGlobales, Map<String, Funcion> funciones){
        this.referenciasGlobales = referenciasGlobales;
        this.tiposGlobales = tiposGlobales;
        this.funciones = funciones;
        this.ejecutor = new EjecutorDeProcedimientos(referenciasGlobales, new HashMap<>(), this.funciones );
    }

    @Override
    public Map<String, Funcion> visitInicial(SLParser.InicialContext ctx){

        for(SLParser.ProcedimientoContext procCtx: ctx.procedimiento()){
            this.registrarProcedimiento(procCtx);
        }

        return this.funciones;
    }

    public void registrarProcedimiento(SLParser.ProcedimientoContext ctx) {
        Map<String, Tipo> tiposLocales = new HashMap<>();
        Map<String, Valor> referenciasLocales = new HashMap<>();
        if(ctx.funcion() != null){
            this.registrarFuncion(ctx.funcion(), tiposLocales, referenciasLocales);
        }
        else {
            this.registrarSubrutina(ctx.subrutina(), tiposLocales, referenciasLocales);
        }
    }

    public void registrarFuncion(SLParser.FuncionContext ctx, Map<String, Tipo> tiposLocales, Map<String, Valor> referenciasLocales) {

        List<Tipo> listaTiposParams = new ArrayList<>();
        Encabezado encabezado = this.visitarEncabezado(ctx.encabezado(), tiposLocales, referenciasLocales);
        for(Params params:  encabezado.listaParams){
            Tipo tipoParams = params.tipo;
            for(String nombreParam: params.nombres){
                Valor valor = new Valor(tipoParams, false, tipoParams.valorPorDefecto(false));
                referenciasLocales.put(nombreParam, valor);
                listaTiposParams.add(tipoParams);
            }
        }
        Tipo tipoRetorno = this.procesarTipo(ctx.tipo(),tiposLocales, referenciasLocales);
        this.procesarDeclaraciones(ctx.declaraciones(), referenciasLocales);
        FuncionDefinida funcion = new FuncionDefinida(tipoRetorno, listaTiposParams, referenciasLocales, this.referenciasGlobales, this.funciones, ctx.sentencias(), ctx.retorno());
        this.funciones.put(encabezado.nombre, funcion);
    }

    public void registrarSubrutina(SLParser.SubrutinaContext ctx, Map<String, Tipo> tiposLocales, Map<String, Valor> referenciasLocales) {

        List<Tipo> listaTiposParams = new ArrayList<>();
        Encabezado encabezado = this.visitarEncabezado(ctx.encabezado(), tiposLocales, referenciasLocales);
        for(Params params:  encabezado.listaParams){
            Tipo tipoParams = params.tipo;
            for(String nombreParam: params.nombres){
                Valor valor = new Valor(tipoParams, false, tipoParams.valorPorDefecto(false));
                referenciasLocales.put(nombreParam, valor);
                listaTiposParams.add(tipoParams);
            }
        }
        this.procesarDeclaraciones(ctx.declaraciones(), referenciasLocales);
        SubrutinaDefinida subritina = new SubrutinaDefinida(listaTiposParams, referenciasLocales, this.referenciasGlobales, this.funciones, ctx.sentencias());
        this.funciones.put(encabezado.nombre, subritina);
    }

    public void procesarDeclaraciones(SLParser.DeclaracionesContext ctx, Map<String, Valor> referenciasLocales) {

        Map<String, Tipo> tiposLocales = new HashMap<>();
        if(ctx == null || ctx.children == null){
            return;
        }
        for(ParseTree child: ctx.children){
            if(child instanceof SLParser.TiposContext){
                SLParser.TiposContext tiposCtx = (SLParser.TiposContext) child;
                for(SLParser.Decl_tipoContext declCtx: tiposCtx.decl_tipo()){
                    String id = declCtx.IDENTIFICADOR().getText();
                    Tipo tipo = this.procesarTipo(declCtx.tipo(), tiposLocales, referenciasLocales);
                    tiposLocales.put(id, tipo);
                }
            } else if (child instanceof SLParser.VarsContext) {
                SLParser.VarsContext varsCtx = (SLParser.VarsContext) child;
                for(SLParser.Decl_varsContext declCtx: varsCtx.decl_vars()){
                    Tipo tipo = this.procesarTipo(declCtx.tipo(), tiposLocales, referenciasLocales);
                    for(TerminalNode idNode: declCtx.IDENTIFICADOR()){
                        referenciasLocales.put(idNode.getText(), tipo.valorPorDefecto(false));
                    }
                }
            } else if (child instanceof SLParser.ConstsContext) {
                SLParser.ConstsContext constsCtx = (SLParser.ConstsContext) child;
                for(SLParser.Decl_constContext declCtx: constsCtx.decl_const()){
                    String id = declCtx.IDENTIFICADOR(0).getText();
                    if(declCtx.literal() != null){
                        Valor valor = this.ejecutor.visitLiteral(declCtx.literal());
                        referenciasLocales.put(id, valor);
                    } else {
                        Valor valorOrig = this.getReferencia(declCtx.IDENTIFICADOR(1).getText(), referenciasLocales);
                        //TODO: fix lack of clonning
                        Valor valorNuevo = new Valor(valorOrig.tipo, true, valorOrig);
                        referenciasLocales.put(id, valorNuevo);
                    }
                }
            }
        }
    }

    public Tipo procesarTipo(SLParser.TipoContext ctx, Map<String, Tipo> tiposLocales, Map<String, Valor> referenciasLocales){

        if(ctx.tipo_escalar() != null){
            SLParser.Tipo_escalarContext escalarCtx = ctx.tipo_escalar();
            return procesarTipoEscalar(escalarCtx);
        } else if (ctx.tipo_vector() != null) {
            SLParser.Tipo_vectorContext vecCtx = ctx.tipo_vector();
            SLParser.Tipo_escalarContext escalarCtx = vecCtx.tipo_escalar();
            Tipo tipoEscalar = procesarTipoEscalar(escalarCtx);
            Integer dimension;
            if(vecCtx.IDENTIFICADOR() != null){
                String idDim = vecCtx.IDENTIFICADOR().getText();
                dimension = (Integer) this.getReferencia(idDim, referenciasLocales).valor;
            } else if (vecCtx.LITERAL_NUMERICO() != null) {
                dimension = Integer.parseInt(vecCtx.LITERAL_NUMERICO().getText());
            } else {
                dimension = -1;
            }
            return new TipoVector(dimension, tipoEscalar);
        } else if (ctx.tipo_matriz() != null) {
            SLParser.Tipo_matrizContext matCtx = ctx.tipo_matriz();
            SLParser.Tipo_escalarContext escalarCtx = matCtx.tipo_escalar();
            Tipo tipoEscalar = procesarTipoEscalar(escalarCtx);
            ArrayList<Integer> dimensiones = new ArrayList<>();
            if(matCtx.dimensiones_fijas() != null){
                SLParser.Dimensiones_fijasContext dimFijaCtx = matCtx.dimensiones_fijas();
                for(SLParser.DimensionContext dimCtx: dimFijaCtx.dimension()){
                    if(dimCtx.LITERAL_NUMERICO() != null){
                        dimensiones.add(Integer.parseInt(dimCtx.LITERAL_NUMERICO().getText()));
                    } else {
                        Valor dimValor = this.getReferencia(dimCtx.IDENTIFICADOR().getText(), referenciasLocales);
                        dimensiones.add((Integer) dimValor.valor);
                    }
                }
            }else {
                SLParser.Dimensiones_variablesContext dimVarCtx = matCtx.dimensiones_variables();
                for(SLParser.DimensionContext dimCtx: dimVarCtx.dimension()){
                    if(dimCtx.LITERAL_NUMERICO() != null){
                        dimensiones.add(Integer.parseInt(dimCtx.LITERAL_NUMERICO().getText()));
                    } else {
                        Valor dimValor = this.getReferencia(dimCtx.IDENTIFICADOR().getText(), referenciasLocales);
                        dimensiones.add((Integer) dimValor.valor);
                    }
                }
            }
            return new TipoMatriz(dimensiones, tipoEscalar);
        } else {
            String id = ctx.IDENTIFICADOR().getText();
            return this.getTipo(id, tiposLocales);
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

    public Encabezado visitarEncabezado(SLParser.EncabezadoContext ctx, Map<String, Tipo> tiposLocales, Map<String, Valor> referenciasLocales){
        return new Encabezado(
          ctx.IDENTIFICADOR().getText(),
          this.visitarParamsList(ctx.lista_parametros(), tiposLocales, referenciasLocales)
        );
    }

    public List<Params> visitarParamsList(SLParser.Lista_parametrosContext ctx,  Map<String, Tipo> tiposLocales, Map<String, Valor> referenciasLocales){
        ArrayList<Params> listaParams = new ArrayList<>();
        if (ctx == null){
            return listaParams;
        }
        for(SLParser.ParametrosContext paramCtx: ctx.parametros()){
            listaParams.add(this.visitarParams(paramCtx, tiposLocales, referenciasLocales));
        }
        return listaParams;
    }

    public Params visitarParams(SLParser.ParametrosContext ctx,  Map<String, Tipo> tiposLocales, Map<String, Valor> referenciasLocales){
        Tipo tipo = this.procesarTipo(ctx.tipo(), tiposLocales, referenciasLocales);
        ArrayList<String> nombres = new ArrayList<>();
        for(TerminalNode idNode: ctx.IDENTIFICADOR()){
            nombres.add(idNode.getText());
        }
        return new Params(nombres, tipo);
    }

    public Valor getReferencia(String id, Map<String, Valor> referenciasLocales){
        if(referenciasLocales.containsKey(id)){
            return referenciasLocales.get(id);
        }
        return referenciasGlobales.get(id);
    }

    public Tipo getTipo(String id, Map<String, Tipo> tiposLocales){
        if(tiposLocales.containsKey(id)){
            return tiposLocales.get(id);
        }
        return tiposGlobales.get(id);
    }

    class Params {
        List<String> nombres;
        Tipo tipo;

        Params(List<String> nombres, Tipo tipo){
            this.nombres = nombres;
            this.tipo = tipo;
        }
    }

    class Encabezado {
        String nombre;
        List<Params> listaParams;

        Encabezado(String nombre, List<Params> listaParams){
            this.listaParams = listaParams;
            this.nombre = nombre;
        }
    }
}
