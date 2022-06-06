package Visitors;

import Gen.SLBaseVisitor;
import Gen.SLParser;
import Valor.Valor;
import Funcion.Funcion;
import Tipo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EjecutorDeProcedimientos extends SLBaseVisitor<Valor> {

    Map<String, Valor> referenciasGlobales;
    Map<String, Valor> referenciasLocales;
    Map<String, Funcion> funciones;

    public EjecutorDeProcedimientos(Map<String, Valor> referenciasGlobales,
            Map<String, Valor> referenciasLocales, Map<String, Funcion> funciones) {
        this.referenciasGlobales = referenciasGlobales;
        this.referenciasLocales = referenciasLocales;
        this.funciones = funciones;
    }

    @Override
    public Valor visitSentencia(SLParser.SentenciaContext ctx){
        if(ctx.expr() != null){
            return this.visitExpr(ctx.expr());
        }

        if(ctx.si() != null){
            this.visitSi(ctx.si());
        } else if(ctx.mientras() != null){
            this.visitMientras(ctx.mientras());
        } else if (ctx.repetir_hasta() != null) {
            this.visitRepetir_hasta(ctx.repetir_hasta());
        } else if (ctx.desde() != null) {
            this.visitDesde(ctx.desde());
        } else if (ctx.eval() != null) {
            this.visitEval(ctx.eval());
        } else if (ctx.asignacion() != null) {
            this.visitAsignacion(ctx.asignacion());
        }
        return null;
    }

    @Override public Valor visitMientras(SLParser.MientrasContext ctx) {
        while ((Boolean)visitCondicion(ctx.condicion()).valor){
            for (SLParser.SentenciaContext sentencia : ctx.sentencias().sentencia()) {
                visitSentencia(sentencia);
            }
        }
        return null;
    }
    @Override public Valor visitRepetir_hasta(SLParser.Repetir_hastaContext ctx) {
        do {
            for (SLParser.SentenciaContext sentencia : ctx.sentencias().sentencia()) {
                visitSentencia(sentencia);
            }
        } while ((Boolean) visitCondicion(ctx.condicion()).valor);
        return null;
    }
    @Override public Valor visitDesde(SLParser.DesdeContext ctx) {
        Integer inicio, limite, paso;
        String cadena = ctx.IDENTIFICADOR().getText();

        inicio = (Integer) this.visitExpr(ctx.expr(0)).valor;
        limite = (Integer)this.visitExpr(ctx.expr(1)).valor;
        if (this.visitExpr(ctx.expr(2)) != null){
            paso = (Integer)this.visitExpr(ctx.expr(2)).valor;
        }else{
            paso =  1;
        }
        if(paso < 0){
            for (int i = inicio; i >= limite; i+=paso) {
                this.referenciasLocales.put(cadena, new Valor(new TipoNumerico(), false, i));
                for (SLParser.SentenciaContext sentencia : ctx.sentencias().sentencia()) {
                    visitSentencia(sentencia);
                }
            }
            return null;
        }
        for (int i = inicio; i <= limite; i+=paso) {
            this.referenciasLocales.put(cadena, new Valor(new TipoNumerico(), false, i));
            for (SLParser.SentenciaContext sentencia : ctx.sentencias().sentencia()) {
                visitSentencia(sentencia);
            }
        }
        return null;
    }
    @Override public Valor visitSi(SLParser.SiContext ctx) {
        int i = 0;
        for (;i < ctx.condicion().size(); i++) {
            if ((Boolean) visitCondicion(ctx.condicion(i)).valor) {
                visitSentencias(ctx.sentencias(i));
                return null;
            }
        }
        if (i<ctx.sentencias().size()){
            visitSentencias(ctx.sentencias(i));
        }
        return null;
    }

    @Override public Valor visitAsignacion(SLParser.AsignacionContext ctx) {
        String name = ctx.IDENTIFICADOR().getText();
        Valor destino;
        if (this.referenciasLocales.containsKey(name)){
            destino = this.referenciasLocales.get(name);
        }
        else {
            destino = this.referenciasGlobales.get(name);
        }
        if(destino.constante){
            System.err.println("Intento de asignar valor a constante");
            System.exit(1);
            return null;
        }
        Tipo tipo = destino.tipo;
        Valor valor = this.visitExpr(ctx.expr());
        if(!tipo.igualA(valor.tipo)){
            System.err.println("Asignacion a tipos incompatibles");
            System.exit(1);
            return null;
        }
        destino.valor = valor.valor;
        return null;
    }

    @Override public Valor visitEval(SLParser.EvalContext ctx) {
        int i = 0;
        for (;i < ctx.condicion().size(); i++) {
            if ((Boolean) visitCondicion(ctx.condicion(i)).valor) {
                visitSentencias(ctx.sentencias(i));
                return null;
            }
        }
        if (i<ctx.sentencias().size()){
            visitSentencias(ctx.sentencias(i));
        }
        return null;
    }

    @Override public Valor visitCondicion(SLParser.CondicionContext ctx) {
        return visitExpr(ctx.expr());
    }

    @Override public Valor visitSentencias(SLParser.SentenciasContext ctx) {
        for (SLParser.SentenciaContext sentencia : ctx.sentencia()) {
            visitSentencia(sentencia);
        }
        return null;
    }

    @Override public Valor visitPotencia(SLParser.PotenciaContext ctx) {
        if(ctx.acceso().size()==1){
            return visitAcceso(ctx.acceso(0));
        }
        int numAccesos = ctx.acceso().size();
        Integer exponente = (Integer) this.visitAcceso(ctx.acceso(numAccesos - 1)).valor;
        for(int i = numAccesos - 2; i >= 0; --i){
            Integer base = (Integer) this.visitAcceso(ctx.acceso(i)).valor;
            exponente = Math.toIntExact(Math.round(Math.pow(base, exponente))); //TODO: fix by supporting doubles everywhere
        }
        return new Valor(new TipoNumerico(), false, exponente);
    }

    @Override public Valor visitAcceso(SLParser.AccesoContext ctx){
        Valor primario = visitPrimario(ctx.primario());
        if(ctx.argumentos(0) != null){
            List<Valor> argumentos = visitaArgumentos(ctx.argumentos(0));
            Funcion funcion = this.funciones.get((String)primario.valor);
            funcion.llamar(argumentos);
        } else if (ctx.expr(0) != null) {
            Integer indice = (Integer) this.visitExpr(ctx.expr(0)).valor;
            indice -= 1;
            if(primario.tipo.igualA(new TipoCadena())){
                String caracter = ((String) primario.valor).substring(indice, indice + 1);
                return new Valor(new TipoCadena(), false, caracter);
            }
            ArrayList<Valor> vector = (ArrayList<Valor>) primario.valor;
            return vector.get(indice);
        }
        return primario;
    }

    @Override public Valor visitPrimario(SLParser.PrimarioContext ctx){
        if (ctx.literal() != null) return visitLiteral(ctx.literal());
        else if (ctx.IDENTIFICADOR()!= null) {
            if(this.funciones.containsKey(ctx.IDENTIFICADOR().getText())){
                return new Valor(new TipoCadena(), false, ctx.IDENTIFICADOR().getText());
            }
            return visitIdentificador(ctx.IDENTIFICADOR());
        }else {
            return visitExpr(ctx.expr());
        }
    }


    public List<Valor> visitaArgumentos(SLParser.ArgumentosContext ctx){
        List<Valor> argumentos = new ArrayList<>();
        argumentos.add(visitExpr(ctx.expr(0))) ;
        int i = 1;
        while (ctx.expr(i)!=null){
            argumentos.add(visitExpr(ctx.expr(i)));
            i++;
        }
        return  argumentos;
    }

    @Override public Valor visitRetorno(SLParser.RetornoContext ctx){
        return visitExpr(ctx.expr());
    }

    @Override public Valor visitExpr_signo(SLParser.Expr_signoContext ctx) {

        if (ctx.OP_SUMA()!= null && ctx.OP_SUMA().getText().equals("+")){
            return visitExpr_signo(ctx.expr_signo());
        }else if(ctx.OP_SUMA()!= null && ctx.OP_SUMA().getText().equals("-")){
            Valor valor =  visitExpr_signo(ctx.expr_signo());
            double value = (double) valor.valor;
            value = - value;
            valor.valor = value;
            return valor;
        }else{
            return visitPotencia(ctx.potencia());
        }
    }
    public Valor visitIdentificador(TerminalNode ctx){
        String name = ctx.getText();
        if(referenciasLocales.containsKey(name)){
            return referenciasLocales.get(name);
        } else if (referenciasGlobales.containsKey(name)) {
            return referenciasGlobales.get(name);
        }else{
            int line = ctx.getSymbol().getLine();
            int col = ctx.getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + name + "\" no fue declarada.\n", line, col);
            System.exit(-1);
            return null;
        }
    }

    @Override public Valor visitLiteral(SLParser.LiteralContext ctx) {

        if (ctx.LITERAL_NUMERICO() != null){
            return new Valor(new TipoNumerico(), false, Integer.parseInt(ctx.LITERAL_NUMERICO().getText()));
        }
        else if (ctx.LITERAL_CADENA() != null){
            String cadena = this.aplicarEscapes(ctx.LITERAL_CADENA().getText());
            cadena = cadena.substring(1, cadena.length() - 1);
            return new Valor(new TipoCadena(), false, cadena);
        }
        else if (ctx.LITERAL_LOGICO() != null){

            switch (ctx.LITERAL_LOGICO().getText()) {
                case "TRUE":
                case "SI" :
                    return new Valor(new TipoLogico(), false, true);
                default:
                    return new Valor(new TipoLogico(), false, false);
            }
        }
        else {
            return visitLiteral_compuesto(ctx.literal_compuesto());
        }
    }

    private String aplicarEscapes(String text) {

        return text
                .replaceAll("\\\\n", "\n")
                .replaceAll("\\\\t", "\t")
                .replaceAll("\\\\r", "\r")
                .replaceAll("\\\\(.)", "$1");
    }


    @Override public Valor visitLiteral_compuesto(SLParser.Literal_compuestoContext ctx) {
        ArrayList<Valor> argumentos = new ArrayList<>();
        for (SLParser.ExprContext expr : ctx.expr()) {
            argumentos.add(visitExpr(expr));
        }
        return new Valor(new TipoVector(argumentos.size(), argumentos.get(0).tipo), false, argumentos);
    }

    @Override public Valor visitExpr(SLParser.ExprContext ctx) {
        return visitDisyuncion(ctx.disyuncion());
    }

    @Override public Valor visitDisyuncion(SLParser.DisyuncionContext ctx) {
        if(ctx.conjuncion().size()==1){
            return visitConjuncion(ctx.conjuncion(0));
        }
        boolean bool = false;
        for (int i = 0; i<ctx.conjuncion().size(); i ++){
            bool = bool || (Boolean) visitConjuncion(ctx.conjuncion(i)).valor;
        }
        return new Valor(new TipoLogico(), false, bool);
    }

    @Override public Valor visitConjuncion(SLParser.ConjuncionContext ctx) {
        if(ctx.negacion().size()==1){
            return this.visitNegacion(ctx.negacion(0));
        }
        boolean bool = true;
        for (int i = 0; i<ctx.negacion().size(); i ++){
            bool = bool && (Boolean) this.visitNegacion(ctx.negacion(i)).valor;
        }
        return new Valor(new TipoLogico(), false, bool);
    }

    @Override
    public Valor visitNegacion(SLParser.NegacionContext ctx) {
        if(ctx.comparacion() != null){
            return this.visitComparacion(ctx.comparacion());
        }
        Valor valor = this.visitNegacion(ctx.negacion());
        return new Valor(new TipoLogico(), false, valor.valor);
    }

    public Valor visitComparacion(SLParser.ComparacionContext ctx){

        if(ctx.termino().size() == 1){
            return this.visitTermino(ctx.termino(0));
        }
        Valor val1 = this.visitTermino(ctx.termino(0));
        Valor val2 = this.visitTermino(ctx.termino(1));
        boolean result = true;
        Tipo tipoCadena = new TipoCadena();
        Tipo tipoNumerico = new TipoNumerico();
        switch (ctx.OP_COMPARACION(0).getText()){
            case "==":
                result = val1.valor.equals(val2.valor);
                break;
            case "<>":
                result = !val1.valor.equals(val2.valor);
                break;
            case "<":
                if(val1.tipo.igualA(tipoCadena)){
                    result = ((String) val1.valor).compareTo(((String) val2.valor)) < 0;
                } else if (val1.tipo.igualA(tipoNumerico)) {
                    result = ((Integer) val1.valor) < ((Integer) val2.valor);
                } else {
                    System.err.println("Comparando valores no ordenados");
                    System.exit(1);
                    return null;
                }
                break;
            case "<=":
                if(val1.tipo.igualA(tipoCadena)){
                    result = ((String) val1.valor).compareTo(((String) val2.valor)) <= 0;
                } else if (val1.tipo.igualA(tipoNumerico)) {
                    result = ((Integer) val1.valor) <= ((Integer) val2.valor);
                } else {
                    System.err.println("Comparando valores no ordenados");
                    System.exit(1);
                    return null;
                }
                break;
            case ">":
                if(val1.tipo.igualA(tipoCadena)){
                    result = ((String) val1.valor).compareTo(((String) val2.valor)) > 0;
                } else if (val1.tipo.igualA(tipoNumerico)) {
                    result = ((Integer) val1.valor) > ((Integer) val2.valor);
                } else {
                    System.err.println("Comparando valores no ordenados");
                    System.exit(1);
                    return null;
                }
                break;
            case ">=":
                if(val1.tipo.igualA(tipoCadena)){
                    result = ((String) val1.valor).compareTo(((String) val2.valor)) >= 0;
                } else if (val1.tipo.igualA(tipoNumerico)) {
                    result = ((Integer) val1.valor) >= ((Integer) val2.valor);
                } else {
                    System.err.println("Comparando valores no ordenados");
                    System.exit(1);
                    return null;
                }
                break;
        }
        for (int i = 1; i < ctx.OP_COMPARACION().size(); ++i){
            switch (ctx.OP_COMPARACION(i).getText()){
                case "==":
                    result = this.visitTermino(ctx.termino(i+1)).valor.equals(result);
                    break;
                case "<>":
                    result = !this.visitTermino(ctx.termino(i+1)).valor.equals(result);
                    break;
                default:
                    System.err.println("Comparacion de tipos no compatibles");
                    System.exit(1);
                    return null;
            }
        }
        return new Valor(new TipoLogico(), false, result);
    }

    public Valor visitTermino(SLParser.TerminoContext ctx) {
        if(ctx.factor().size() == 1){
            return this.visitFactor(ctx.factor(0));
        }

        Integer result = (Integer) this.visitFactor(ctx.factor(0)).valor;
        for(int i = 0; i < ctx.OP_SUMA().size(); ++i){
            Integer siguiente = (Integer) this.visitFactor(ctx.factor(i+1)).valor;
            switch (ctx.OP_SUMA(i).getText()){
                case "+":
                    result += siguiente;
                    break;
                case "-":
                    result -= siguiente;
                    break;
            }
        }
        return new Valor(new TipoNumerico(), false, result);
    }

    public Valor visitFactor(SLParser.FactorContext ctx) {
        if(ctx.expr_signo().size() == 1){
            return this.visitExpr_signo(ctx.expr_signo(0));
        }

        Integer result = (Integer) this.visitExpr_signo(ctx.expr_signo(0)).valor;
        for(int i = 0; i < ctx.OP_MUL().size(); ++i){
            Integer siguiente = (Integer) this.visitExpr_signo(ctx.expr_signo(i+1)).valor;
            switch (ctx.OP_MUL(i).getText()){
                case "*":
                    result *= siguiente;
                    break;
                case "/":
                    result /= siguiente;
                    break;
                case "%":
                    result %= siguiente;
                    break;
            }
        }
        return new Valor(new TipoNumerico(), false, result);
    }
}
