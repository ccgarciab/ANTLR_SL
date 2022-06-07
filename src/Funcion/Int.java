package Funcion;

import Tipo.TipoNumerico;
import Valor.Valor;

import java.util.List;

public class Int implements Funcion{
    @Override
    public Valor llamar(List<Valor> argumentos) {
        if(argumentos.size() != 1){
            System.err.println("Numero incorrecto de argumentos: ascii");
            System.exit(1);
            return null;
        }
        Double x = (Double) argumentos.get(0).valor;
        return new Valor(new TipoNumerico(), false, (double) x.intValue());
    }
}
