package com.company.www.data.structures.heap;

public class HeapExamples {
  /*
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
  }*/

  private void swap(int[] array, int i, int j) {

    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  /** Kth largest element in an array * */

  void buildMaxHeap(int[] array, int heapSize) {
    for (int i = heapSize / 2 - 1; i >= 0; i--) heapify(array, i, heapSize);
  }

  void heapify(int[] array, int i, int heapSize) {
    heapSize = array.length;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int max = i;
    if (left < heapSize && array[left] > array[max]) max = left;
    if (right < heapSize && array[right] > array[max]) max = right;
    if (max != i) {
      swap(array, max, i);
      heapify(array, max, heapSize);
    }
  }

  int kLargest(int[] array, int k) {
    int heapSize = array.length;
    buildMaxHeap(array, heapSize);
    for (int i = 0; i <= k; i++) {
      extractMax(array, heapSize);
      heapSize--;
      heapify(array, 0, heapSize);
    }
    return array[array.length- k - 1];
  }

  private void extractMax(int[] array, int heapSize) {
    swap(array, 0, heapSize - 1);
  }

  /** Heap Sort * */
  int[] heapSort(int[] array, int heapSize) {
    heapSize = array.length;
    for (int i = 0; i < array.length; i++) {
      extractMax(array, heapSize);
      heapSize--;
      heapify(array, 0, heapSize);
    }
    return array;
  }

  /** find sum of first largest k elements from a given array of integers.**/

  int sumKOfLargest(int[] array, int k){
    int heapSize = array.length;
    int sum = 0;
    buildMaxHeap(array,heapSize);
    for(int i = 0; i< k ; i++){
      sum = sum+array[0];
      extractMax(array,heapSize);
      heapSize--;
      heapify(array,i,heapSize);
    }
    return sum;
  }


}
