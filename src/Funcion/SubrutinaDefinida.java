package Funcion;

import Gen.SLParser;
import Tipo.Tipo;
import Valor.Valor;

import java.util.List;
import java.util.Map;

public class SubrutinaDefinida implements Funcion{

    List<Tipo> parametros;
    Map<String, Valor> referenciasLocales;
    Map<String, Valor> referenciasGlobales;
    Map<String, Funcion> funciones;
    SLParser.SentenciasContext sentencias;

    public SubrutinaDefinida(List<Tipo> params,
                             Map<String, Valor> refsLocales,
                             Map<String, Valor> refsGlobales,
                             Map<String, Funcion> funcs,
                             SLParser.SentenciasContext sentencias){
        this.parametros = params;
        this.referenciasLocales = refsLocales;
        this.referenciasGlobales = refsGlobales;
        this.funciones = funcs;
        this.sentencias = sentencias;
    }

    @Override
    public Valor llamar(List<Valor> argumentos) {
        if(argumentos.size() != this.parametros.size()){
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < argumentos.size(); ++i){
            Tipo a = this.parametros.get(i);
            Tipo b = argumentos.get(i).tipo;

            if(!a.igualA(b)){
                throw new IllegalArgumentException();
            }
        }

        //Visitor.EjecutorDeSentencias ejecutor = new Visitor.EjecutorDeSentencias();

        return null;
    }
}
