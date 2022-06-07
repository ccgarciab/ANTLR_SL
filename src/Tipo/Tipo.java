package Tipo;

import Valor.Valor;

public interface Tipo {

    public abstract boolean igualA(Tipo otro);

    public abstract Valor valorPorDefecto(boolean constante);
}
