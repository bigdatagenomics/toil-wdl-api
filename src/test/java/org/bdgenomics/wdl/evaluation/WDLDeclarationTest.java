package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import java.util.Optional;
import org.junit.Test;

public class WDLDeclarationTest {

  @Test
  public void testDeclarationParsing() throws IOException {
    WDLDeclaration decl = WDLEvaluator.parse(new WDLDeclaration.Builder(), "File foo");
    assertThat(decl).isNotNull();
    assertThat(decl.type).isEqualTo(new PrimitiveType("File"));
    assertThat(decl.identifier).isEqualTo("foo");
    assertThat(decl.initializer).isEqualTo(Optional.empty());
  }

  @Test(expected=ParsingException.class)
  public void testDeclarationParsingWithIllegalType() throws IOException {
    WDLDeclaration decl = WDLEvaluator.parse(new WDLDeclaration.Builder(), "Integer foo");
  }

  @Test
  public void testDeclarationWithInitializerParsing() throws IOException {
    WDLDeclaration decl = WDLEvaluator.parse(new WDLDeclaration.Builder(), "Int foo = 1");
    assertThat(decl).isNotNull();
    assertThat(decl.type).isEqualTo(new PrimitiveType("Int"));
    assertThat(decl.identifier).isEqualTo("foo");
    assertThat(decl.initializer).isEqualTo(Optional.of(new ExprInteger(1)));

    decl = WDLEvaluator.parse(new WDLDeclaration.Builder(), "Int foo = 1 + 3");
    assertThat(decl).isNotNull();
    assertThat(decl.type).isEqualTo(new PrimitiveType("Int"));
    assertThat(decl.identifier).isEqualTo("foo");
    assertThat(decl.initializer).isEqualTo(Optional.of(new ExprAddition(new ExprInteger(1), new ExprInteger(3))));
  }
}
