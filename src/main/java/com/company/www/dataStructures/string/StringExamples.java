package com.company.www.dataStructures.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringExamples {

  /** Reverse all words in string but not to reverse letters of any word**/


  /**Given two stirngs, find how many times words of first string occurs in second String
   * Second String contains two sentences separated by underscore '_' **/

    /*void wordFrequency(String pattern, String paragraph){
      String patter[] = pattern.split("_");
     String longString[] =  paragraph.split("_");
     HashMap<Character,Integer> map = new HashMap<>();
     for(String s : patter) {
       for (String p : longString)
     }
     }

    }*/


  /** Find the frequency of each letter in a given string* */
  void charFrequency(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : str.toCharArray())
      if (map.containsKey(c)) map.put(c, map.get(c) + 1);// map.computeIfPresent(c,(k,v) -> v+1);
      else map.put(c, 1);

    for (Map.Entry entry : map.entrySet()) System.out.println(entry.getKey() + " " +entry.getValue());
  }

  /*for (Entry<KeyClass, ValueClass> entry  : myMap.entrySet())
      System.out.println(entry.getKey() + " - " + entry.getValue());
  */

  /**
   * Given a string determine if it is a palindrom considering only alphanumerica characters and
   * ignoring cases. 'A man, a plan, a canal: Panama' is palindrome. 'race a car' is not a
   * palindrome. Return 0/1
   */
  public boolean isPalindrom(String str) {
    String p = str.replaceAll("[^A-Za-z0-9]", "");
    String s = p.toLowerCase();
    if (s.length() <= 1) return true;
    else
      return (s.charAt(0) == s.charAt(s.length() - 1)
          && isPalindrom(s.substring(1, s.length() - 1)));
  }

  /** Find all the factors of a number */
  void printDivisors(int N) {
    for (int i = 1; i < Math.sqrt(N); i++) {
      if (N % i == 0) {
        if (N % i == i) System.out.println(i);
        else System.out.print(" " + i + " " + N / i);
      }
    }
  }

  /**
   * Given a positive number N, print all numbers from 1 to N , except for multiple of 3 it should
   * print Fizz and for multiple of 5 it should print Buzz and for multiple of 3 and 5 it should
   * print FizzBuzz
   */
  public void printNumbers(int n) {
    for (int i = 1; i <= n; i++) {
      boolean divbythree = (i % 3 == 0);
      boolean divbyfive = (i % 5 == 0);
      if (divbythree && divbyfive) {
        System.out.print("FizzBuzz");
      } else if (divbythree) {
        System.out.print("Fizz");
      } else if (divbyfive) {
        System.out.print("Buzz");
      } else {
        System.out.print(i);
      }
      System.out.print(" ");
    }
  }

  public static void main(String[] args) {
    StringExamples s = new StringExamples();
    System.out.println(s.isPalindrom("rac a car"));
  }


  private static boolean isSubstring(String s1, String s2) {
    return s1.contains(s2);
  }

  private static int getReverseNum(int number) {
    return getReverseNum(0, number);
  }

  private static int getReverseNum(int result, int number) {
    if (number == 0) return result;
    result = result * 10 + number % 10;
    return getReverseNum(result, number / 10);
  }

  private static Boolean ispermuteSubstring(String soFar, String rem, String s2) {
    if (rem.isEmpty()) return s2.contains(soFar);
    for (int i = 0; i < rem.length(); i++)
      if (ispermuteSubstring(soFar + rem.charAt(i), rem.substring(0, i) + rem.substring(i + 1), s2))
        return true;
    return false;
  }

  private static boolean isValidExpression(String exp) {
    Stack<Character> stack = new Stack<>();
    for (char c : exp.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') stack.push(c);
      else if (c == ')' || c == '}' || c == ']') {
        if (c == ')' || !stack.isEmpty() && stack.pop() != '(') return false;
        else if (c == '}' || !stack.isEmpty() && stack.pop() != '}') return false;
        else if (c == ']' || !stack.isEmpty() && stack.pop() != ']') return false;
      }
    }

    return stack.isEmpty();
  }
}