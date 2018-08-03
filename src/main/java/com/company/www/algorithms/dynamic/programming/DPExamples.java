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

  /** find the minimum number of characters to be inserted to convert it to palindrome.**/
}
