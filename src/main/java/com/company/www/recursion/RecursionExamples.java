package com.company.www.recursion;

import java.util.Stack;

public class RecursionExamples {

  /**A child is running up a stairs with n steps and can hop either 1 step, 2 steps, or 3 steps at a time.
   * Implement a method to count how many possible ways the child can run up the stairs.**/

    int count = 0;

  int waysOfSteps(int[] steps, int stairs, String path) {
    if (stairs == 0) {
      count = count + 1;
      System.out.println("path " + count + path);
    } else {
      for (int i : steps) {
        if (stairs - i >= 0) waysOfSteps(steps, stairs - i, path + " -> " + i);
      }
    }
    return count;
  }

  /** Binary Search using recursion .* */
  int binarySearch(int[] arr, int start, int end, int key) {
    if (start <= end) {
      int mid = (end + start) / 2;
      if (arr[mid] > key) return binarySearch(arr, start, mid - 1, key);
      else if (arr[mid] < key) return binarySearch(arr, mid + 1, end, key);
      else return mid;
    } else return -1;
  }

  /**
   * how to reverse a stack in place. without using any other data structure. pop the elements one
   * by one recursively from the stack and add them at the bottom of the stack* time complexity
   * reverse = o(n)*O(n) and insertAtbottom = O(n)
   */
  Stack<Integer> reverseStack(Stack<Integer> stack) {
    if (stack.isEmpty()) return stack;
    int temp = stack.pop();
    reverseStack(stack);
    insertAtBottom(stack, temp);
    return stack;
  }

  private void insertAtBottom(Stack<Integer> stack, int x) {
    if (stack.isEmpty()) {
      stack.push(x);
      return;
    }
    int temp = stack.pop();
    insertAtBottom(stack, x);
    stack.push(temp);
  }

  /**
   * Given an integer representing a given amount of change, write a function to compute the total
   * number of coins required to make that amount of change. You can assume that there is always a
   * 1¢ coin. eg. (assuming American coins: 1, 5, 10, and 25 cents) makeChange(1) = 1 (1)
   * makeChange(6) = 2 (5 + 1) makeChange(49) = 7 (25 + 10 + 10 + 1 + 1 + 1 + 1)*
   */
  int minimumCoin(int num) {

    int[] change = new int[] {1, 5, 10, 25};
    if (num == 0) {
      return 0;
    }
    int minCoin = Integer.MAX_VALUE;

    for (int coin : change) {
      if (num - coin >= 0) {
        int currMin = minimumCoin(num - coin);
        if (currMin < minCoin) minCoin = currMin;
      }
    }
    return minCoin + 1;
  }

  /**
   * Given a value N, if we want to make change for N cents, and we have infinite supply of each of
   * S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins
   * doesn’t matter.
   *
   * <p>For example, for N = 4 and S = {1,2,3}, there are four solutions:
   * {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4.*
   */
  /** BackTracking * */
}
