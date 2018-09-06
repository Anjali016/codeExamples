package com.company.www.algorithms.dynamic.programming;

import java.util.HashMap;
import java.util.Map;

class DPExamples {

  int count = 0;
  private Map<Integer, Integer> store = new HashMap<>();

  int waysOfSteps(int[] steps, int stairs, String path) {
    if (stairs == 0) {
      count = count + 1;
      System.out.println("path" + count + path);
    } else {
      for (int i : steps) {
        if (stairs - i >= 0) waysOfSteps(steps, stairs - i, path + " -> " + i);
      }
    }
    return count;
  }

  /** Longest Common Subsequence * */
  int[][] temp;

  int longestCommonSeq(String first, String second, int m, int n) {
    temp = new int[first.length() + 1][second.length() + 1];
    int result = 0;
    if (temp[m][n] != 0) return temp[m][n];
    if (m == 0 || n == 0) return 0;
    else if (first.charAt(m - 1) == second.charAt(n - 1))
      return 1 + longestCommonSeq(first, second, m - 1, n - 1);
    else
      result =
          Math.max(
              longestCommonSeq(first, second, m - 1, n), longestCommonSeq(first, second, m, n - 1));
    temp[m][n] = result;
    return result;
  }

  /** Fibonacci Number * */
  int fib(int n) {
    if (n == 0 || n == 1) {
      store.put(0, 1);
      store.put(1, 1);
      return store.get(n);
    } else {
      if (store.containsKey(n)) return store.get(n);
      int result = fib(n - 1) + fib(n - 2);
      store.put(n, result);
      return result;
    }
  }

  /** find the minimum number of characters to be inserted to convert it to palindrome.* */
}
