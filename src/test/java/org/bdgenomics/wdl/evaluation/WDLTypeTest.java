package org.bdgenomics.wdl.evaluation;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.bdgenomics.wdl.evaluation.types.ArrayType;
import org.bdgenomics.wdl.evaluation.types.MapType;
import org.bdgenomics.wdl.evaluation.types.ObjectType;
import org.bdgenomics.wdl.evaluation.types.PrimitiveType;
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
    assertThat(((MapType)type).keyType).isNotNull().isEqualTo(WDLType.STRING);
    assertThat(((MapType)type).valueType).isNotNull().isEqualTo(WDLType.STRING);
  }

}
