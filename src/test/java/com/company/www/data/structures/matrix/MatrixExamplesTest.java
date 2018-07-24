package com.company.www.data.structures.matrix;

import org.junit.Test;

public class MatrixExamplesTest {
  @Test
  public void rotated() throws Exception {
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] result = new int[3][3];
    object.rotated(mat, result);
  }

  @Test
  public void print() throws Exception {
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    object.print(mat);
  }

  @Test
  public void diagonal() throws Exception {
    int[][] mat = {{1, 2, 3}, {1, 0, 6}, {7, 8, 0}};
      object.diagonal(mat);
  }

  @Test
  public void countNegative() throws Exception {
    int[][] mat = {{-3, -2, -1, -3}, {-2, 1, 0, 6}, {7, 0, 8, 0}};
    System.out.println(object.countNegative(mat));
  }

  @Test
  public void zeroMatrix() throws Exception {
    int[][] mat = {{1, 2, 3}, {1, 0, 6}, {7, 8, 0}};
    object.zeroMatrix(mat);

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }

  MatrixExamples object = new MatrixExamples();

  @Test
  public void search() throws Exception {
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    object.search(mat, 9);
  }

  @Test
  public void printTranspose() throws Exception {
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    new MatrixExamples().printTranspose(mat);

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }

  @Test
  public void transpose() throws Exception {
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    new MatrixExamples().transpose(mat);

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }

  @Test
  public void spiralMatrix() throws Exception {
    int[][] mat = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
    ;

    object.spiralMatrix(mat);
  }
}
