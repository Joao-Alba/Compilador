package gals;

public interface ParserConstants {
    int START_SYMBOL = 47;

    int FIRST_NON_TERMINAL = 47;
    int FIRST_SEMANTIC_ACTION = 82;

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
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 39, 39, 39, 39, 39, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, 39},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 45, -1, -1, -1, -1, -1, 45, -1, 45, -1, -1, -1, -1, -1, 45, -1, -1, 45, 45, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 47, -1, -1, -1, -1, -1, 47, -1, 47, 46, 46, -1, -1, -1, 47, -1, -1, 47, 47, 47, -1, -1, -1, -1, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 49, 49, 49, 49, 49, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, 49, 49, -1, -1, -1, -1, -1, 49},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, 50, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 51, 52, -1},
                    {-1, 53, 53, 53, 53, 53, -1, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, -1, -1, -1, -1, -1, -1, -1, 53, -1, -1, -1, -1, -1, -1, -1, 53, 53, -1, -1, -1, -1, -1, 56},
                    {-1, 57, 57, 57, 57, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, -1, -1, -1, -1, -1, -1, -1, 57, 57, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, 58, -1, -1, 58, -1, -1, 59, 59, 59, 59, -1, -1, -1, -1, -1, 58, 58, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, 61, 62, 63, -1, -1, -1, -1, -1, -1, -1, -1},
                    {-1, 64, 64, 64, 64, 64, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, -1, -1, 64, 64, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, 65, -1, -1, 65, -1, -1, 65, 65, 65, 65, 66, 67, -1, -1, -1, 65, 65, -1},
                    {-1, 68, 68, 68, 68, 68, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, -1, -1, -1, -1, -1, -1, -1, 68, 68, -1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 69, 69, -1, -1, 69, -1, -1, 69, 69, 69, 69, 69, 69, 70, 71, 72, 69, 69, -1},
                    {-1, 73, 74, 75, 76, 77, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 78, -1, -1, -1, -1, -1, -1, -1, 79, 80, -1, -1, -1, -1, -1, -1}
            };

    int[][] PRODUCTIONS =
            {
                    {97, 15, 18, 33, 48, 34, 98},
                    {50, 49},
                    {48},
                    {0},
                    {51},
                    {52},
                    {59},
                    {24, 55, 53},
                    {25, 55, 53},
                    {27, 57, 112, 113, 54},
                    {30, 58, 29},
                    {29},
                    {30, 58, 29},
                    {2, 114, 56},
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
                    {66},
                    {70},
                    {8, 29},
                    {2, 114, 30, 71, 116, 29},
                    {21, 31, 62, 55, 117, 32, 29},
                    {6, 104, 96, 28},
                    {0},
                    {19, 31, 64, 32, 29},
                    {20, 31, 64, 32, 99, 29},
                    {71, 96, 65},
                    {0},
                    {28, 64},
                    {16, 31, 71, 32, 106, 68, 67, 12, 108, 29},
                    {11, 107, 68},
                    {0},
                    {59, 69},
                    {0},
                    {68},
                    {109, 10, 68, 26, 31, 71, 32, 110, 12, 29},
                    {73, 72},
                    {0},
                    {44, 73, 100, 72},
                    {45, 73, 101, 72},
                    {74},
                    {23, 93},
                    {13, 94},
                    {46, 73, 95},
                    {77, 75},
                    {0},
                    {76, 91, 77, 92},
                    {35},
                    {36},
                    {37},
                    {38},
                    {79, 78},
                    {0},
                    {39, 79, 83, 78},
                    {40, 79, 84, 78},
                    {81, 80},
                    {0},
                    {41, 81, 85, 80},
                    {42, 81, 86, 80},
                    {43, 81, 102, 80},
                    {2, 115},
                    {3, 87},
                    {4, 88},
                    {5, 103},
                    {6, 104},
                    {31, 71, 32},
                    {39, 81, 89},
                    {40, 81, 90}
            };

    String[] PARSER_ERROR =
            {
                    "",
                    " esperado EOF", //"Era esperado fim de programa
                    " esperado id",  //"Era esperado id
                    " esperado constante_int",  //"Era esperado cint
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
                    " esperado id  constante_string", //"<cstring_opc> inválido"
                    " esperado print  println", //"<saida> inválido"
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
