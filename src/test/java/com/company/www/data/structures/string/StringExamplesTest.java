package com.company.www.data.structures.string;

import org.junit.Test;

import java.util.HashSet;

public class StringExamplesTest {
  @Test
  public void findExtra() throws Exception {
    String s1 = "ABC";
    String s2 = "ACBD";
    System.out.println(
    string.findExtra(s1,s2));

  }

  @Test
  public void reverseStr() throws Exception {
    String s = "ABC";
    string.reverseStr(s,"");

  }

  @Test
  public void reverseString() throws Exception {
    String s = "ABC";
    string.reverseString(s);
  }

  @Test
  public void reverse() throws Exception {
    String s = "ABC";
    string.reverse(s);
  }

  @Test
  public void printDivisors() throws Exception {
    string.printDivisors(7);
  }

  @Test
  public void fizzBuzz() throws Exception {
    string.fizzBuzz(20);
  }

  @Test
  public void subset() throws Exception {
    string.subset("", "ab");
  }

  StringExamples string = new StringExamples();

  @Test
  public void delete() throws Exception {
    HashSet<String> dic = new HashSet<>();
    dic.add("a");
    dic.add("aa");
    dic.add("aaa");
    System.out.println(string.delete("ac", dic));
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
