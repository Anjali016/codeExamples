package com.company.www.recursion;

import com.company.www.utils.LinkNode;
import org.junit.Test;

import java.util.Stack;

public class RecursionExamplesTest {
  @Test
  public void reverse() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next = new LinkNode(3);
    System.out.println(recur.reverse(head).data);
  }

    RecursionExamples recur = new RecursionExamples();

  @Test
  public void cutRod() throws Exception {
    int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] value = {3, 5, 8, 9, 10, 17, 17, 20};
    System.out.println(recur.cutRod(8, length, value, 0));
  }

  @Test
  public void rodLength() throws Exception {
    int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
    recur.cutRod(8, length, "", 0);
  }

  @Test
  public void subset() throws Exception {
    recur.subset("", "AB");
  }

  @Test
  public void permutation() throws Exception {
    recur.permutation("", "ginstr");
  }

  @Test
  public void knapSack() throws Exception {
    int[] items = {2, 2, 3, 4};
    int[] value = {10, 40, 50, 20};
    System.out.println(recur.knapSack(items, value, 5));
  }

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

  /*@Test
    public void maxSong() throws Exception {
      int[] songs = {2, 4, 3, 5, 5, 2, 4};
      System.out.println(recur.maxSong(songs, 0, songs.length - 1, 20, 0, 0));
    }
  */
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
    int[] change = new int[] {1, 2};
    System.out.println(recur.minimumCoin(3, change));
  }
}
