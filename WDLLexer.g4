lexer grammar WDLLexer;


NEWLINE: [\n\r] -> skip ;
WS: [ \t]+ -> skip ;

TASK: 'task' ;
WORKFLOW: 'workflow' ;
AS: 'as';
IMPORT: 'import';
RUNTIME: 'runtime' ;
OUTPUT: 'output' ;
CALL: 'call' ;
SEP: 'sep' ;
IF: 'if' ;
LOOP: 'loop' ;
SCATTER: 'scatter' ;
DEFAULT: 'default' ;
QUOTE: 'quote' ;
INPUT: 'input' ;

COMMAND_BRACKET_BLOCK: 'command' [ \t]* '<<<' -> mode(BRACKET_BLOCK_MODE);
COMMAND_BRACE_BLOCK: 'command' [ \t]* '{' -> mode(BRACE_BLOCK_MODE);

STRING_TYPE : 'String' ;
FILE_TYPE: 'File' ;
INT_TYPE: 'Int' ;
FLOAT_TYPE: 'Float' ;
BOOL_TYPE: 'Bool' ;
OBJECT_TYPE: 'Object' ;
MAP_TYPE: 'Map' ;
ARRAY_TYPE: 'Array' ;

TRUE: 'true' ; 
FALSE: 'false' ; 

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]* ( '.' [a-zA-Z][a-zA-Z0-9_]+ )* ;

STRING
  : '"'  (~[\n"] | '\\' ["'\n\r\b\t\f\a\v?])* '"'
  | '\''  (~[\n"] | '\\' ["'\n\r\b\t\f\a\v?])* '\'' ;

INTEGER : HEX | OCTAL | DECIMAL ;
OCTAL: '0' [0-7]* ;
HEX: '0' [xX] [0-9a-fA-F]+ ;
DECIMAL : [1-9][0-9]* ;
FLOAT: (([0-9]+)?'.'([0-9]+)|[0-9]+'.'|[0-9]+)([eE][-+]?[0-9]+)? ;

LEFT_BLOCK: '<<<';
RIGHT_BLOCK: '>>>';

VAR_START: '${' ; 

COMMA: ',' ;
DOT: '.' ;
COLON: ':';

LEFT_BRACKET: '[' ;
RIGHT_BRACKET: ']' ;

LEFT_BRACE: '{' ;
RIGHT_BRACE: '}' ;

LEFT_PAREN: '(' ;
RIGHT_PAREN: ')';

PLUS: '+';
MINUS: '-' ;
QUESTION: '?';
BANG: '!';
ASTERISK: '*';
FSLASH: '/';
PERCENT: '%';

GTEQ: '>=' ;
LTEQ: '<=' ;
GT: '>';
LT: '<';
EQEQ: '==' ;
EQUALS: '=' ;
BANGEQ: '!=';

DOUBLEAMP: '&&';
DOUBLEBAR: '||' ;

mode BRACKET_BLOCK_MODE;

BRACKET_BLOCK_CLOSE: '>>>' -> mode(DEFAULT_MODE);
BRACKET_ANYTHING: ~'>'+;
RIGHT_ARROW: '>';

mode BRACE_BLOCK_MODE;

BRACE_BLOCK_CLOSE: '}' -> mode(DEFAULT_MODE);
BRACE_ANYTHING: ~'}'+;


