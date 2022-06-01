package Tipo;

public class TipoCadena implements Tipo {

    public TipoCadena(){}

    public boolean igualA(Tipo otro) {
        return otro instanceof TipoCadena;
    }
}
