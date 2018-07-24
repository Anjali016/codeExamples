package com.company.www.recursion;

import org.junit.Test;

import java.util.Stack;

public class RecursionExamplesTest {
  @Test
  public void waysOfSteps() throws Exception {
    int[] steps = {1, 2, 3};
    System.out.println( recur.waysOfSteps(steps,4,""));
  }

  @Test
  public void binarySearch() throws Exception {
    int[] array = {1,4,6,24,34,46};
    System.out.println(recur.binarySearch(array,0,array.length-1,46));
  }

  RecursionExamples recur = new RecursionExamples();

  @Test
  public void reverseStack() throws Exception {
    Stack<Integer> st = new Stack<>();
    st.add(1);
    st.add(2);
    st.add(3);
   Stack<Integer> result = recur.reverseStack(st);
    for (int i : result) System.out.println(i);
  }

  @Test
  public void minimumCoin() throws Exception {
    System.out.println(recur.minimumCoin(49));
  }
}
