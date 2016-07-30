package org.bdgenomics;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bdgenomics.cwl.CWLObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseTest {

  public static <T> T[] v(T... array) {
    return array;
  }

  public static <T> List<T> list(T... array) {
    return Arrays.asList(array);
  }

  public static <T> Map<String, T> map(String[] keys, T[] values) {
    Map<String, T> map = new LinkedHashMap<>();
    for (int i = 0; i < keys.length; i++) {
      map.put(keys[i], values[i]);
    }
    return map;
  }

  public static File findFixture(String resourceName) {
    String filename = ClassLoader.getSystemClassLoader().getResource("fixtures/" + resourceName).getFile();
    File f = new File(filename);
    return f;
  }

  public static String fixture(String resourceName) throws IOException {
    File f = findFixture(resourceName);
    StringBuilder builder = new StringBuilder();
    try (FileReader br = new FileReader(f)) {
      char[] buffer = new char[1024];
      int read = -1;
      while ((read = br.read(buffer)) >= 0) {
        builder.append(buffer, 0, read);
      }
    }
    return builder.toString();
  }

  public ObjectMapper getMapper() {
    return new CWLObjectMapper();
  }
}
