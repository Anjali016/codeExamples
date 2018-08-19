package com.company.www.recursion;

import com.company.www.utils.LinkNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class RecursionExamples {
  int count = 0;

  /**
   * Given a list of items with values and weights, as well as a max weight, find the maximum value
   * you can generate from items, where the sum of the weights is less than or equal to the max. eg.
   * items = {(w:2, v:6), (w:2, v:10), (w:3, v:12)} max weight = 5 knapsack(items, max weight) = 22
   * *
   */
  int knapSack(int[] items, int[] value, int W) {
    return knapSack(items, value, W, 0);
  }

  private int knapSack(int[] items, int[] value, int w, int i) {
    if (i == items.length) return 0;
    if (w - items[i] < 0) return knapSack(items, value, w, i + 1);
    else {
      int including = knapSack(items, value, w - items[i], i + 1) + value[i];
      int excluding = knapSack(items, value, w, i + 1);
      return Math.max(including, excluding);
    }
  }
  /**
   * Given an array of songs length and journey time, maximum number of songs that can be played
   * during the journey. Constraint:- Either song should be completed or should not be played. Ex:-
   * [2, 4, 3, 5, 5, 2, 4] and Journey time = 20 Output: – 5, and for [2, 4, 3, 5, 5, 2, 4, 3] and Journey
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

  /** How many of ways have sum 20 * */
  void songCombinationSum(int[] songs, String sofar, int start, int end, int sum, int value) {
    if (start > end || sum == value) {
      if (sum == value) System.out.println("{" + sofar + "}");
    } else {
      songCombinationSum(songs, sofar + songs[start], start + 1, end, sum + songs[start], value);
      songCombinationSum(songs, sofar, start + 1, end, sum, value);
    }
  }

  /** max length subset * */
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
          subSetLength(
              songs,
              soFar + songs[start] + " ",
              start + 1,
              sum - songs[start],
              currLen + 1,
              subset);
          subSetLength(songs, soFar, start + 1, sum, currLen, subset);
        }
      }
    }
  }

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

  /*void songMaxLength(int[] songs, String sofar, int start, int sum, List<String> songSet, String sumSoFar ) {
      if (start < songs.length-1 || sum >= 0) {
          songSet.add(sumSoFar);
              System.out.println("{" + sofar + "}");

      } else {
          songMaxLength(songs, sofar + songs[start], start + 1, sum - songs[start], songSet,sumSoFar );
          songMaxLength(songs, sofar, start + 1, sum,songSet, sumSoFar);
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
  }*/

  /** Binary Search using recursion * */
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

  /** Reverse a LinkedList* */
  LinkNode reverse(LinkNode head) {
    if (head == null || head.next == null) return head;
    else {
      LinkNode current = reverse(head.next);
      head.next.next = head;
      head.next = null;
      return current;
    }
  }

  /**
   * Given an integer representing a given amount of change, write a function to compute the total
   * minimum number of coins required to make that amount of change. You can assume that there is
   * always a 1¢ coin. eg. (assuming American coins: 1, 5, 10, and 25 cents) makeChange(1) = 1 (1)
   * makeChange(6) = 2 (5 + 1) makeChange(49) = 7 (25 + 10 + 10 + 1 + 1 + 1 + 1)*
   */
  int minimumCoin(int value, int[] change) {
    if (value == 0) return 0;
    int minCoin = Integer.MAX_VALUE;
    for (int coin : change) {
      if (value - coin >= 0) {
        int currMin = minimumCoin(value - coin, change);
        if (currMin < minCoin) minCoin = currMin;
      }
    }
    return minCoin + 1;
  }

  /** Permutation of a string * */
  void permutation(String soFar, String rem) {
    if (rem.isEmpty()) System.out.println(soFar);

    for (int i = 0; i < rem.length(); i++) {
      permutation(soFar + rem.charAt(i), rem.substring(0, i) + rem.substring(i + 1));
    }
  }

  /** Subset of a string* */
  void subset(String soFar, String rem) {
    if (rem.isEmpty()) System.out.println(soFar);
    else {
      subset(soFar + rem.charAt(0), rem.substring(1));
      subset(soFar, rem.substring(1));
    }
  }

  /** Find the number of ways of cutting a rod of length 8 in to length of {1, 2, 6, 7}* */
  void cutRod(int rodLength, int[] length, String soFar, int start) {
    if (start > length.length - 1 || rodLength == 0) {
      if (rodLength == 0) System.out.println(soFar);
    } else {
      cutRod(rodLength - length[start], length, soFar + length[start], start + 1);
      cutRod(rodLength, length, soFar, start + 1);
    }
  }

  /**
   * ways of cutting a rod of length 8 in to length of {1, 2, 6, 7} to maximize the profit. Given a
   * rod of length n inches and an array of prices that contains prices of all pieces of size
   * smaller than n*
   */
  int cutRod(int rod, int[] length, int[] value, int i) {
    if (i == length.length) return 0;
    if (rod - length[i] < 0) return cutRod(rod, length, value, i + 1);
    else {
      int first = cutRod(rod - length[i], length, value, i + 1) + value[i];
      int second = cutRod(rod, length, value, i + 1);
      return Math.max(first, second);
    }
  }

  class MaxSubset {
    public int size;
    public List<String> result;

    public MaxSubset(int size) {
      this.size = size;
      this.result = new ArrayList<>();
    }
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
