package Tipo;

import Valor.Valor;

public class TipoCadena implements Tipo {

    public TipoCadena(){}

    public boolean igualA(Tipo otro) {
        return otro instanceof TipoCadena;
    }

    public Valor valorPorDefecto(boolean constate){

        return new Valor(this, constate, new String());
    }
}
