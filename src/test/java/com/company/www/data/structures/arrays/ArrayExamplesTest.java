package com.company.www.data.structures.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class ArrayExamplesTest {
  @Test
  public void sortThreeType() throws Exception {
    int[] array = {1, 0, 0, 1, 2, 0, 1, 2};
    int[] result = a.sortThreeType(array);
    Arrays.stream(result).forEach(x -> System.out.print(x + " "));
  }

  @Test
  public void countInversion() throws Exception {
    int[] array = {4, 2, 1};
    int[] temp = new int[array.length];
    System.out.println(a.countInversion(array, 0, array.length - 1));
  }

  @Test
  public void checkSum() throws Exception {
    int[] array = {1, 4, 45, 6, 10, 8};
    System.out.println(a.checkSum(array, 20));
  }

  @Test
  public void checkPairSum() throws Exception {
    int[] array = {1, 4, 45, 6, 10, 8};
    a.checkPairSum(array, 16);
  }

  @Test
  public void saggregateOddEven() throws Exception {
    int[] array = {1, 3, 2, 4, 7, 6, 9, 10};
    a.SaggregateOddEven(array);
  }

  @Test
  public void saggregateZeroOne() throws Exception {
    int[] array = {1, 0, 0, 1, 0, 1, 0};
    a.saggregateZeroOne(array);
  }

  @Test
  public void moveZeroToEnd() throws Exception {
    int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
    a.moveZeroToEnd(arr);
  }

  @Test
  public void alternateSign() throws Exception {
    int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
    a.alternateSign(arr);
    Arrays.stream(arr).forEach(X -> System.out.print(X + " "));
  }

  @Test
  public void rotateright() throws Exception {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    a.rotateright(array, 3);
  }

  @Test
  public void rotateByK() throws Exception {
    int[] array = {12, 10, 5, 6, 52, 36};
    a.rotateByK(array, 2);
  }

  /*@Test
    public void countInversion() throws Exception {

  */
  @Test
  public void minimumInRotated() throws Exception {
    int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
    System.out.println(a.minimumInRotated(arr, 0, arr.length - 1));
  }

  @Test
  public void findDuplicates() throws Exception {
    int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
    Set<Integer> result = a.findDuplicates(arr);
    result.forEach(x -> System.out.print(x + " "));
  }

  @Test
  public void getFirstOccur() throws Exception {
    int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
    System.out.println(a.getFirstOccur(arr, 8));
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
    System.out.println(a.elementFrequency(arr, 0));
  }

  @Test
  public void sumOfArrays() throws Exception {
    int[] array1 = {5, 1, 7, 4, 2};
    int[] array2 = {9, 2, 3, 8, 10};
    a.sumOfArrays(array1, array2);
  }

  @Test
  public void micro() throws Exception {
    int[] array = {2, 5, 5};
    System.out.println(a.micro(array, 2));
  }

  @Test
  public void reverseArray() throws Exception {
    int[] array = {9, 2, 3, 8, 10};
    a.reverseArray(array, 0, array.length - 1);
    for (int i : array) System.out.print(i + " ");
  }

  @Test
  public void reversePrint() throws Exception {
    int[] array = {1, 2, 3, 4, 4};
    a.reversePrint(array);
  }

  @Test
  public void findRepeating() throws Exception {
    int[] array = {1, 2, 3, 4, 4};
    System.out.println(a.findRepeating(array, 0, array.length));
  }

  @Test
  public void findMaxLength() throws Exception {
    int[] array = {1, 0, 1, 1, 1, 0, 0};
    System.out.println(a.findMaxLength(array));
  }

  @Test
  public void subset() throws Exception {
    int[] arr = {1, 2, 3};
    a.subset(arr, "", 0);
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
  public void findAllDuplicate() throws Exception {
    int[] array = {2, 3, 1, 2, 1};
    ArrayList<Integer> result = a.findAllDuplicate(array);
    for (int i : result) System.out.println(i);
  }
}
