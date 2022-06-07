package Tipo;

import Valor.Valor;

public interface Tipo {

    boolean igualA(Tipo otro);

    Valor valorPorDefecto(boolean constante);
}
