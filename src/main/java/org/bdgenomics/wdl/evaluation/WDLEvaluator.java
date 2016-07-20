package org.bdgenomics.wdl.evaluation;

import java.io.IOException;
import java.io.StringReader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.bdgenomics.wdl.parsing.*;

public class WDLEvaluator {

  public static <T extends WDLComponent> T parse(WDLBuilder<T> builder, String unparsed) throws IOException {
    StringReader reader = new StringReader(unparsed);
    ANTLRInputStream input = new ANTLRInputStream(reader);

    WDLLexer lexer = new WDLLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    WDLParser parser = new WDLParser(tokens);
    ParseTree tree = builder.parse(parser);

    T value = builder.visit(tree);
    return value;
  }
}


