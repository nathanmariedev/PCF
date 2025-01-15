grammar PCF;

// Règles syntaxiques principales

program : term EOF ;

// Terme principal, avec priorités respectées
term : LIT                                   # Lit
     | term OP1 term                        # BinOp1
     | term OP2 term                        # BinOp2
     | '(' term ')'                        # Parens
     | 'ifz' term 'then' term 'else' term  # Cond
     | VAR                                  # Var
     | 'let' VAR '=' term 'in' term         # Let
     ;

// Règles lexicales

OP1 : '*' | '/' ;
OP2 : '+' | '-' ;
LIT : '0' | [1-9][0-9]* ;
VAR : [a-z][a-zA-Z0-9_]* ;
WS : [ \t\r\n]+ -> skip ;

// Commentaires
LINE_COMMENT : '//' .*? '\n' -> skip ;
MULTI_COMMENT : '/*' .*? '*/' -> skip ;
