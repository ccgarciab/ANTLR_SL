package Tipo;

public class TipoLogico implements Tipo {

    public TipoLogico(){}

    public boolean igualA(Tipo otro) {
        return otro instanceof TipoLogico;
    }
}
