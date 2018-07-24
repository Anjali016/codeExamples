package com.company.www.algorithms.bit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class bitExamplesTest {
  @Test
  public void numberofOnes() throws Exception {
    bitExamples bit = new bitExamples();
    Assert.assertEquals(2,bit.numberofOnes(3));
  }
}