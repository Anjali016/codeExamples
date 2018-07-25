package com.company.www.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class RecursionExamples {
  int count = 0;
  /**
   * Given an array of songs length and journey time, maximum number of songs that can be played
   * during the journey. Constraint:- Either song should be completed or should not be played. Ex:-
   * [2, 4, 3, 5, 5, 2, 4] and Journey time = 20 Output: – 5 [2, 4, 3, 5, 5, 2, 4, 3] and Journey
   * time = 20 Output:- 6 *
   */

  /** How many ways of listening songs and print each* */

  int songCombination(int[] songs, String sofar, int start, int end) {
    if (start == end) {
      count = count + 1;
      System.out.println("{" + sofar + "}");
    } else {
      songCombination(songs, sofar + songs[start], start + 1, end);
      songCombination(songs, sofar, start + 1, end);
    }
    return count;
  }

  /** How many of ways have sum 20 **/
  void songCombinationSum(int[] songs, String sofar, int start, int end, int sum, int value) {
    if (start > end || sum == value) {
        if (sum == value) System.out.println("{" + sofar + "}");
    } else {
      songCombinationSum(songs, sofar + songs[start], start + 1, end, sum + songs[start], value);
      songCombinationSum(songs, sofar, start + 1, end, sum, value);
    }
  }

  class MaxSubset{
      public int size;
      public List<String> result;

      public MaxSubset(int size) {
          this.size = size;
          this.result = new ArrayList<>();
      }
  }

  /** max length subset**/

  MaxSubset subSetLength(int[] songs) {
      MaxSubset maxSubset = new MaxSubset(0);
      subSetLength(songs, "", 0, 20, 0, maxSubset);
      return maxSubset;
  }
  void subSetLength(int[] songs, String soFar, int start, int sum, int currLen, MaxSubset subset) {
      if (sum >= 0) {
          if (sum == 0) {
              if (currLen > subset.size) {
                  subset.size = currLen;
                  subset.result = new ArrayList<>();
                  subset.result.add(soFar);
              } else if (currLen == subset.size) subset.result.add(soFar);
          } else {
              if (start < songs.length) {
                  subSetLength(songs, soFar + songs[start] + " ", start + 1, sum - songs[start], currLen + 1, subset);
                  subSetLength(songs, soFar, start + 1, sum, currLen, subset);
              }
          }
      }
  }


  /*void songMaxLength(int[] songs, String sofar, int start, int end, int sum, int value, int max, int c) {
      if (start > end || sum == value) {
          if (sum == value) {
              if (max < c) max = c;
              System.out.println("{" + sofar + "}");
          }
      } else {
          songMaxLength(songs, sofar + songs[start], start + 1, end, sum + songs[start], value,max,c+1 );
          songMaxLength(songs, sofar, start + 1, end, sum, value,max,c);
      }
  }

    int maxSong(int[] songs, int start, int end, int journey, int max, int ctr) {
    if (start == end) return max;
    else {
      for (int i = start; i < end; i++) {
        int newJourney = journey - songs[i];
        if (newJourney > 0 && newJourney - songs[i + 1] > 0) {
          // if (max > ctr) max = ctr;
          maxSong(songs, start + 1, end, journey - songs[i], max, ctr + 1);
        }
      }
    }
    return Math.max(max, ctr);
  }
*/
  /**
   * A child is running up a stairs with n steps and can hop either 1 step, 2 steps, or 3 steps at a
   * time. Implement a method to count how many possible ways the child can run up the stairs.*
   */
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

  /**
   * 4. Problem: Print all possible combinations of r elements in a given array of size n. For
   * example, if input array is {1, 2, 3, 4} and r is 2, then output should be {1, 2}, {1, 3}, {1,
   * 4}, {2, 3}, {2, 4} and {3,4}.
   */
}
