package com.company.www.loadBalancer;

import java.util.Random;

public class RandomGenerator {

  private static int randomGenerator() {
    Random r = new Random();
    return r.nextInt(1000) % 4;
  }

  private static int sequential() {

    int result = 0;
    for (int i = 1; i < 1000; i++) {
      result = i % 4;
      System.out.println(result);
    }
    return result;
  }

  public static void main(String[] args) {
    //  System.out.println(randomGenerator());
    //  System.out.println(sequential());
  }
}
