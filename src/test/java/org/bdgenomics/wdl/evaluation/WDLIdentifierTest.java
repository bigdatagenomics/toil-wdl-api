package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bdgenomics.wdl.evaluation.expressions.ExprIdentifier;
import org.bdgenomics.wdl.parsing.WDLParser;
import org.bdgenomics.wdl.parsing.WDLParserBaseVisitor;
import org.junit.Test;

public class WDLIdentifierTest {

  @Test
  public void testParseIdentifierWithUnderscore() throws IOException {
    ExprIdentifier id = WDLEvaluator.parse(new Builder(), "output_name");
    assertThat(id).isNotNull();
    assertThat(id.value).isEqualTo("output_name");
  }


  @Test
  public void testParseIdentifier() throws IOException {
    ExprIdentifier id = WDLEvaluator.parse(new Builder(), "x");
    assertThat(id).isNotNull();
    assertThat(id.value).isEqualTo("x");
  }

  public static class Builder extends WDLParserBaseVisitor<ExprIdentifier> implements WDLBuilder<ExprIdentifier> {

    @Override
    public ExprIdentifier visitVariable_mapping_key(WDLParser.Variable_mapping_keyContext ctx) {
      return new ExprIdentifier(ctx.getText());
    }

    @Override
    public ParseTree parse(WDLParser parser) {
      return parser.variable_mapping_key();
    }
  }
}
