package com.company.www.algorithms.dynamic.programming;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DPExamplesTest {
  @Test
  public void longestCommonSubDP() throws Exception {
    String first  = "ABAB";
    String second = "BABA";
    System.out.println(dp.longestCommonSubDP(first, second));
  }


    @Test
  public void maxSumPath() throws Exception {
    int mat[][] = { { 5, 6, 1, 7 },
                    { -2, 10, 8, -1 },
                    { 3, -7, -9, 11 },
                    { 12, -4, 2, 6 } };

    int mat2[][] = { { 10, 10, 2, 0, 20, 4 },
                     { 1, 0, 0, 30, 2, 5 },
                     { 0, 10, 4, 0, 2, 0 },
                     { 1, 0, 2, 20, 0, 4 } };

    int mat3[][] = {{1, 2, 3},
                    {9, 8, 7},
                    {4, 5, 6}};

    Assert.assertEquals(28, dp.maxSumPath(mat));
    Assert.assertEquals(74, dp.maxSumPath(mat2));
    Assert.assertEquals(17, dp.maxSumPath(mat3));
  }

  @Test
  public void getLRSLength() throws Exception {
    String first = "AABB";
    String second = "AABB";
    System.out.println(dp.getLRSLength(first,second,4,4));
  }

  @Test
  public void printLCS() throws Exception {
    String first = "AGTGATG";
    String second = "GTTAG";
    Assert.assertEquals("GTAG", dp.getLCS(first, second));
  }

  @Test
  public void maxSquareMatrix() throws Exception {
    int[][] mat = {
      {0, 1, 1, 0, 1},
      {1, 1, 0, 1, 0},
      {0, 1, 1, 1, 0},
      {1, 1, 1, 1, 0},
      {1, 1, 1, 1, 1},
      {0, 0, 0, 0, 0}
    };
    int[][] result = new int[mat.length][mat[0].length];
    result = new DPExamples().maxSquareMatrix(mat, result);
    printMatrix(result);
  }

  void printMatrix(int[][] dp) {

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[0].length; j++) {
        System.out.print(dp[i][j] + " ");
      }
      System.out.println();
    }
  }

  @Test
  public void longestCommonSeq() throws Exception {
    String first = "ABCD";
    String second = "AFCD";
    Assert.assertEquals(3, new DPExamples().longestCommonSeq(first, second, 4, 4));
  }

  DPExamples dp = new DPExamples();

  @Test
  public void fib() throws Exception {

    System.out.println(dp.fib(42));
  }
}
