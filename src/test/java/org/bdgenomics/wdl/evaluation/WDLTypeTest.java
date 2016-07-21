package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import java.util.Optional;
import org.junit.Test;

public class WDLTypeTest {

  @Test
  public void testPrimitiveParsing() throws IOException {
    WDLType type = WDLEvaluator.parse(new WDLType.Builder(), "String");
    assertThat(type).isNotNull();
    assertThat(type).isInstanceOf(PrimitiveType.class);
    assertThat(type.toString()).isEqualTo("String");
  }

  @Test
  public void testObjectTypeParsing() throws IOException {
    WDLType type = WDLEvaluator.parse(new WDLType.Builder(), "Object");
    assertThat(type).isNotNull();
    assertThat(type).isInstanceOf(ObjectType.class);
    assertThat(type.toString()).isEqualTo("Object");
  }

  @Test
  public void testArrayParsing() throws IOException {
    WDLType type = WDLEvaluator.parse(new WDLType.Builder(), "Array[Object]");
    assertThat(type).isNotNull();
    assertThat(type).isInstanceOf(ArrayType.class);
    assertThat(type.toString()).isEqualTo("Array[Object]");
  }


  @Test
  public void testMapParsing() throws IOException {
    WDLType type = WDLEvaluator.parse(new WDLType.Builder(), "Map[String:String]");
    assertThat(type).isNotNull();
    assertThat(type).isInstanceOf(MapType.class);
    assertThat(((MapType)type).keyType).isNotNull().isEqualTo(new PrimitiveType("String"));
    assertThat(((MapType)type).valueType).isNotNull().isEqualTo(new PrimitiveType("String"));
  }

}
