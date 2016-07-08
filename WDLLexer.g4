lexer grammar WDLLexer;

NEWLINE: '\r'? '\n' -> skip;
WS : [ \t\n\r]+  -> skip ;

ID: [a-zA-Z0-9_]+ ;

OPEN: '{';
CLOSE: '}';
WORKFLOW: 'workflow';
CALL: 'call' ;
AS: 'AS' ;
TASK: 'task' ;
KEY: ID ':' ;
VALUES: ID '=' ~','+ (',' ID '=' ~','+ )* ;

COMMAND: 'command' WS* OPEN -> mode(BLOCK);
OUTPUT: 'output' WS* OPEN -> mode(BLOCK);

mode BLOCK;

BLOCK_CONTENT: ~'}'+ ;
BLOCK_CLOSE: '}' -> mode(DEFAULT_MODE);
