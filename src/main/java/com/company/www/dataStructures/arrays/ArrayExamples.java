package com.company.www.dataStructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayExamples {


  /**You are given an array with duplicates.
   * You have to sort the array with decreasing frequency of elements.
   * If two elements have the same frequency, sort them by their actual value in increasing order.
   Ex: [2 3 5 3 7 9 5 3 7]
   Output: [3 3 3 5 5 7 7 2 9]**/

  public void zeroAndOne(int[] array) {
    int start = 0, end = array.length - 1;
    while (start < end) {
      while (array[start] == 0) start++;
      while (array[end] == 1) end--;
      if (array[start] > array[end]) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
      }
    }
  }

  /**
   * Merge k sorted arrays in to a single sorted array. 1st Method : Copy arrays in a single array
   * and sort them ( nk * log(nk)) 2nd Method : Compare 1st element from each element since they are
   * already sorted. for smallest element array increment the index (kn * k). 3rd Priority Queue :
   * time Complexity(nk*log(k)) *
   */

  /** solve the three sum problem in an array. a+b+c = 0 Time Complexity : linear time O(n)* */
  public ArrayList<int[]> threeSum(int[] arr) {
    ArrayList<int[]> result = new ArrayList<int[]>();
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 3; i++) {
      if (i == 0 || arr[i] > arr[i - 1]) {
        int start = i + 1;
        int end = arr.length - 1;

        while (start < end) {
          if (arr[i] + arr[start] + arr[end] == 0) {
            result.add(new int[] {arr[i], arr[start], arr[end]});
          }
          if (arr[i] + arr[start] + arr[end] < 0) {
            int currentStart = start;
            while (arr[currentStart] == arr[start]) start++;
          } else {
            int currentEnd = end;
            while (arr[currentEnd] == arr[end]) end--;
          }
        }
      }
    }
    return result;
  }

  /**
   * find all of the duplicate elements in an array, elements are given in the range 1<
   * arr<arr.length. Brute Force = O(N^2) Hashset = O(N) time complexity and O(N) space complexity
   * Sorting and compare adjacent = O(N logN)
   */
  public ArrayList<Integer> fillAllDuplicate(int[] array) {
    Set<Integer> resultSet = new HashSet<Integer>();

    for (int i = 0; i < array.length; i++) {
      int index = Math.abs(array[i]) - 1;
      if (array[index] < 0) {
        resultSet.add(array[i]);
      } else array[index] = -array[index];
    }

    return new ArrayList(resultSet);
  }

  /**
   * 1) Initialize start and end indexes as start = 0, end = n-1 2) Swap arr[start] with arr[end] 3)
   */
  public void printReverse(int[] array) {
    for (int i = array.length - 1; i >= 0; i--) System.out.print(array[i]);
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    // String s = array.toString();
    ArrayExamples a = new ArrayExamples();
    a.printReverse(array);
  }

  /**
   * Given a NxN matrix with 0s and 1s. Set every row that contains a 0 to all 0s and set every
   * column that contains a 0 to all 0s.*
   */
  void zeroMatrix(int[][] matrix) {}

  /**
   * alternative peak and valley algorithm. Given an unsorted array of integers, sort the array into
   * a wave like array. An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2]
   * >= arr[3] <= arr[4] >= …..
   *
   * <p>Examples:
   *
   * <p>Input: arr[] = {10, 5, 6, 3, 2, 20, 100, 80} Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}
   * OR {20, 5, 10, 2, 80, 6, 100, 3} OR any other array that is in wave form.
   */
}
