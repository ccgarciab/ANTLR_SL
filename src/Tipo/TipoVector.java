package Tipo;

import Valor.Valor;

import java.util.ArrayList;

public class TipoVector implements Tipo {

    Integer dimension;
    Tipo tipoInterno;

    public TipoVector(Integer dimension, Tipo tipoInterno){
        this.dimension = dimension;
        this.tipoInterno = tipoInterno;
    }

    public boolean igualA(Tipo otro) {
        if (!(otro instanceof TipoVector)){
            return false;
        }
        TipoVector o = (TipoVector) otro;
        return o.dimension == this.dimension && o.tipoInterno.igualA(this.tipoInterno);
    }

    public Valor valorPorDefecto(boolean constante){

        ArrayList<Valor> vector = new ArrayList<>();
        return new Valor(this, constante, vector);
    }
}
