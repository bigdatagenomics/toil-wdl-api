lexer grammar WDLLexer;

WS: [ \t\n\r]+ -> skip ;
BOOLEAN: 'true' | 'false' ;

PRIMITIVE_TYPE : 'Boolean' | 'Int' | 'Float' | 'File' | 'String' ;
ARRAY_TYPE:  'Array' ;
OBJECT_TYPE:  'Object' ;
MAP_TYPE: 'Map' ;

TASK: 'task' ;
WORKFLOW: 'workflow' ;
AS: 'as';
IMPORT: 'import';

FQNAME: IDENTIFIER ( DOT IDENTIFIER )* ;
IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]+ ;

STRING: DOUBLE_QUOTE_STRING | SINGLE_QUOTE_STRING ;
DOUBLE_QUOTE_STRING: '"' STRING_CONTENTS* '"' ;
SINGLE_QUOTE_STRING: '\'' STRING_CONTENTS* '\'' ;

STRING_CONTENTS: NO_QUOTE_OR_NEWLINE | ESCAPED | OCTAL_CHAR | HEX_CHAR | UNICODE_CHAR  ;

NO_QUOTE_OR_NEWLINE: ~[\n"] ;
ESCAPED: '\\' ["'\n\r\b\t\f\a\v?] ;
OCTAL_CHAR: [0-7]{1,3} ;
HEX_CHAR: '\\x' [0-9a-fA-F]+ ;
UNICODE_CHAR: '\\' [uU] ( [0-9a-fA-F]{4} [0-9a-fA-F]{4}?)* ;

INTEGER : HEX | OCTAL | DECIMAL ;
OCTAL: '0' [0-7]* ;
HEX: '0' [xX] [0-9a-fA-F]+ ;
DECIMAL : [1-9][0-9]* ;
FLOAT: (([0-9]+)?'.'([0-9]+)|[0-9]+'.'|[0-9]+)([eE][-+]?[0-9]+)? ;

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
TIMES: '*';
DIVIDE: '/';
MODULO: '%';

GTEQ: '>=' ;
LTEQ: '<=' ;
GT: '>';
LT: '<';
EQUALITY: '==' ;
EQUALS: '=' ;
NEQ: '!=';
BANG: '!';

AND: '&&';
OR: '||' ;


