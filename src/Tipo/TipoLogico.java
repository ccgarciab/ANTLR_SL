package Tipo;

import Valor.Valor;

public class TipoLogico implements Tipo {

    public TipoLogico(){}

    public boolean igualA(Tipo otro) {
        return otro instanceof TipoLogico;
    }

    public Valor valorPorDefecto(boolean constante){

        return new Valor(this, constante, new Boolean(false));
    }
}
