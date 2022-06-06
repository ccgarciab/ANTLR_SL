package Funcion;

import Tipo.TipoCadena;
import Tipo.TipoLogico;
import Tipo.TipoNumerico;
import Valor.Valor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class Leer implements Funcion{

    public Leer(){
    }
    @Override
    public Valor llamar(List<Valor> argumentos) {
        InputStream stdin = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input = br.readLine();
            String[] inputs = input.split("\\s+");
            if(inputs.length != argumentos.size()){
                System.err.println("Numero incorrecto de valores al leer de consola");
                System.exit(1);
            }
            for(int i = 0; i < argumentos.size(); ++i){
                Valor arg = argumentos.get(i);
                String in = inputs[i];
                if(arg.tipo instanceof TipoNumerico){
                    arg.valor = Integer.parseInt(in);
                } else if (arg.tipo instanceof TipoLogico) {
                    switch (in){
                        case "SI":
                        case "TRUE":
                            arg.valor = true;
                            break;
                        case "NO":
                        case "FALSE":
                            arg.valor = false;
                        default:
                            System.err.println("Valor booleano esperado");
                            System.exit(1);
                    }
                } else if (arg.tipo instanceof TipoCadena) {
                    arg.valor = in;
                }
                else {
                    System.err.println("Tipo no soportado por funcion leer");
                    System.exit(1);
                }
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }
        return null;
    }
}
