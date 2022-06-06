package Funcion;

import java.util.List;

import Tipo.TipoCadena;
import Valor.Valor;

public class Imprimir implements Funcion{

    public Imprimir() {
    }

    @Override public Valor llamar(List<Valor> argumentos) {
        for (Valor argumento:argumentos) {
            System.out.print(argumento.valor);
        }
        return null;
    }
}
