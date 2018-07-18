package com.company.www.dataStructures.heap;

public class HeapExamples {

  void buildMaxHeap(int[] array) {
    int n = array.length;
    for (int i = n / 2 - 1; i >= 0; i--) heapify(array, i);
  }

  private void heapify(int[] array, int i) {
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int max = i;
    if (array.length > left && array[left] > array[max]) max = left;
    if (array.length > right && array[right] > array[max]) max = right;
    if (max != i) {
      swap(array, max, i);
      heapify(array, max);
    }
  }

  private void swap(int[] array, int i, int j) {

    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
