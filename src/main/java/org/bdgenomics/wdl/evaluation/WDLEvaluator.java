package org.bdgenomics.wdl.evaluation;

import java.io.IOException;
import java.io.StringReader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.bdgenomics.wdl.parsing.*;

public class WDLEvaluator {


  public static Object parse(String schemeString) throws IOException {
    StringReader reader = new StringReader(schemeString);
    ANTLRInputStream input = new ANTLRInputStream(reader);

    WDLLexer lexer = new WDLLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    SchemeParser parser = new SchemeParser(tokens);
    ParseTree tree = parser.expr();

    ExprBuilder visitor = new ExprBuilder();
    Object expr = visitor.visit(tree);

    return expr;
  }

}
