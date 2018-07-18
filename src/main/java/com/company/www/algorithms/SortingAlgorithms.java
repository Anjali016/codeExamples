package com.company.www.algorithms;

public class SortingAlgorithms {

  private void swap(int[] a, int i, int j) {
    if (i != j) {
      a[i] = a[i] ^ a[j];
      a[j] = a[i] ^ a[j];
      a[i] = a[i] ^ a[j];
    }
  }

  /**
   * Selection Sort : O(n^2) as there are two nested loops.* Find the smallest element and swap it
   * with the first element. Keep repeating this until all the element in the array are sorted.
   */
  private int smallestElement(int[] array, int start, int end) {
    int min = start;

    for (int i = start + 1; i < end; i++) if (min > array[i]) array[i] = min;

    return min;
  }
}
