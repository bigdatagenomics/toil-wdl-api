package org.bdgenomics.cwl;

import static org.assertj.core.api.Assertions.assertThat;
import java.io.*;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class CommandLineToolTest {

  @Test
  public void testSimpleCommandLineToolSerialization() throws IOException {
    CommandLineTool tool = new CommandLineTool("echo",
      map(
        v("example_flag"),
        v(new Input("boolean", new Input.InputBinding(1, "-f")))),
      map(new String[0], new Output[0]));

    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

    String yaml = mapper.writeValueAsString(tool);

    assertThat(yaml).isEqualTo(fixture("cwl_commandlinetool_test1.yml"));
  }

  @Test
  public void testCommandLineToolSerializationWithNonemptyOutput() throws IOException {
    CommandLineTool tool = new CommandLineTool("echo",
      map(
        v("example_flag"),
        v(new Input("boolean", new Input.InputBinding(1, "-f")))),
      map(
        v("example_output"),
        v(new Output("File", new Output.OutputBinding("hello.txt")))));

    ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

    String yaml = mapper.writeValueAsString(tool);

    assertThat(yaml).isEqualTo(fixture("cwl_commandlinetool_test2.yml"));
  }

  public static <T> T[] v(T... array) { return array; }

  public static <T> Map<String, T> map(String[] keys, T[] values) {
    Map<String, T> map = new LinkedHashMap<>();
    for(int i = 0; i < keys.length; i++) {
      map.put(keys[i], values[i]);
    }
    return map;
  }

  public static void writeFixture(String resourceName, String newFilename, String content) throws IOException {
    String filename = ClassLoader.getSystemClassLoader().getResource("fixtures/" + resourceName).getFile();
    File f = new File(filename);
    File newFile = new File(f.getParent(), newFilename);
    System.out.println(String.format("Writing %s", newFile.getAbsolutePath()));
    try(PrintStream ps = new PrintStream(new FileOutputStream(newFile))) {
      ps.print(content);
      ps.flush();
    }
  }

  public static String fixture(String resourceName) throws IOException {
    String filename = ClassLoader.getSystemClassLoader().getResource("fixtures/" + resourceName).getFile();
    File f = new File(filename);
    StringBuilder builder = new StringBuilder();
    try(FileReader br = new FileReader(f)) {
      char[] buffer = new char[1024];
      int read = -1;
      while((read = br.read(buffer)) >= 0) {
        builder.append(buffer, 0, read);
      }
    }
    return builder.toString();
  }
}
