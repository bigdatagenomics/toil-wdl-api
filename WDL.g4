grammar WDL;

document : wdlimport* workflow task* ;

wdlimport : 'import' import_location ('as' import_name)? ;
import_location : STRING ;
import_name : IDENTIFIER ;

task : 'task' task_name '{' declaration* task_section* '}' ;
task_name : IDENTIFIER ;
declaration: type IDENTIFIER ('=' expression)? ;

task_section
  : command   // taskCommand
  | runtime    // taskRuntime
  | task_output   // taskOutput
  | parameter_meta   // taskParameterMeta
  | meta              // taskMeta
  ;

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
runtime : 'runtime' '{' runtime_assignment* '}';
runtime_assignment: runtime_key ':' expression ;
runtime_key: IDENTIFIER ;

parameter_meta : STRING;
meta : STRING;

//$task_sections = ($command | $runtime | $task_output | $parameter_meta | $meta)+
//task_sections : (command | runtime | task_output | parameter_meta | meta)+ ;

workflow: 'workflow' workflow_name '{' workflow_element* '}' ;
workflow_name : IDENTIFIER ;
workflow_element: call | loop | conditional | declaration | scatter ;

call: 'call' IDENTIFIER ('as' IDENTIFIER)? ( '{' call_inputs? '}' )? ;
call_inputs: 'input' ':' variable_mappings ;
variable_mappings: variable_mapping_kv (',' variable_mapping_kv)* ;
variable_mapping_kv: variable_mapping_key '=' expression ;
variable_mapping_key: IDENTIFIER;

loop: 'loop' '{' '}' ;
conditional: 'if' '{' '}' ;
scatter: 'scatter' '{' '}' ;

// types
type : (primitive_type | array_type | map_type | object_type) type_postfix_quantifier? ;
type_postfix_quantifier:  '+' | '?' ;

primitive_type : 'Boolean' | 'Int' | 'Float' | 'File' | 'String' ;

array_type:  'Array' '[' array_component_type ']';
array_component_type : primitive_type | object_type | array_type ;

object_type:  'Object' ;

map_type: 'Map' '[' map_key_type ':' map_value_type ']' ;
map_key_type: primitive_type;
map_value_type: primitive_type | array_type | map_type | object_type ;


// expressions

bool : 'true' | 'false' ;

expression
  : STRING    # String
  | bool      # Boolean
  | INTEGER   # Integer
  | FLOAT     # Float
  | IDENTIFIER    # Identifier
  | expression '[' expression ']'   # ArrayReference
  | expression '(' ( expression (',' expression)* )? ')'  # FunctionApplication
  | '!' expression   # Not
  | '+' expression   # Positive
  | '-' expression   # Negative
  | expression '*' expression   # Multiply
  | expression '%' expression   # Modulo
  | expression '/' expression   # Divide
  | expression '+' expression   # Add
  | expression '-' expression   # Subtract
  | expression '<' expression   # LessThan
  | expression '<=' expression  # LessThanOrEquals
  | expression '>' expression   # GreaterThan
  | expression '>=' expression  # GreaterThanOrEquals
  | expression '==' expression  # Equality
  | expression '!=' expression  # Inequality
  | expression '&&' expression  # And
  | expression '||' expression  # Or
  | '{' ( expression ':' expression)* '}'   # Map
  | '[' expression* ']'    # List
  | '(' expression ')'     # Grouping
  ;

WS: [ \t\n\r]+ -> skip ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]* ( '.' [a-zA-Z][a-zA-Z0-9_]+ )* ;

STRING
  : '"'  (~[\n"] | '\\' ["'\n\r\b\t\f\a\v?])* '"'
  | '\''  (~[\n"] | '\\' ["'\n\r\b\t\f\a\v?])* '\'' ;

INTEGER : HEX | OCTAL | DECIMAL ;
OCTAL: '0' [0-7]* ;
HEX: '0' [xX] [0-9a-fA-F]+ ;
DECIMAL : [1-9][0-9]* ;
FLOAT: (([0-9]+)?'.'([0-9]+)|[0-9]+'.'|[0-9]+)([eE][-+]?[0-9]+)? ;


