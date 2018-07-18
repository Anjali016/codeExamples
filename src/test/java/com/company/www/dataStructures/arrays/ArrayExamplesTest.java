package com.company.www.dataStructures.arrays;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayExamplesTest {
  @Test
  public void threeSum() throws Exception {
    int[] array = {1,3,-1,0};
    ArrayList<int[]> result = a.threeSum(array);
    for (int[] arr : result) {
      for (Object i : arr)
        System.out.println(i);
    }

  }

  ArrayExamples a = new ArrayExamples();
  @Test
  public void fillAllDuplicate() throws Exception {
    int[] array = {2,3,1,2,1};
    ArrayList<Integer> result = a.fillAllDuplicate(array);
    for (int i : result) System.out.println(i);
  }
}