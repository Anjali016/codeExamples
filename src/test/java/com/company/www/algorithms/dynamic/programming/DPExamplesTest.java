package com.company.www.algorithms.dynamic.programming;

import org.junit.Assert;
import org.junit.Test;

public class DPExamplesTest {

  @Test
  public void longestCommonSeq() throws Exception {
    String first = "ABCD";
    String second = "AFCD";
    Assert.assertEquals(3, new DPExamples().longestCommonSeq(first,second,4,4));
  }

    DPExamples dp = new DPExamples();

  @Test
  public void fib() throws Exception {

    System.out.println(dp.fib(42));
  }
}
