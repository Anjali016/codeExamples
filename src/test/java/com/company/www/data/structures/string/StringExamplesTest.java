package com.company.www.data.structures.string;

import org.junit.Test;

import java.util.HashSet;

public class StringExamplesTest {
  @Test
  public void subset() throws Exception {
    string.subset("","ab");
  }

    StringExamples string = new StringExamples();


  @Test
  public void delete() throws Exception {
    HashSet<String> dic = new HashSet<>();
    dic.add("a");
    dic.add("aa");
    dic.add("aaa");
    System.out.println(string.delete("ac",dic));
  }

    @Test
  public void reverseWords() throws Exception {

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
