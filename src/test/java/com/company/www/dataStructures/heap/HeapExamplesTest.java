package com.company.www.dataStructures.heap;

import org.junit.Test;

public class HeapExamplesTest {
  @Test
  public void buildMaxHeap() throws Exception {
    int[] array = {10, 8, 6, 5, 1 };
    new HeapExamples().buildMaxHeap(array);
    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}
