package Visitors;

import Funcion.Funcion;
import Funcion.FuncionDefinida;
import Gen.SLBaseVisitor;
import Gen.SLParser;
import Tipo.Tipo;
import Valor.Valor;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CompiladorPrograma extends SLBaseVisitor<Map<String, Funcion>> {

    final private Map<String, Funcion> funciones;

    public CompiladorPrograma(){
        this.funciones = new HashMap<>();
    }

    @Override
    public Map<String, Funcion> visitInicial(SLParser.InicialContext ctx) {

        this.registrarPrincipal(ctx.programa().programa_principal());
        return this.funciones;
    }

    public void registrarPrincipal(SLParser.Programa_principalContext ctx) {

        ResultadoDeclaracion declaracionesGlobales =  procesarDeclaraciones(ctx.declaraciones());
        SLParser.SentenciasContext sentencias = ctx.cuerpo_principal().sentencias();

        Funcion principal = new FuncionDefinida(
                new ArrayList<>(),
                declaracionesGlobales.referencias,
                declaracionesGlobales.referencias,
                funciones,
                sentencias
                );

        funciones.put("$main", principal);
    }

    public ResultadoDeclaracion procesarDeclaraciones(SLParser.DeclaracionesContext ctx) {

        Map<String, Tipo> tipos = new HashMap<>();
        Map<String, Valor> referencias = new HashMap<>();

        for(ParseTree child: ctx.children){
            if(child instanceof SLParser.TiposContext){
                //TODO: Implement reading and storing type aliases
            } else if (child instanceof SLParser.VarsContext) {
                //TODO: Implement reading and storing variable bindings
            } else if (child instanceof SLParser.ConstsContext) {
                //TODO: Implement reading and storing constant bindings
            }
        }

        return new ResultadoDeclaracion(tipos, referencias);
    }

    static class ResultadoDeclaracion {

        Map<String, Tipo> tipos;
        Map<String, Valor> referencias;

        ResultadoDeclaracion(Map<String, Tipo> tipos, Map<String, Valor> referencias){
            this.tipos = tipos;
            this.referencias = referencias;
        }
    }
}
