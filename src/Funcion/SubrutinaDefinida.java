package Funcion;

import Gen.SLParser;
import Tipo.Tipo;
import Valor.Valor;
import Visitors.EjecutorDeProcedimientos;

import java.util.List;
import java.util.Map;

public class SubrutinaDefinida implements Funcion{

    List<Tipo> tiposParametros;
    List<String> nombresParametros;
    Map<String, Valor> referenciasLocales;
    Map<String, Valor> referenciasGlobales;
    Map<String, Funcion> funciones;
    SLParser.SentenciasContext sentencias;

    public SubrutinaDefinida(List<Tipo> tiposParams,
                             List<String> nombresParams,
                             Map<String, Valor> refsLocales,
                             Map<String, Valor> refsGlobales,
                             Map<String, Funcion> funcs,
                             SLParser.SentenciasContext sentencias){
        this.tiposParametros = tiposParams;
        this.nombresParametros = nombresParams;
        this.referenciasLocales = refsLocales;
        this.referenciasGlobales = refsGlobales;
        this.funciones = funcs;
        this.sentencias = sentencias;
    }

    @Override
    public Valor llamar(List<Valor> argumentos) {
        if(argumentos.size() != this.tiposParametros.size()){
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < argumentos.size(); ++i){
            Tipo a = this.tiposParametros.get(i);
            Tipo b = argumentos.get(i).tipo;

            if(!a.igualA(b)){
                throw new IllegalArgumentException();
            }
        }

        for(int i = 0; i < argumentos.size(); ++i){
            String nombre = this.nombresParametros.get(i);
            Valor destino = this.referenciasLocales.get(nombre);
            destino.valor = argumentos.get(i).valor;
        }

        EjecutorDeProcedimientos ejecutor = new EjecutorDeProcedimientos(this.referenciasGlobales, this.referenciasLocales, this.funciones);
        ejecutor.visitSentencias(this.sentencias);
        return null;
    }
}
