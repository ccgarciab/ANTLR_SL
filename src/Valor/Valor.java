package Valor;

import Tipo.Tipo;

public class Valor {

    public Tipo tipo;
    public boolean constante;
    public Object valor;


    public Valor(Tipo tipo, boolean constante, Object valor){
        this.tipo = tipo;
        this.constante = constante;
        this.valor = valor;
    }
}
