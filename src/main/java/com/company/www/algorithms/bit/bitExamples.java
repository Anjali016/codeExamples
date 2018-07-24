package com.company.www.algorithms.bit;

public class bitExamples {

  /** rotate an integer by N bits* */
  public int BIT_INT_INTERGER = 32;

  /**
   * Print the number of 1s in the binary representation of a number. and the right most digit with
   * 1 and shift the number by 1*
   */
  int numberofOnes(int x) {
    int sum = 0;
    while (x > 0) {
      sum += x & 1;
      x >>= 1;
    }
    return sum;
  }

  int rotate(int x, int N) {
    return (x << N | x >> (BIT_INT_INTERGER - N));
  }
}
