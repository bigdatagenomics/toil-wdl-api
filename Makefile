
all: clean grammar

clean: 
	rm -f src/main/java/org/bdgenomics/wdl/parsing/*
	rm -f *.tokens
	rm -f src/main/java/org/bdgenomics/expressions/*

grammar: WDLVisitor.java CLI.java

CLI.java: CLI.g4
	antlr4 -Werror -long-messages -visitor -o src/main/java/org/bdgenomics/expressions -package org.bdgenomics.expressions.CLI.g4

WDLVisitor.java: WDLParser.g4 WDLLexer.g4
	antlr4 -o gen WDLLexer.g4
	antlr4 -o src/main/java/org/bdgenomics/wdl/parsing -package org.bdgenomics.wdl.parsing WDLLexer.g4
	antlr4 -Werror -long-messages -visitor -o src/main/java/org/bdgenomics/wdl/parsing -package org.bdgenomics.wdl.parsing WDLParser.g4
