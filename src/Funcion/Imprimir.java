package Funcion;

import java.text.DecimalFormat;
import java.util.List;

import Tipo.TipoNumerico;
import Valor.Valor;

public class Imprimir implements Funcion{

    private final DecimalFormat formatter;

    public Imprimir() {
        this.formatter = new DecimalFormat("#");
    }

    @Override public Valor llamar(List<Valor> argumentos) {
        TipoNumerico tipoNumerico = new TipoNumerico();
        for (Valor argumento:argumentos) {
            if(argumento.tipo.igualA(tipoNumerico)){
                Double x = (Double) argumento.valor;
                if(x % 1 == 0){
                    System.out.print(formatter.format(x));
                    continue;
                }
            }
            System.out.print(argumento.valor);
        }
        System.out.print('\n');
        return null;
    }
}
