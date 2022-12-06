package gals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Semantico implements Constants {

    private final String FLOAT = "float64";
    private final String INT = "int64";
    private final String STRING = "string";
    private final String CHAR = "char";
    private final String BOOLEAN = "bool";

    private final String ERRO_TIPOS_ARITMETICA = "tipos incompatíveis em expressão aritmética";
    private final String ERRO_TIPOS_RELACIONAL = "tipos incompatíveis em expressão relacional";
    private final String ERRO_TIPOS_LOGICA = "tipos incompatíveis em expressão lógica";
    private final String ERRO_TIPO_LOGICA = "tipo incompatível em expressão lógica";


    private String operador = "";
    public StringBuilder codigo = new StringBuilder("");
    private Stack<String> pilhaTipos = new Stack<>();
    private String tipoVar = "";
    private List<String> listaIds = new ArrayList<>();
    private Stack<String> pilhaRotulos = new Stack<>();
    private HashMap<String, String> tabelaSimbolos = new HashMap<>();

    public StringBuilder getCodigo() {
        return codigo;
    }

    public void executeAction(int action, Token token) throws SemanticError {
        switch(action){
            case 1: this.acao01(); break;
            case 2: this.acao02(); break;
            case 3: this.acao03(); break;
            case 4: this.acao04(); break;
            case 5: this.acao05(token); break;
            case 6: this.acao06(token); break;
            case 7: this.acao07(); break;
            case 8: this.acao08(); break;
            case 9: this.acao09(token); break;
            case 10: this.acao10(); break;
            case 11: this.acao11(); break;
            case 12: this.acao12(); break;
            case 13: this.acao13(); break;
            case 14: this.acao14(); break;
            case 15: this.acao15(); break;
            case 16: this.acao16(); break;
            case 17: this.acao17(); break;
            case 18: this.acao18(); break;
            case 19: this.acao19(); break;
            case 20: this.acao20(); break;
            case 21: this.acao21(token); break;
            case 22: this.acao22(token); break;
            case 24: this.acao24(); break;
            case 25: this.acao25(); break;
            case 26: this.acao26(); break;
            case 27: this.acao27(); break;
            case 28: this.acao28(); break;
            case 30: this.acao30(token); break;
            case 31: this.acao31(); break;
            case 32: this.acao32(token); break;
            case 33: this.acao33(token); break;
            case 34: this.acao34(); break;
            case 35: this.acao35(); break;
        }
        System.out.println("Ação #" + action + ", Token: " + token);
    }

    private void acao01() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if((!tipo1.equals(FLOAT) && !tipo1.equals(INT)) || (!tipo2.equals(FLOAT) && !tipo2.equals(INT))){
            throw new SemanticError(ERRO_TIPOS_ARITMETICA);
        }

        if(tipo1.equals(FLOAT) || tipo2.equals(FLOAT)) {
            pilhaTipos.push(FLOAT);
        }else{
            pilhaTipos.push(INT);
        }
        codigo.append("\nadd");
    }

    private void acao02() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if((!tipo1.equals(FLOAT) && !tipo1.equals(INT)) || (!tipo2.equals(FLOAT) && !tipo2.equals(INT))){
            throw new SemanticError(ERRO_TIPOS_ARITMETICA);
        }

        if(tipo1.equals(FLOAT) || tipo2.equals(FLOAT)) {
            pilhaTipos.push(FLOAT);
        }else{
            pilhaTipos.push(INT);
        }
        codigo.append("\nsub");
    }

    private void acao03() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if((!tipo1.equals(FLOAT) && !tipo1.equals(INT)) || (!tipo2.equals(FLOAT) && !tipo2.equals(INT))){
            throw new SemanticError(ERRO_TIPOS_ARITMETICA);
        }

        if(tipo1.equals(FLOAT) || tipo2.equals(FLOAT)) {
            pilhaTipos.push(FLOAT);
        }else{
            pilhaTipos.push(INT);
        }

        codigo.append("\nmul");
    }

    private void acao04() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if((!tipo1.equals(FLOAT) && !tipo1.equals(INT)) || (!tipo2.equals(FLOAT) && !tipo2.equals(INT))){
            throw new SemanticError(ERRO_TIPOS_ARITMETICA);
        }

        pilhaTipos.push(FLOAT);
        codigo.append("\ndiv");
    }

    private void acao05(Token token) {
        pilhaTipos.push(INT);
        codigo.append("\nldc.i8 ").append(converterInt(token.getLexeme()));
        codigo.append("\nconv.r8");
    }

    private void acao06(Token token) {
        pilhaTipos.push(FLOAT);
        codigo.append("\nldc.r8 ").append(converterFloat(token.getLexeme()));
    }

    private void acao07() throws SemanticError {
        String tipo = pilhaTipos.peek();
        if(!tipo.equals(FLOAT) && !tipo.equals(INT)){
            throw new SemanticError(ERRO_TIPOS_ARITMETICA);
        }
    }

    private void acao08() throws SemanticError {
        String tipo = pilhaTipos.peek();
        if(!tipo.equals(FLOAT) && !tipo.equals(INT)){
            throw new SemanticError(ERRO_TIPOS_ARITMETICA);
        }

        codigo.append("\nldc.i8 -1");
        codigo.append("\nconv.r8");
        codigo.append("\nmul");
    }

    private void acao09(Token token){
        this.operador = token.getLexeme();
    }

    private void acao10() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if(!(((tipo1.equals(FLOAT) || tipo1.equals(INT)) && (tipo2.equals(FLOAT) || tipo2.equals(INT))) || (tipo1.equals(STRING) && tipo2.equals(STRING)))){
            throw new SemanticError(ERRO_TIPOS_RELACIONAL);
        }

        pilhaTipos.push(BOOLEAN);

        switch (this.operador){
            case ">": codigo.append("\ncgt"); break;
            case "<": codigo.append("\nclt"); break;
            case "==": codigo.append("\nceq"); break;
            case "!=": codigo.append("\nceq").append("\nldc.i4.0").append("\nceq"); break;
        }
    }

    private void acao11(){
        this.pilhaTipos.push(BOOLEAN);
        codigo.append("\nldc.i4.1");
    }

    private void acao12(){
        this.pilhaTipos.push(BOOLEAN);
        codigo.append("\nldc.i4.0");
    }

    private void acao13() throws SemanticError {
        if(!pilhaTipos.peek().equals(BOOLEAN)){
            throw new SemanticError(ERRO_TIPO_LOGICA);
        }

        codigo.append("\nldc.i4.1");
        codigo.append("\nxor");
    }

    private void acao14() {
        String tipo = this.pilhaTipos.pop();
        if (tipo.equals(INT)) {
            codigo.append("\nconv.i8");
        }
        if(tipo.equals(CHAR)){
            tipo = STRING;
        }
        codigo.append("\ncall void [mscorlib]System.Console::Write(").append(tipo).append(")");
    }

    private void acao15(){
        codigo.append(".assembly extern mscorlib {}\n" +
                "    .assembly _codigo_objeto{}\n" +
                "    .module   _codigo_objeto.exe\n" +
                "\n" +
                "    .class public _UNICA{ \n" +
                "    .method static public void _principal() {\n" +
                "      .entrypoint \n");
    }

    private void acao16(){
        codigo.append("\nret\n" +
                "       }\n" +
                "    }\n");
    }

    private void acao17(){
        codigo.append("\nldstr \"\\n\"");
        codigo.append("\ncall void [mscorlib]System.Console::Write(string)");
    }

    private void acao18() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if(!tipo1.equals(BOOLEAN) || !tipo2.equals(BOOLEAN)){
            throw new SemanticError(ERRO_TIPO_LOGICA);
        }

        pilhaTipos.push(BOOLEAN);
        codigo.append("\nand");
    }

    private void acao19() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if(!tipo1.equals(BOOLEAN) || !tipo2.equals(BOOLEAN)){
            throw new SemanticError(ERRO_TIPO_LOGICA);
        }

        pilhaTipos.push(BOOLEAN);
        codigo.append("\nor");
    }

    private void acao20() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if(!tipo1.equals(INT) || !tipo2.equals(INT)){
            throw new SemanticError(ERRO_TIPOS_ARITMETICA);
        }

        pilhaTipos.push(INT);
        codigo.append("\ndiv");
    }

    public void acao21(Token token){
        pilhaTipos.push(STRING);
        String string = "";
        switch (token.getLexeme()){
            case "\\n": string = "\"\\n\""; break;
            case "\\s": string = " "; break;
            case "\\t": string = "\"\\t\""; break;
        }

        codigo.append("\nldstr ").append(string);
    }

    private void acao22(Token token){
        pilhaTipos.push(STRING);
        codigo.append("\nldstr ").append(token.getLexeme());
    }

    private void acao24(){
        String rotulo = novoRotulo();
        codigo.append("\nbrfalse ").append(rotulo);
        pilhaRotulos.push(rotulo);
    }

    private void acao25(){
        String rotulo = novoRotulo();
        codigo.append("\nbr ").append(rotulo);
        codigo.append("\n").append(pilhaRotulos.pop()).append(":");
        pilhaRotulos.push(rotulo);
    }

    private void acao26(){
        codigo.append("\n").append(pilhaRotulos.pop()).append(":");
    }

    private void acao27(){
        String rotulo = novoRotulo();
        codigo.append("\n").append(rotulo).append(":");
        pilhaRotulos.push(rotulo);
    }

    private void acao28(){
        String rotulo = pilhaRotulos.pop();
        codigo.append("\nbrtrue ").append(rotulo);
    }

    private void acao30(Token token){
        switch (token.getLexeme()){
            case "int": tipoVar = INT; break;
            case "float": tipoVar = FLOAT; break;
            case "char": tipoVar = CHAR; break;
            case "string": tipoVar = STRING; break;
            case "boolean": tipoVar = BOOLEAN; break;
        }
    }

    private void acao31(){
        listaIds.forEach(id -> {
            String tipoVar = this.tipoVar.equals(CHAR) ? STRING : this.tipoVar;
            codigo.append("\n.locals (").append(tipoVar).append(" ").append(id).append(")");
            tabelaSimbolos.put(id, tipoVar);
        });

        listaIds.clear();
    }

    private void acao32(Token token){
        listaIds.add(token.getLexeme());
    }

    private void acao33(Token token){
        String id = token.getLexeme();
        pilhaTipos.push(tabelaSimbolos.get(id));

        codigo.append("\nldloc ").append(id);
        if(tabelaSimbolos.get(id).equals(INT)){
            codigo.append("\nconv.r8");
        }
    }

    private void acao34(){
        String id = listaIds.get(0);
        String tipo = pilhaTipos.pop();

        if(tabelaSimbolos.get(id).equals(INT)){
            codigo.append("\nconv.i8");
        }
        codigo.append("\nstloc ").append(id);
    }

    private void acao35(){
        listaIds.forEach(id -> {
            String tipo = tabelaSimbolos.get(id);
            String classe = "";

            switch (tipo){
                case INT: classe = "Int64";break;
                case FLOAT: classe = "Double";break;
                case BOOLEAN: classe = "Boolean";break;
                case CHAR:
                case STRING: classe = "Console";break;
            }

            codigo.append("\ncall string [mscorlib]System.Console::ReadLine()");
            codigo.append("\ncall ").append(tipo).append(" [mscorlib]System.").append(classe).append("::Parse(string)");
            codigo.append("\nstloc ").append(id);
        });

        listaIds.clear();
    }

    private String converterInt(String numero){
        double resultado = Double.parseDouble(numero.split("d")[0]);
        if(numero.contains("d")){
            resultado = resultado * (Math.pow(10, Integer.parseInt(numero.split("d")[1])));
        }

        return String.valueOf((int) resultado);
    }

    private String converterFloat(String numero){
        double resultado = Double.parseDouble(numero.split("d")[0]);
        if(numero.contains("d")){
            resultado = resultado * (Math.pow(10, Integer.parseInt(numero.split("d")[1])));
        }

        return String.valueOf(resultado);
    }

    private String novoRotulo(){
        return "rotulo_" + (pilhaRotulos.size() + 1);
    }
}
