package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.bdgenomics.wdl.evaluation.expressions.ExprAddition;
import org.bdgenomics.wdl.evaluation.expressions.ExprInteger;
import org.junit.Test;

public class WDLDeclarationTest {

  @Test
  public void testDeclarationParsing() throws IOException {
    WDLDeclaration decl = WDLEvaluator.parse(new WDLDeclaration.Builder(), "File foo");
    assertThat(decl).isNotNull();
    assertThat(decl.type).isEqualTo(WDLType.FILE);
    assertThat(decl.identifier).isEqualTo("foo");
    assertThat(decl.initializer).isEqualTo(null);
  }

  @Test(expected=ParsingException.class)
  public void testDeclarationParsingWithIllegalType() throws IOException {
    WDLDeclaration decl = WDLEvaluator.parse(new WDLDeclaration.Builder(), "Integer foo");
  }

  @Test
  public void testDeclarationWithInitializerParsing() throws IOException {
    WDLDeclaration decl = WDLEvaluator.parse(new WDLDeclaration.Builder(), "Int foo = 1");
    assertThat(decl).isNotNull();
    assertThat(decl.type).isEqualTo(WDLType.INT);
    assertThat(decl.identifier).isEqualTo("foo");
    assertThat(decl.initializer).isEqualTo(new ExprInteger(1));

    decl = WDLEvaluator.parse(new WDLDeclaration.Builder(), "Int foo = 1 + 3");
    assertThat(decl).isNotNull();
    assertThat(decl.type).isEqualTo(WDLType.INT);
    assertThat(decl.identifier).isEqualTo("foo");
    assertThat(decl.initializer).isEqualTo(new ExprAddition(new ExprInteger(1), new ExprInteger(3)));
  }
}
