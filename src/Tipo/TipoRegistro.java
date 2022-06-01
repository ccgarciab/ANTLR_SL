package Tipo;

import java.util.List;

public class TipoRegistro implements Tipo{

    List<Tipo> tiposCampos;

    public TipoRegistro(List<Tipo> tiposCampos){
        this.tiposCampos = tiposCampos;
    }

    @Override
    public boolean igualA(Tipo otro) {

        if(!(otro instanceof TipoRegistro)){
            return false;
        }

        TipoRegistro o = (TipoRegistro) otro;

        if(o.tiposCampos.size() != this.tiposCampos.size()){
            return false;
        }

        for(int i = 0; i < o.tiposCampos.size(); ++i){
            Tipo a = o.tiposCampos.get(i);
            Tipo b = this.tiposCampos.get(i);
            if(!a.igualA(b)){
                return false;
            }
        }

        return true;
    }
}
