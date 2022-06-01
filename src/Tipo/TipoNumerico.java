package Tipo;

public class TipoNumerico implements Tipo{

    public TipoNumerico(){}

    public boolean igualA(Tipo otro) {
        return otro instanceof TipoNumerico;
    }
}
