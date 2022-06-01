package Tipo;

import java.util.List;

public class TipoMatriz implements Tipo {

    List<Integer> dimensiones;
    Tipo tipoInterno;

    public TipoMatriz(List<Integer> dimensiones, Tipo tipoInterno){
        this.dimensiones = dimensiones;
        this.tipoInterno = tipoInterno;
    }

    public boolean igualA(Tipo otro){
        if(!(otro instanceof TipoMatriz)){
            return false;
        }

        TipoMatriz o = (TipoMatriz) otro;

        if(this.dimensiones.size() != o.dimensiones.size()){
            return false;
        }

        for(int i = 0; i < o.dimensiones.size(); ++i){
            if(o.dimensiones.get(i) != this.dimensiones.get(i)){
                return false;
            }
        }

        return o.tipoInterno.igualA(this.tipoInterno);
    }
}
