parser grammar WDL;

options { tokenVocab=WDLLexer; }

wdl : workflow task* ;

workflow : WORKFLOW OPEN call* CLOSE ;

call
  : CALL ID
  | CALL ID assignment_block
  | CALL ID AS ID assignment_block ;

assignment_block : OPEN assignment* CLOSE ;

assignment : KEY VALUES ;

task: TASK OPEN (command | output)* CLOSE ;

command: COMMAND BLOCK_CONTENT BLOCK_CLOSE ;

output: OUTPUT BLOCK_CONTENT BLOCK_CLOSE ;




