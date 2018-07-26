package com.company.www.data.structures.heap;

import org.junit.Test;

public class HeapExamplesTest {
  @Test
  public void heapSort() throws Exception {
    int[] array = {100, 3, 8, 7, 10};
    int[] result = new HeapExamples().heapSort(array, array.length);
    for (int i : result)
      System.out.println(i);
  }

  @Test
  public void kLargest() throws Exception {
    int[] array = {100, 3, 8, 7, 10};
    System.out.println(new HeapExamples().kLargest(array,4));
  }

    @Test
  public void buildMaxHeap() throws Exception {
    int[] array = {10, 8, 6, 5, 1};
    new HeapExamples().buildMaxHeap(array,array.length);
    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}
