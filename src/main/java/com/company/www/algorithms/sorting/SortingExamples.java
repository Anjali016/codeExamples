package com.company.www.algorithms.sorting;

import java.util.HashMap;

class SortingExamples {

  /** Selection Sort * */
  void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++)
        if (arr[min] > arr[j]) {
          min = j;
          swap(arr, min, i);
        }
    }
  }

  /** Bubble Sort* */
  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  void bubbleSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) swap(array, j, j + 1);
      }
    }
  }

  /** Insertion Sort * */
  void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      int j = i - 1;
      while (j >= 0 && array[j] > temp) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = temp;
    }
  }

  /** Merge Sort Complexity = O(NlogN) */
  void mergeSort(int[] array) {
    mergeSortUtil(array, 0, array.length - 1);
  }

  private void mergeSortUtil(int[] arr, int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;
      mergeSortUtil(arr, start, mid);
      mergeSortUtil(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }
  }

  private void merge(int[] array, int start, int mid, int end) {
    int leftCount = mid - start + 1;
    int rightCount = end - mid;
    int[] leftArray = new int[leftCount + 1];
    int[] rightArray = new int[rightCount + 1];
    for (int i = 0; i <= leftCount; i++) leftArray[i] = array[i + start];
    for (int j = 0; j < rightCount; j++) rightArray[j] = array[j + mid + 1];
    // System.arraycopy(array, start, leftArray, 0, leftCount);
    // System.arraycopy(array, mid+1, rightArray, 0, rightCount);
    leftArray[leftCount] = Integer.MAX_VALUE;
    rightArray[rightCount] = Integer.MAX_VALUE;
    int lPointer = 0;
    int rPointer = 0;
    for (int i = start; i <= end; i++) {
      if (leftArray[lPointer] <= rightArray[rPointer]) {
        array[i] = leftArray[lPointer];
        lPointer++;
      } else {
        array[i] = rightArray[rPointer];
        rPointer++;
      }
    }
  }

  void quickSort(int[] array) {
    quickSortUtil(array, 0, array.length);
  }

  void quickSortUtil(int[] arr, int start, int end) {
    if (start < end) {
      int pivot = partition(arr, start, end);
      quickSortUtil(arr, start, pivot - 1);
      quickSortUtil(arr, pivot + 1, end);
    }
  }

  private int partition(int[] arr, int start, int end) {
    int pivot = arr[end - 1];
    int itr = start - 1;
    for (int j = start; j < end - 1; j++) {
      if (arr[j] <= pivot) {
        itr++;
        swap(arr, itr, j);
      }
    }
    swap(arr, itr + 1, end - 1);
    return itr + 1;
  }

  /** LRU * */
  class LRUNode {
    LRUNode previous;
    LRUNode next;
    int key, value;

    LRUNode(int key, int value) {
      this.key = key;
      this.value = value;
    }
  }

  private int capacity;
  private HashMap<Integer, LRUNode> cache = new HashMap<Integer, LRUNode>();
  private LRUNode front = null, end = null;

  void LRU(int key, int value) {
    if (cache.containsKey(key)) {
      LRUNode requestedNode = cache.get(key);
      requestedNode.value = value;
      remove(requestedNode);
      setHead(requestedNode);
    } else {
      LRUNode newNode = new LRUNode(key, value);
      if (cache.size() > capacity) {
        cache.remove(end.key);
        remove(end);
        setHead(newNode);
      } else {
        setHead(newNode);
        cache.put(key, newNode);
      }
    }
  }

  private void setHead(LRUNode node) {
    node.next = front;
    node.previous = null;
    if (front != null) front.previous = node;
    front = node;
    if (end == null) end = null;
  }

  private void remove(LRUNode node) {
    if (node.next != null) node.next.previous = node.next;
    else end = node.previous;

    if (node.previous != null) node.previous.next = node.next;
    else front = node.next;
  }

  int get(int key) {
    if (cache.containsKey(key)) {
      LRUNode node = cache.get(key);
      remove(node);
      setHead(node);
      return node.value;
    } else return -1;
  }
}
