package Tipo;

import Valor.Valor;

public class TipoNumerico implements Tipo{

    public TipoNumerico(){}

    public boolean igualA(Tipo otro) {
        return otro instanceof TipoNumerico;
    }

    public Valor valorPorDefecto(boolean constante){

        return new Valor(this, constante, 0);
    }
}
