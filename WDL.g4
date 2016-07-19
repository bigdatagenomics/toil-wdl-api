grammar WDL;

document : wdlimport* workflow task* ;

wdlimport : 'import' import_location ('as' import_name)? ;
import_location : STRING ;
import_name : IDENTIFIER ;

task : 'task' task_name '{' declaration* task_sections '}' ;
task_name : IDENTIFIER ;
declaration: type IDENTIFIER ('=' expression)? ;
task_sections: (command | runtime | task_output | parameter_meta | meta)+;

// task.command
command
  : 'command' '{' command_part* '}'
  | 'command' '<<<' ('\n' | '\r')* command_part* '>>>' ;

command_part
  :  command_part_string  // commandPart
  | command_part_var ;    // commandVar
command_part_string : (~'${')+;
command_part_var: '${' var_option? expression '}' ;

var_option: var_option_key '=' var_option_value ;
var_option_key: 'sep' | 'true' | 'false' | 'default' | 'quote' ;
var_option_value: expression ;

// task.output
task_output: 'output' '{' output_assignment* '}';
output_assignment: type output_name '=' output_value ;
output_name: IDENTIFIER;
output_value: STRING;

// task.runtime

runtime : STRING;
parameter_meta : STRING;
meta : STRING;

//$task_sections = ($command | $runtime | $task_output | $parameter_meta | $meta)+
//task_sections : (command | runtime | task_output | parameter_meta | meta)+ ;

workflow: STRING ;

// types
type
  : primitive_type type_postfix_quantifier? // primitiveType
  | array_type type_postfix_quantifier?     // arrayType
  | map_type type_postfix_quantifier?       // mapType
  | object_type type_postfix_quantifier?    // objectType
  ;

primitive_type : 'Boolean' | 'Int' | 'Float' | 'File' | 'String' ;

array_type:  'Array' '[' (primitive_type | object_type | array_type) ']';
object_type:  'Object' ;
map_type: 'Map' '[' primitive_type ',' (primitive_type | array_type | map_type | object_type) ']' ;
type_postfix_quantifier:  '!' | '?' ;

// expressions

bool : 'true' | 'false' ;

expression
  : STRING
  | bool
  | INTEGER
  | FLOAT
  | IDENTIFIER
  | expression '.' expression
  | expression '[' expression ']'
  | expression '(' ( expression (',' expression)* )? ')'
  | '!' expression
  | '+' expression
  | '-' expression
  | expression '*' expression
  | expression '%' expression
  | expression '/' expression
  | expression '+' expression
  | expression '-' expression
  | expression '<' expression
  | expression '<=' expression
  | expression '>' expression
  | expression '>=' expression
  | expression '==' expression
  | expression '!=' expression
  | expression '&&' expression
  | expression '||' expression
  | '{' ( expression ':' expression)* '}'
  | '[' expression* ']'
  | '(' expression ')'
  ;

WS: [ \t\n\r]+ -> skip ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]+ ( '.' [a-zA-Z][a-zA-Z0-9_]+ )* ;

STRING
  : '"'  (~[\n"] | '\\' ["'\n\r\b\t\f\a\v?])* '"'
  | '\''  (~[\n"] | '\\' ["'\n\r\b\t\f\a\v?])* '\'' ;

INTEGER : HEX | OCTAL | DECIMAL ;
OCTAL: '0' [0-7]* ;
HEX: '0' [xX] [0-9a-fA-F]+ ;
DECIMAL : [1-9][0-9]* ;
FLOAT: (([0-9]+)?'.'([0-9]+)|[0-9]+'.'|[0-9]+)([eE][-+]?[0-9]+)? ;


