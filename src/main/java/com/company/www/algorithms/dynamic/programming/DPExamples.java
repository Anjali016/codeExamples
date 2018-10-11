package com.company.www.algorithms.dynamic.programming;

import java.util.Arrays;
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

  /**
   * 217. Problem: Find maximum possible stolen value from houses. There are n houses build in a
   * line, each of which contains some value in it. A thief is going to steal the maximal value of
   * these houses, but he can’t steal in two adjacent houses because owner of the stolen houses will
   * tell his two neighbour left and right side. What is the maximum stolen value.
   */

  /**
   * Problem: Maximum length subsequence with difference between adjacent elements as either 0 or
   * 1.*
   */

  /** Longest Palindromic Substring * */

  /**
   * Maximum sum path in a matrix from top to bottom. allowed to move only diagonally in higher row.
   * *
   */
  int maxSumPath(int[][] matrix) {
    int rows = matrix.length;
    int col = matrix[0].length;
    int[][] dp = new int[rows + 2][col + 2];
    int result = Integer.MIN_VALUE;
    for (int i = 0; i < col; i++) {
      dp[1][i + 1] = matrix[0][i];
    }

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= col; j++) {
        dp[i][j] = matrix[i - 1][j - 1] + Math.max(dp[i - 1][j - 1], dp[i - 1][j + 1]);
        result = Math.max(result, dp[i][j]);
      }
    }
    /*for (int i = 0; i < rows+2; i++) {
          System.out.println();
          for (int j = 0; j < col+2; j++) {
            System.out.print(dp[i][j] + " ");
        }  }
    */

    return result;
  }

  /**
   * Problem: Maximum size square sub-matrix with all 1s Given a binary matrix, find out the maximum
   * size square sub-matrix with all 1s. *
   */
  int[][] maxSquareMatrix(int[][] matrix, int[][] dp) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (i == 0 || j == 0 || matrix[i][j] == 0) dp[i][j] = matrix[i][j];
        else dp[i][j] = 1 + Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j]));
      }
    }
    return dp;
  }

  /**
   * Longest Increasing Subsequence Input : arr[] = {50, 3, 10, 7, 40, 80} longest increasing
   * subsequence of length 4 is {3, 7, 40, 80}
   */

  int findLIS(int[] array){
    int[] dp = new int[array.length];

    for(int i : dp) i = 1;

    for(int i = 1 ; i < array.length ; i++){
      for(int j = 0 ; j < array.length ; j++){
        if(array[i] > array[j] && dp[i] < dp[j] + 1)
          dp[i] = dp[j]+1;
      }
    }
    int result = Integer.MIN_VALUE;
    for(int i : dp)
    result = Math.max(result,i);
    return result;
  }


  /**
   * longest common substring longest common substring for "ABAB" and "BABA" is "BAB" of length 3.
   */


  int longestCommonSubDP(String first, String second) {
    int max = 0;
    int m = first.length();
    int n = second.length();
    dp = new int[m + 1][n + 1];
    for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
        if (i == 0 || j == 0) dp[i][j] = 0;
        else if (first.charAt(i - 1) == second.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1] + 1;
        max = Math.max(max, dp[i][j]);
      }
    }
    return max;
  }

  /**
   * Longest Common Subsequence LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
   * *
   */
  int[][] dp;

  int longestCommonSeq(String first, String second, int m, int n) {
    dp = new int[first.length() + 1][second.length() + 1];
    int result = 0;
    if (dp[m][n] != 0) return dp[m][n];
    if (m == 0 || n == 0) return 0;
    else if (first.charAt(m - 1) == second.charAt(n - 1))
      return 1 + longestCommonSeq(first, second, m - 1, n - 1);
    else
      result =
          Math.max(
              longestCommonSeq(first, second, m - 1, n), longestCommonSeq(first, second, m, n - 1));
    dp[m][n] = result;
    return result;
  }

  /* print the longest common subsequence **/
  String getLCS(String first, String second) {
    int m = first.length();
    int n = second.length();
    return printLCS(first, second, m, n);
  }

  private String printLCS(String first, String second, int m, int n) {
    if (m == 0 || n == 0) return new String();
    if (first.charAt(m - 1) == second.charAt(n - 1)) {
      return printLCS(first, second, m - 1, n - 1) + first.charAt(m - 1);
    } else {
      if (printLCS(first, second, m - 1, n).length() < printLCS(first, second, m, n - 1).length())
        return printLCS(first, second, m, n - 1);
      return printLCS(first, second, m - 1, n);
    }
  }

  /**
   * Longest Repeated Subsequence Input: str = "aab" Output: "a" The two subsequence are 'a'(first)
   * and 'a' (second). Note that 'b' cannot be considered as part of subsequence as it would be at
   * same index in both.*
   */
  int getLRSLength(String first, String second, int m, int n) {
    if (m == 0 || n == 0) return 0;
    if (first.charAt(m - 1) == second.charAt(n - 1) && m != n)
      return 1 + getLRSLength(first, second, m - 1, n - 1);
    else
      return Math.max(getLRSLength(first, second, m - 1, n), getLRSLength(first, second, m, n - 1));
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
