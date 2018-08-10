package com.company.www.data.structures.string;

import java.util.*;

public class StringExamples {

  public static void main(String[] args) {
    StringExamples s = new StringExamples();
    System.out.println(s.isPalindrom("rac a car"));
  }


  /** check if strings are rotations of each other or not
   * Create a String temp and store concatenation of str1 to str1, if str2 is a substring of temp retrn true **/


  boolean areRotation(String str1, String str2){
    String temp = str1+str1;
    return temp.contains(str2);
  }
  /** Split numeric, alphabetic and special symbols from a String**/

  void splitString(String str){
    StringBuffer digit = new StringBuffer();
    StringBuffer alpha = new StringBuffer();
    StringBuffer special = new StringBuffer();

    for( char c : str.toCharArray()){
      if(Character.isDigit(c)) digit.append(c);
      if(Character.isAlphabetic(c)) alpha.append(c);
      else special.append(c);
    }
    System.out.println(digit);
    System.out.println(alpha);
    System.out.println(special);
  }


  void powerSetLex(String soFar, String rem) {
    if (rem.isEmpty()) return;
    else {
      System.out.println(soFar + rem.charAt(0));
      powerSetLex(soFar + rem.charAt(0), rem.substring(1));
      powerSetLex(soFar, rem.substring(1));
    }
  }
  /** Give a sentence, print different words present in it. Words are separated by space. */
  void spiltSentence(String str) {

    // String[] words = str.split("\\s+");
    String[] words = str.split(" ");
    for (String word : words) System.out.println(word);
  }
  /**
   * Find index of closing bracket for a given opening bracket in an expression Input : string =
   * [ABC[23]][89] index = 0 Output : 8 Sol : start the loop from the given index*
   */
  int getIndex(String exp, int index) {
    Stack<Character> stack = new Stack<>();
    for (int i = index; i < exp.length(); i++) {
      if (exp.charAt(i) == '[') {
        stack.push(exp.charAt(i));
      } else {
        if (exp.charAt(i) == ']') stack.pop();
        if (stack.isEmpty()) return i;
      }
    }
    return -1;
  }

  /**
   * Given an expression string exp , write a program to examine whether the pairs and the orders of
   * “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example, the program should print true for exp
   * = “[()]{}{[()()]()}” and false for exp = “[(])”*
   */
  boolean checkParanthesis(String exp) {
    Stack<Character> stack = new Stack<>();
    for (char c : exp.toCharArray()) {
      if (c == '[' || c == '(' || c == '{') {
        stack.push(c);
      } else if (c == ']' || c == '}' || c == ')') {
        if (stack.isEmpty()) return false;
        if (isMatching(stack.pop(), c)) return true;
      }
      if (stack.isEmpty()) return true; // stack is empty now after popping out all elements.
      else return false;
    }
    return false;
  }

  boolean isMatching(char open, char close) {
    if (open == '(' && close == ')') return true;
    if (open == '{' && close == '}') return true;
    if (open == '[' && close == ']') return true;
    return false;
  }

  /**
   * Given two strings which are of lengths n and n+1. The second string contains all the character
   * of the first string, but there is one extra character. Your task to find the extra character in
   * the second string.*
   */
  char findExtra(String str1, String str2) {
    int result = 0;
    for (char c : str1.toCharArray()) result = result ^ c;
    for (char c : str2.toCharArray()) result = result ^ c;
    return (char) result;
  }

  /** Reverse a string* */
  void reverseString(String str) {
    char[] strArray = str.toCharArray();
    reverseString(strArray, 0, strArray.length - 1);
    for (char c : strArray) System.out.print(c);
  }

  void reverseString(char[] str, int start, int end) {
    if (start > end) return;
    if (start <= end) swap(str, start, end);
    reverseString(str, start + 1, end - 1);
  }

  private void swap(char[] str, int a, int b) {
    char temp = str[a];
    str[a] = str[b];
    str[b] = temp;
  }

  void reverseStr(String str, String result) {
    if (str.isEmpty()) System.out.println(result);
    else reverseStr(str.substring(1), str.substring(0, 1) + result);
  }

  /** Print reverse of a string * */
  void reverse(String str) {
    if (str.isEmpty()) return;

    reverse(str.substring(1));
    System.out.println(str.charAt(0));
  }
  /** Print all the subset of a string.* */
  void subset(String soFar, String rem) {
    if (rem.isEmpty()) System.out.println("{" + soFar + "}");
    else {
      subset(soFar + rem.charAt(0), rem.substring(1));
      subset(soFar, rem.substring(1));
    }
  }

  /** check if a string contains a another string. * */
  private static boolean isSubstring(String s1, String s2) {
    return s1.contains(s2);
  }

  /**
   * Given two strings, find how many times words of first string occurs in second String Second
   * String contains two sentences separated by underscore '_' *
   */

  /*void wordFrequency(String pattern, String paragraph){
    String patter[] = pattern.split("_");
   String longString[] =  paragraph.split("_");
   HashMap<Character,Integer> map = new HashMap<>();
   for(String s : patter) {
     for (String p : longString)
   }
   }

  }*/

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

  /**
   * given a string and a hashset dictionary, find the minimum number of characters to remove from a
   * string to create a valid string. if dictionary = {"a","aa","aaa"} and string is "abc" then
   * output should be 2 * use breadth first. Complexity from tree = O(n!). abc / | \ ab bc ca /\ /\
   * /\ a b b c c a
   */
  int delete(String string, HashSet<String> dictionary) {
    Queue<String> queue = new LinkedList<>();
    HashSet<String> queueElements = new HashSet<>();
    queue.add(string);
    queueElements.add(string);
    while (!queue.isEmpty()) {
      String s = queue.remove();
      queueElements.remove(s);
      if (dictionary.contains(s)) return string.length() - s.length();
      for (int i = 0; i < s.length(); i++) {
        String substr = s.substring(0, i) + s.substring(i + 1, s.length());
        if (!queueElements.contains(s) && substr.length() > 0) {
          queue.add(substr);
          queueElements.add(substr);
        }
      }
    }
    return -1;
  }

  /** Reverse all words in string but not to reverse letters of any word * */
  String reverseWords(String str) {
    str.trim();
    if (str.length() == 0) return str;
    String token[] = str.split("\\s+");
    String reversed = "";
    for (int i = token.length - 1; i >= 0; i--) {
      reversed = reversed + " " + token[i];
    }
    reversed = reversed.trim();
    return reversed;
  }

  /** Find the frequency of each letter in a given string* */
  void charFrequency(String str) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : str.toCharArray())
      if (map.containsKey(c)) map.put(c, map.get(c) + 1); // map.computeIfPresent(c,(k,v) -> v+1);
      else map.put(c, 1);

    for (Map.Entry entry : map.entrySet())
      System.out.println(entry.getKey() + " " + entry.getValue());
  }

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
  void fizzBuzz(int n) {
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
      System.out.println(" ");
    }
  }
}
