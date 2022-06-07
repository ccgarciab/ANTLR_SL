package Funcion;

import Tipo.TipoCadena;
import Valor.Valor;

import java.util.List;

public class Ascii implements Funcion{

    @Override
    public Valor llamar(List<Valor> argumentos) {
        if(argumentos.size() != 1){
            System.err.println("Numero incorrecto de argumentos: ascii");
            System.exit(1);
            return null;
        }
        Double x = (Double) argumentos.get(0).valor;
        if(x < 0 || x > 127 ||  x % 1 != 0){
            System.err.println("Argumento debe ser entero entre 0 y 127");
            System.exit(1);
            return null;
        }
        char[] resultado = {(char) x.intValue()};
        return new Valor(new TipoCadena(), false, new String(resultado));
    }
}
