package com.company.www.dataStructures.arrays;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayExamplesTest {
  @Test
  public void sortFrequency() throws Exception {
    int[] array = {2, 3, 5, 3, 7, 9, 5, 3, 7};
    ArrayExamples arrayExamples = new ArrayExamples();
    arrayExamples.sortFrequency(array);
  }

  @Test
  public void zeroAndOne() throws Exception {
    int[] array = {1, 0, 0, 1, 0, 1, 0};
    ArrayExamples arrayExamples = new ArrayExamples();
    arrayExamples.zeroAndOne(array);
    for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
  }

  @Test
  public void threeSum() throws Exception {
    int[] array = {1, 3, -1, 0};
    ArrayList<int[]> result = a.threeSum(array);
    for (int[] arr : result) {
      for (Object i : arr) System.out.println(i);
    }
  }

  ArrayExamples a = new ArrayExamples();

  @Test
  public void fillAllDuplicate() throws Exception {
    int[] array = {2, 3, 1, 2, 1};
    ArrayList<Integer> result = a.fillAllDuplicate(array);
    for (int i : result) System.out.println(i);
  }
}
