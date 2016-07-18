parser grammar WDL;

options { tokenVocab=WDLLexer; }

document : (wdlimport | task | workflow)* ;

wdlimport : IMPORT import_location (AS import_name)? ;
import_location : STRING ;
import_name : IDENTIFIER ;

//$task = 'task' $ws+ $identifier $ws* '{' $ws* $declaration* $task_sections $ws* '}'
task : TASK task_name LEFT_BRACE declaration* task_sections RIGHT_BRACE ;
task_name : IDENTIFIER ;

//$task_sections = ($command | $runtime | $task_output | $parameter_meta | $meta)+
//task_sections : (command | runtime | task_output | parameter_meta | meta)+ ;
task_sections : STRING ;

workflow : STRING ;

// types
type : (primitive_type | array_type | map_type | object_type) type_postfix_quantifier ? ;
primitive_type :  PRIMITIVE_TYPE ;
array_type:  ARRAY_TYPE LEFT_BRACKET (primitive_type | object_type | array_type) RIGHT_BRACKET ;
object_type:  OBJECT_TYPE ;
map_type: MAP_TYPE LEFT_BRACKET primitive_type COMMA (primitive_type | array_type | map_type | object_type) RIGHT_BRACKET ;
type_postfix_quantifier:  BANG | QUESTION ;

// names
fully_qualified_name: IDENTIFIER (DOT IDENTIFIER)* ;

// declaration
declaration: type IDENTIFIER (EQUALS expression)? ;

// expressions

expression
  : STRING | INTEGER | FLOAT | BOOLEAN
  | FQNAME
  | LEFT_PAREN expression RIGHT_PAREN
  | expression DOT expression
  | expression LEFT_BRACKET expression RIGHT_BRACKET
  | expression LEFT_PAREN ( expression (COMMA expression)* )? RIGHT_PAREN
  | BANG expression
  | PLUS expression
  | MINUS expression
  | expression TIMES expression
  | expression MODULO expression
  | expression DIVIDE expression
  | expression PLUS expression
  | expression MINUS expression
  | expression LT expression
  | expression LTEQ expression
  | expression GT expression
  | expression GTEQ expression
  | expression EQUALS expression
  | expression NEQ expression
  | expression AND expression
  | expression OR expression
  | LEFT_BRACE ( expression COLON expression)* RIGHT_BRACE
  | LEFT_BRACKET expression* RIGHT_BRACKET
  ;


