parser grammar WDLParser;

options {
  tokenVocab=WDLLexer;
}

document : wdlimport* workflow task* ;

wdlimport : IMPORT import_location (AS import_name)? ;
import_location : STRING ;
import_name : IDENTIFIER ;

task : TASK task_name LEFT_BRACE declaration* task_section* RIGHT_BRACE ;
task_name : IDENTIFIER ;
declaration: type IDENTIFIER (EQUALS expression)? ;

task_section
  : command
  | runtime
  | task_output
  | parameter_meta
  | meta
  ;

// task.command
command
  : COMMAND_BRACE_BLOCK BRACE_ANYTHING? BRACE_BLOCK_CLOSE                        # commandBrace
  | COMMAND_BRACKET_BLOCK (BRACKET_ANYTHING | RIGHT_ARROW)* BRACKET_BLOCK_CLOSE  # commandBracket
  ;

var_option: var_option_key EQUALS var_option_value ;
var_option_key: SEP | TRUE | FALSE | DEFAULT | QUOTE ;
var_option_value: expression ;

// task.output
task_output: OUTPUT LEFT_BRACE output_assignment* RIGHT_BRACE ;
output_assignment: type output_name EQUALS expression ;
output_name: IDENTIFIER | OUTPUT;

// task.runtime
runtime : RUNTIME LEFT_BRACE runtime_assignment* RIGHT_BRACE ;
runtime_assignment: runtime_key COLON expression ;
runtime_key: IDENTIFIER ;

parameter_meta : STRING;
meta : STRING;

//$task_sections = ($command | $runtime | $task_output | $parameter_meta | $meta)+
//task_sections : (command | runtime | task_output | parameter_meta | meta)+ ;

workflow: WORKFLOW workflow_name LEFT_BRACE workflow_element* RIGHT_BRACE ;
workflow_name : IDENTIFIER ;
workflow_element: call | loop | conditional | declaration | scatter ;

call: CALL IDENTIFIER (AS IDENTIFIER)? ( LEFT_BRACE call_inputs? RIGHT_BRACE )? ;
call_inputs: INPUT COLON variable_mappings ;
variable_mappings: variable_mapping_kv (COMMA variable_mapping_kv)* ;
variable_mapping_kv: variable_mapping_key EQUALS expression ;
variable_mapping_key: IDENTIFIER;

loop:  LOOP LEFT_BRACE RIGHT_BRACE ;
conditional:  IF LEFT_BRACE RIGHT_BRACE ;
scatter:  SCATTER LEFT_BRACE RIGHT_BRACE ;

// types
type : (primitive_type | array_type | map_type | object_type) type_postfix_quantifier? ;
type_postfix_quantifier:  PLUS | QUESTION ;

primitive_type : BOOL_TYPE | INT_TYPE | FLOAT_TYPE | FILE_TYPE | STRING_TYPE ;

array_type:  ARRAY_TYPE LEFT_BRACKET array_component_type RIGHT_BRACKET;
array_component_type : primitive_type | object_type | array_type ;

object_type:  OBJECT_TYPE ;

map_type: MAP_TYPE LEFT_BRACKET map_key_type COLON map_value_type RIGHT_BRACKET ;
map_key_type: primitive_type;
map_value_type: primitive_type | array_type | map_type | object_type ;


// expressions

bool : TRUE | FALSE ;

expression
  : STRING    # String
  | bool      # Boolean
  | INTEGER   # Integer
  | FLOAT     # Float
  | IDENTIFIER    # Identifier
  | expression LEFT_BRACKET expression RIGHT_BRACKET   # ArrayReference
  | expression LEFT_PAREN ( expression (COMMA expression)* )? RIGHT_PAREN  # FunctionApplication
  | BANG expression   # Not
  | PLUS expression   # Positive
  | MINUS expression   # Negative
  | expression ASTERISK expression   # Multiply
  | expression PERCENT expression   # Modulo
  | expression FSLASH expression   # Divide
  | expression PLUS expression   # Add
  | expression MINUS expression   # Subtract
  | expression LT expression   # LessThan
  | expression LTEQ expression  # LessThanOrEquals
  | expression GT expression   # GreaterThan
  | expression GTEQ expression  # GreaterThanOrEquals
  | expression EQEQ expression  # Equality
  | expression BANGEQ expression  # Inequality
  | expression DOUBLEAMP expression  # And
  | expression DOUBLEBAR expression  # Or
  | LEFT_BRACE ( expression COLON expression)* RIGHT_BRACE   # Map
  | LEFT_BRACKET expression* RIGHT_BRACKET    # List
  | LEFT_PAREN expression RIGHT_PAREN     # Grouping
  ;


