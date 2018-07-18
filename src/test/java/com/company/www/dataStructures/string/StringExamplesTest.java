package com.company.www.dataStructures.string;

import org.junit.Test;

public class StringExamplesTest {
  @Test
  public void charFrequency() throws Exception {
    String p = "Hellooooh";
    String s = p.toLowerCase();
    StringExamples object = new StringExamples();
    object.charFrequency(s);
  }
}