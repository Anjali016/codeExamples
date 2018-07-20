package com.company.www.dataStructures.string;

import org.junit.Test;

public class StringExamplesTest {
  @Test
  public void reverseWords() throws Exception {
    StringExamples string = new StringExamples();
    System.out.println(string.reverseWords("I am here"));
  }

    @Test
  public void charFrequency() throws Exception {
    String p = "Hellooooh";
    String s = p.toLowerCase();
    StringExamples object = new StringExamples();
    object.charFrequency(s);
  }
}