grammar CLI;

command : argument+ ;

argument : TOKEN | STRING ;

STRING
  : '"'  (~[\n"] | '\\' ["'\n\r\b\t\f\a\v?])* '"'
  | '\''  (~[\n"] | '\\' ["'\n\r\b\t\f\a\v?])* '\'' ;

TOKEN :  (~[ \t\n\r])+ ;

WS : [ \t\n\r]+ -> skip ;




