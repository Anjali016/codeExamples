package com.company.www.utils.matrixExample;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixExampleTest {
  @Test
  public void spiralMatrix() throws Exception {
    int[][] mat = { {1,  2,  3,  4,  5,  6},
            {7,  8,  9,  10, 11, 12},
            {13, 14, 15, 16, 17, 18}
    };;
   MatrixExample object =  new MatrixExample();
   object.spiralMatrix(mat);


  }
}