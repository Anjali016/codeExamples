package com.company.www.data.structures.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class StringExamplesTest {
  @Test
  public void areRotation() throws Exception {
    String s1 = "CDAB";
    String s2 = "ABCD";
    System.out.println(string.areRotation(s1,s2));
  }

  @Test
  public void powerSetLex() throws Exception {
    String str = "bac";
    char[] array = str.toCharArray();
    Arrays.sort(array);
    str = new String(array);

    string.powerSetLex("", str.toString());
  }

  @Test
  public void splitString() throws Exception {
    String str = "geeks01for02geeks03!!!";
    string.splitString(str);
  }

  @Test
  public void spiltSentence() throws Exception {
    String str = "a computer science portal";
    string.spiltSentence(str);
  }

  @Test
  public void getIndex() throws Exception {
    String exp = "[ABC[23]][89]";
    System.out.println(string.getIndex(exp, 4));
  }

  @Test
  public void checkParanthesis() throws Exception {
    String exp = "{]";
    System.out.println(string.checkParanthesis(exp));
  }

  @Test
  public void findExtra() throws Exception {
    String s1 = "ABC";
    String s2 = "ACBD";
    System.out.println(string.findExtra(s1, s2));
  }

  @Test
  public void reverseStr() throws Exception {
    String s = "ABC";
    string.reverseStr(s, "");
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
