package com.company.www.recursion;

import org.junit.Test;

import java.util.List;
import java.util.Stack;

public class RecursionExamplesTest {
  @Test
  public void subSetLength() throws Exception {
    int[] songs = {2, 4, 3, 5, 5, 2, 4};
    RecursionExamples.MaxSubset res = recur.subSetLength(songs);
    res.result.forEach(x -> System.out.println(x));
  }

  @Test
  public void songCombinationSum() throws Exception {
    int[] songs = {2, 4, 3, 5, 5, 2, 4};
    recur.songCombinationSum(songs, "", 0, songs.length - 1, 0, 20);
  }

  @Test
  public void songCombination() throws Exception {
    int[] songs = {1, 2, 3};
    System.out.println(recur.songCombination(songs, "", 0, songs.length));
  }

  @Test
  public void maxSong() throws Exception {
    int[] songs = {2, 4, 3, 5, 5, 2, 4};
    System.out.println(recur.maxSong(songs, 0, songs.length - 1, 20, 0, 0));
  }

  @Test
  public void waysOfSteps() throws Exception {
    int[] steps = {1, 2, 3};
    System.out.println(recur.waysOfSteps(steps, 4, ""));
  }

  @Test
  public void binarySearch() throws Exception {
    int[] array = {1, 4, 6, 24, 34, 46};
    System.out.println(recur.binarySearch(array, 0, array.length - 1, 46));
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
