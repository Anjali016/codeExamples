package com.company.www.algorithms.sorting;

import com.company.www.algorithms.sorting.SortingExamples;
import org.junit.Test;

public class SortingExamplesTest {
  @Test
  public void quickSort() throws Exception {
    int[] array = {2, 9, 3, 12, 8};
    SortingExamples sort = new SortingExamples();
    sort.quickSort(array);
    for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
  }

  @Test
  public void mergeSort() throws Exception {
    int[] array = {2, 9, 3, 12, 8};
    SortingExamples sort = new SortingExamples();
    sort.mergeSort(array);
    for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
  }

  @Test
  public void insertionSort() throws Exception {
    int[] array = {1, 3, 12, 8};
    SortingExamples sort = new SortingExamples();
    sort.insertionSort(array);
    for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
  }

  @Test
  public void bubbleSort() throws Exception {
    int[] array = {1, 5, 2, 8};
    SortingExamples sort = new SortingExamples();
    sort.bubbleSort(array);
    for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
  }

  @Test
  public void selectionSort() throws Exception {
    int[] array = {1, 5, 2, 8};
    SortingExamples sort = new SortingExamples();
    sort.selectionSort(array);
    for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
  }
}
