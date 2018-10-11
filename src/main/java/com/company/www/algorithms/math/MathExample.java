package com.company.www.algorithms.math;

public class MathExample {

  /** Check if a number is prime or not. * */
  boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (int i = 5; i * i <= n; i = i + 6) if (n % i == 0 || n % (i + 2) == 0) return false;

    return true;
  }

  /**
   * Find all the prime factors of a number. Following are the steps to find all prime factors. 1)
   * While n is divisible by 2, print 2 and divide n by 2. 2) After step 1, n must be odd. Now start
   * a loop from i = 3 to square root of n. While i divides n, print i and divide n by i, increment
   * i by 2 and continue. 3) If n is a prime number and is greater than 2, then n will not become 1
   * by above two steps. So print n if it is greater than 2.*
   */


  /**
   * List all the armstrong number from 1 to 500. Definition according to c programming point of
   * view: Those numbers which sum of the cube of its digits is equal to that number are known as
   * Armstrong numbers. For example 153 since 1^3 + 5^3 + 3^3 = 1+ 125 + 9 =153
   */
}
