package com.company.www.data.structures.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class ArrayExamplesTest {
  @Test
  public void findDuplicates() throws Exception {
    int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
    Set<Integer> result = a.findDuplicates(arr);
    result.forEach(x ->System.out.print(x + " "));
  }

  @Test
  public void getFirstOccur() throws Exception {
    int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
    System.out.println(a.getFirstOccur(arr,8));
  }

    @Test
  public void segregate() throws Exception {
    int[] arr = {1, 1, 1, 2, 2, 0};
    a.segregate(arr);
    Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
  }

  @Test
  public void elementFrequency() throws Exception {
    int[] arr = {1, 1, 1, 2, 2, 0};
    System.out.println(a.elementFrequency(arr,0));
  }

  @Test
  public void sumOfArrays() throws Exception {
    int[] array1 ={5, 1, 7, 4, 2};
    int[] array2 ={9, 2, 3, 8, 10};
    a.sumOfArrays(array1,array2);
  }

  @Test
  public void micro() throws Exception {
    int[] array = {2, 5, 5};
    System.out.println(a.micro(array,2));
  }

  @Test
  public void reverseArray() throws Exception {
    int[] array ={9, 2, 3, 8, 10};
    a.reverseArray(array,0,array.length-1);
    for (int i : array) System.out.print(i+ " ");
  }

  @Test
  public void reversePrint() throws Exception {
    int[] array ={1,2,3,4,4};
    a.reversePrint(array);
  }

  @Test
  public void findRepeating() throws Exception {
    int[] array ={1,2,3,4,4};
    System.out.println(a.findRepeating(array,0,array.length));
  }

  @Test
  public void findMaxLength() throws Exception {
    int[] array = {1, 0, 1, 1, 1, 0, 0};
    System.out.println(a.findMaxLength(array));
  }

  @Test
  public void subset() throws Exception {
    int[] arr = {1, 2, 3};
    a.subset(arr,"",0);
  }

  @Test
  public void leader() throws Exception {
    int[] array = {100, 16, 17, 4, 3, 5, 2};
    ArrayList<Integer> result = arr.leader(array);
    for (int i : result) System.out.println(i);
  }

  ArrayExamples arr = new ArrayExamples();

  @Test
  public void kadane() throws Exception {
    int[] array = {-2, -3, 4, -1, -2, 1, 5, 6, -3};
    System.out.println(arr.Kadane(array));
  }

  @Test
  public void longestConsecutive() throws Exception {
    int[] array = {4, 2, 1, 6, 5};

    System.out.println(arr.longestConsecutive(array));
  }

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
