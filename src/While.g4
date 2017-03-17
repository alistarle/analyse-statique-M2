grammar While;

main: 'program' Identifier? (function*)? 'begin' declVariables* statements 'end' EOF #Program;

function : 'proc' Identifier'(' ldeclIdentifier? RETURN type Identifier ')' 'begin' statements 'end';

ldeclIdentifier : (type Identifier ',')*;

declVariables : type lidentifier ';' #Declare;

lidentifier : Identifier (',' Identifier)*;

controle: IF expression THEN block (ELSE block)? #ControleIf
    | WHILE expression DO block #ControleWhile
    ;

functionCall: 'call' Identifier'(' expression (',' expression)* ')';

assign : Identifier ':=' expression #AssignVar
    |Identifier'['expression']' ':=' expression #AssignTabExp
    ;

expression : expression op=(MUL|DIV) expression #MulDiv
    | expression op=(ADD|SUB) expression #AddSub
	| expression op=(GT|GTE|LT|LTE) expression #Comp
	| expression op=(EQ|NEQ) expression #Equal
	| expression op=(AND|OR) expression #Logic
    | op=NOT expression #LogicNot
    | SUB expression #ExpSub
    | Identifier #Id
    | Identifier'['expression']' #IdArray
    | BOOLEAN #Boolean
    | SUB?Constante #Int
    | '('expression')' #Par
    ;


block: statement
    | '('statements')'
    ;

statements : statement(';'statement)* ;

statement : assign
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

WS : [ \t\r\n]+ -> skip;