package Tipo;

public class TipoVector implements Tipo {

    Integer dimension;
    Tipo tipoInterno;

    public TipoVector(Integer dimension, Tipo tipoInterno){
        this.dimension = dimension;
        this.tipoInterno = tipoInterno;
    }

    public boolean igualA(Tipo otro) {
        if (!(otro instanceof TipoCadena)){
            return false;
        }
        TipoVector o = (TipoVector) otro;
        return o.dimension == this.dimension && o.tipoInterno.igualA(this.tipoInterno);
    }
}
