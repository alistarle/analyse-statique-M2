grammar While;

main: 'program' Identifier? (declaration*)? 'begin' ldeclVariables statements 'end' EOF #Program;

declaration : 'proc' Identifier'(' ldeclIdentifier? (','? RETURN type Identifier)? ')' 'begin' statements 'end';

ldeclIdentifier : type Identifier (',' type Identifier)*;

ldeclVariables : declVariables ldeclVariables*;

declVariables : type lidentifier ';';

lidentifier : Identifier (',' Identifier)*;

controle: IF bexpression THEN block (ELSE block)? #ControleIf
    | WHILE bexpression DO block #ControleWhile
    ;

functionCall: 'call' Identifier'(' laexpression ')';

ident : Identifier|Identifier'['aexpr']';

aexpr : ident|Constante
    | aexpr op=(MUL|DIV) aexpr
    | aexpr op=(ADD|SUB) aexpr
    | '('aexpr')'
    ;

laexpression : aexpression (',' aexpression)*;

aexpression : ident | Constante
    | aexpression op=(MUL|DIV) aexpression
    | aexpression op=(ADD|SUB) aexpression
    | SUB aexpression
    | '('aexpression')'
    ;

bexpression : BOOLEAN
	| aexpression op=(GT|GTE|LT|LTE) aexpression
	| aexpression op=(EQ|NEQ) aexpression
	| bexpression op=(AND|OR) bexpression
    | op=NOT bexpression
    | '('bexpression')'
    ;


block: statement
    | '('statements')'
    ;

statements : statement(';'statements)* ;

statement : ident ':=' aexpr
    | functionCall
    | controle
    | 'skip'
    ;


//Opération type de base
//Arithmetique
ADD : '+';
SUB:  '-';
MUL : '*';
DIV : '/';
//Comparaison
GT : '>';
GTE : '>=';
LT : '<';
LTE : '<=';
EQ : '==';
NEQ : '!=';
//Logique
AND : 'and';
OR : 'or';
NOT : 'not';

//Structure de controles
IF : 'if';
DO : 'do';
THEN : 'then';
ELSE : 'else';
WHILE : 'while';

//Function
RETURN : 'res';

//Type de base
Int : 'int';
Boolean : 'boolean';

type : Int
    | Boolean
    | Int'['Constante']'
    ;

BOOLEAN : 'true'|'false';
Constante : [0-9]+;
Identifier : [a-zA-Z][a-zA-Z0-9]*;

WS : [ \t\r\n\l]+ -> skip;