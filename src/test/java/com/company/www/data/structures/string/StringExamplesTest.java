package com.company.www.data.structures.string;

import org.junit.Test;

import java.util.*;

public class StringExamplesTest {
  @Test
  public void isSubsequence() throws Exception {
    String str = "ABCG";
    String seq = "FCG";
    System.out.println(string.isSubsequence(str,seq,4,3));
  }

  @Test
  public void printAllSubstring() throws Exception {
    String str = "ABC";
    string.printAllSubstring(str,"");
  }

    @Test
  public void decodeString() throws Exception {
    String str = "2[ab]";
    System.out.println(string.decodeString(str).toString());
  }
  @Test
  public void countWord() throws Exception {
    String str = "there.are areTtwo.many";
    String s = "are";
    System.out.println(string.countWord(str,s));
  }

  @Test
  public void heirarchy() throws Exception {
    Map<String, String> relation = new HashMap<>();
    relation.put("Ajay", "Ramesh");
    relation.put("Deepesh", "Animesh");
    relation.put("Mohan", "Ajay");
    relation.put("Rahul", "Mohan");

    List<String> result = string.heirarchy("Rahul", relation);
    result.stream().forEach(x->System.out.print(x+" -> "));
  }

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
