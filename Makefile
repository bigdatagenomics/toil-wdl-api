
all: clean grammar

clean: 
	rm -f src/main/java/org/bdgenomics/wdl/parsing/*
	rm -f *.tokens

grammar: WDLVisitor.java

WDLVisitor.java: WDLParser.g4 WDLLexer.g4
	antlr4 -o gen WDLLexer.g4
	antlr4 -o src/main/java/org/bdgenomics/wdl/parsing -package org.bdgenomics.wdl.parsing WDLLexer.g4
	antlr4 -Werror -long-messages -visitor -o src/main/java/org/bdgenomics/wdl/parsing -package org.bdgenomics.wdl.parsing WDLParser.g4
