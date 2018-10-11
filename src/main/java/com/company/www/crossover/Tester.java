package com.company.www.crossover;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tester {

  /** Complete the function below. DONOT MODIFY anything outside this function! */
  static String conanOrAgasa(int[] cards) {
    Map<Integer, Integer> cardFrequency = new HashMap<>();
    int largestKey = Integer.MIN_VALUE;
    for (int card : cards) {
      if (cardFrequency.containsKey(card)) cardFrequency.put(card, cardFrequency.get(card) + 1);
      else cardFrequency.put(card, 1);
      if (largestKey < card) {
        largestKey = card;
      }
    }

    if (cardFrequency.get(largestKey) % 2 == 1) return "Conan";
    else return "Agasa";
  }

  /** DO NOT MODIFY THIS METHOD! */
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] cards = new int[n];
    for (int i = 0; i < n; i++) {
      cards[i] = in.nextInt();
    }

    // call conanOrAgasa function and print output
    System.out.println(conanOrAgasa(cards));
  }
}
