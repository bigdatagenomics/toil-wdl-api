
all: clean grammar
	mvn clean install

clean: 
	rm -f src/main/java/org/bdgenomics/wdl/*

grammar: WDLVisitor.java

WDLVisitor.java: WDL.g4 WDLLexer.g4
	antlr4 -o gen WDLLexer.g4
	antlr4 -o src/main/java/org/bdgenomics/wdl WDLLexer.g4
	antlr4 -visitor -o src/main/java/org/bdgenomics/wdl -package org.bdgenomics.wdl WDL.g4
