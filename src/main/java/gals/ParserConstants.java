package gals;

public interface ParserConstants {
    int START_SYMBOL = 47;

    int FIRST_NON_TERMINAL = 47;
    int FIRST_SEMANTIC_ACTION = 83;

    int[][] PARSER_TABLE =
            {
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 1, -1, -1, -1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, 1, -1, -1, 1, 1, 1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 2, -1, -1, -1, -1, -1, 2, -1, 2, -1, -1, -1, -1, -1, 2, -1, -1, 2, 2, 2, -1, -1, 2, 2, -1, -1, -1, -1, -1, -1, -1, -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 6, -1, -1, -1, -1, -1, 6, -1, 6, -1, -1, -1, -1, -1, 6, -1, -1, 6, 6, 6, -1, -1, 4, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 9, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, 15, -1, 14, -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, 20, -1, 18, -1, -1, -1, -1, 17, -1, -1, 16, -1, -1, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 27, -1, -1, -1, -1, -1, 32, -1, 31, -1, -1, -1, -1, -1, 30, -1, -1, 29, 29, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 36, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 40, 40, 40, 40, 40, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, 40, 40, -1, -1, -1, -1, -1, 40},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 46, -1, -1, -1, -1, -1, 46, -1, 46, -1, -1, -1, -1, -1, 46, -1, -1, 46, 46, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 48, -1, -1, -1, -1, -1, 48, -1, 48, 47, 47, -1, -1, -1, 48, -1, -1, 48, 48, 48, -1, -1, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 50, 50, 50, 50, 50, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, 50, 50, -1, -1, -1, -1, -1, 50},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 51, 51, -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, 53, -1},
                    {-1, 54, 54, 54, 54, 54, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, -1, -1, -1, 54, -1, -1, -1, -1, -1, -1, -1, 54, 54, -1, -1, -1, -1, -1, 57},
                    {-1, 58, 58, 58, 58, 58, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1, -1, -1, 58, 58, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, 59, -1, -1, 60, 60, 60, 60, -1, -1, -1, -1, -1, 59, 59, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 61, 62, 63, 64, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 65, 65, 65, 65, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, -1, -1, -1, 65, 65, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 66, 66, -1, -1, 66, -1, -1, 66, 66, 66, 66, 67, 68, -1, -1, -1, 66, 66, -1},
                    {-1, 69, 69, 69, 69, 69, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 69, -1, -1, -1, -1, -1, -1, -1, 69, 69, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, 70, -1, -1, 70, -1, -1, 70, 70, 70, 70, 70, 70, 71, 72, 73, 70, 70, -1},
                    {-1, 74, 75, 76, 77, 78, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, -1, -1, -1, -1, -1, -1, -1, 80, 81, -1, -1, -1, -1, -1, -1}
            };

    int[][] PRODUCTIONS =
            {
                    {15, 18, 33, 48, 34},
                    {50, 49},
                    {48},
                    {0},
                    {51},
                    {52},
                    {59},
                    {24, 55, 53},
                    {25, 55, 53},
                    {27, 57, 54},
                    {30, 58, 29},
                    {29},
                    {30, 58, 29},
                    {2, 56},
                    {0},
                    {28, 55},
                    {17},
                    {14},
                    {9},
                    {22},
                    {7},
                    {3},
                    {4},
                    {5},
                    {6},
                    {23},
                    {13},
                    {60},
                    {61},
                    {63},
                    {67},
                    {71},
                    {8, 29},
                    {2, 30, 72, 29},
                    {21, 31, 62, 55, 32, 29},
                    {6, 28},
                    {0},
                    {64, 31, 65, 32, 29},
                    {19},
                    {20},
                    {72, 66},
                    {0},
                    {28, 65},
                    {16, 31, 72, 32, 69, 68, 12, 29},
                    {11, 69},
                    {0},
                    {59, 70},
                    {0},
                    {69},
                    {10, 69, 26, 31, 72, 32, 12, 29},
                    {74, 73},
                    {0},
                    {44, 74, 73},
                    {45, 74, 73},
                    {75},
                    {23},
                    {13},
                    {46, 74},
                    {78, 76},
                    {0},
                    {77, 78},
                    {35},
                    {36},
                    {37},
                    {38},
                    {80, 79},
                    {0},
                    {39, 80, 79},
                    {40, 80, 79},
                    {82, 81},
                    {0},
                    {41, 82, 81},
                    {42, 82, 81},
                    {43, 82, 81},
                    {2},
                    {3},
                    {4},
                    {5},
                    {6},
                    {31, 72, 32},
                    {39, 82},
                    {40, 82}
            };

    String[] PARSER_ERROR =
            {
                    "",
                    " esperado EOF", //"Era esperado fim de programa
                    " esperado id",  //"Era esperado id
                    " esperado constante_integer",  //"Era esperado cint
                    " esperado constante_float",  //"Era esperado cfloat
                    " esperado constante_char",  //"Era esperado cchaar
                    " esperado constante_string",  //"Era esperado cstring
                    " esperado boolean",  //"Era esperado pr_boolean
                    " esperado break",  //"Era esperado pr_break
                    " esperado char",  //"Era esperado pr_char
                    " esperado do",  //"Era esperado pr_do
                    " esperado else",  //"Era esperado pr_else
                    " esperado end",  //"Era esperado pr_end
                    " esperado false",  //"Era esperado pr_false
                    " esperado float",  //"Era esperado pr_float
                    " esperado fun",  //"Era esperado pr_fun
                    " esperado if",  //"Era esperado pr_if
                    " esperado int",  //"Era esperado pr_int
                    " esperado main",  //"Era esperado pr_main
                    " esperado print",  //"Era esperado pr_print
                    " esperado println",  //"Era esperado pr_println
                    " esperado readln",  //"Era esperado pr_readln
                    " esperado string",  //"Era esperado pr_string
                    " esperado true",  //"Era esperado pr_true
                    " esperado val",  //"Era esperado pr_val
                    " esperado var",  //"Era esperado pr_var
                    " esperado while",  //"Era esperado pr_while
                    " esperado :",  //"Era esperado \":\""
                    " esperado ,",  //"Era esperado \",\""
                    " esperado ;",  //"Era esperado \";\""
                    " esperado =",  //"Era esperado \"=\""
                    " esperado (",  //"Era esperado \"(\""
                    " esperado )",  //"Era esperado \")\""
                    " esperado {",  //"Era esperado \"{\""
                    " esperado }",  //"Era esperado \"}\""
                    " esperado ==",  //"Era esperado \"==\""
                    " esperado !=",  //"Era esperado \"!=\""
                    " esperado <",  //"Era esperado \"<\""
                    " esperado >",  //"Era esperado \">\""
                    " esperado +",  //"Era esperado \"+\""
                    " esperado -",  //"Era esperado \"-\""
                    " esperado *",  //"Era esperado \"*\""
                    " esperado /",  //"Era esperado \"/\""
                    " esperado %",  //"Era esperado \"%\""
                    " esperado &&",  //"Era esperado \"&&\""
                    " esperado ||",  //"Era esperado \"||\""
                    " esperado !",  //"Era esperado \"!\""
                    " esperado fun", // "<geral> inválido"
                    " esperado id  break  do  if  print  println  readln  val  var", //"<lista_instrucoes> inválido"
                    " esperado id  break  do  if  print  println  readln  val  var  }", //"<lista_instrucoes1> inválido"
                    " esperado id  break  do  if  print  println  readln  val  var", //"<declaracao> inválido"
                    " esperado val", //"<dec_consts> inválido"
                    " esperado var", //"<dec_vars> inválido"
                    " esperado :  =", //"<tipo_dec> inválido"
                    " esperado ;  =", //"<tipo_dec1> inválido"
                    " esperado id", //"<lista_ids> inválido"
                    " esperado :  ,  =  )", //"<lista_ids1> inválido"
                    " esperado boolean  char  float  int  string", //"<tipo> inválido"
                    " esperado constante_int  constante_float  constante_char  constante_string  false  true", //"<valor> inválido"
                    " esperado id  break  do  if  print  println  readln", //"<comando> inválido"
                    " esperado id", //"<atribuicao> inválido"
                    " esperado readln", //"<entrada> inválido"
                    " esperado id  string", //"<cstring_opc> inválido"
                    " esperado print  println", //"<saida> inválido"
                    " esperado print  println", //"<tipo_saida> inválido"
                    " esperado expressão", //"<lista_exp> inválido"
                    " esperado ,  )", //"<lista_exp1> inválido"
                    " esperado if", //"<selecao> inválido"
                    " esperado else  end", //"<else> inválido"
                    " esperado id  break  do  if  print  println  readln", //"<lista_cmd> inválido"
                    " esperado id  break  do  else  end  if  print  println  readln  while", //"<lista_cmd1> inválido"
                    " esperado do", //"<repeticao> inválido"
                    " esperado expressão", //"<expressao> inválido"
                    " esperado expressão", //"<expressao_> inválido"
                    " esperado expressão", //"<elemento> inválido"
                    " esperado expressão", //"<relacional> inválido"
                    " esperado expressão", //"<relacional_> inválido"
                    " esperado ==  !=  <  >", //"<operador_relacional> inválido"
                    " esperado expressão", //"<aritmetica> inválido"
                    " esperado expressão", //"<aritmetica_> inválido"
                    " esperado expressão", //"<termo> inválido"
                    " esperado expressão", //"<termo_> inválido"
                    " esperado expressão", //"<fator> inválido"
            };
}
