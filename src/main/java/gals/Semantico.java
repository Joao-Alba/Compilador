package gals;

import java.util.Stack;

public class Semantico implements Constants {

    private final String FLOAT = "float64";
    private final String INT = "int64";
    private final String STRING = "string";
    private final String CHAR = "char";


    private String operador = "";
    private StringBuilder codigo = new StringBuilder(".assembly extern mscorlib {}\n" +
            ".assembly teste_e{}\n" +
            ".module teste_e.exe\n" +
            "\n" +
            ".class public teste_e{\n" +
            "  .method static public void _principal(){\n" +
            "   .entrypoint\n");
    private Stack<String> pilhaTipos;

    public void executeAction(int action, Token token) throws SemanticError {
        System.out.println("Ação #" + action + ", Token: " + token);
    }

    private void acao01() throws SemanticError {
        String tipo1 = pilhaTipos.pop();
        String tipo2 = pilhaTipos.pop();

        if((!tipo1.equals(FLOAT) && !tipo1.equals(INT)) || (!tipo2.equals(FLOAT) && !tipo2.equals(INT))){
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
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
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
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
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
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
            throw new SemanticError("tipos incompatíveis em expressão aritmética");
        }

        pilhaTipos.push(FLOAT);
        codigo.append("\ndiv");
    }

//    private void acao05(Token token) throws SemanticError {
//        pilhaTipos.push(INT);
//        codigo.append("\nldc.i8 ").append(converterInt(token.getLexeme()));
//        codigo.append("\nconv.r8");
//    }

//    private String converterInt(String numero){
//
//    }
}
