package com.company.www.data.structures.matrix;

import org.junit.Test;

import java.util.List;

public class MatrixExamplesTest {
  @Test
  public void countNegatives() throws Exception {
    int[][] mat = { {-3, -2, -1, 1},
                    {-2, 2, 3, 4},
                    {4, 5, 7, 8} };

    System.out.println(object.countNegatives(mat));
  }

  @Test
  public void rotateMatrixElement() throws Exception {
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    object.rotateMatrixElement(mat);
  }

  @Test
  public void printAllpaths() throws Exception {
    int[][] mat = {{1, 2, 3},
            {4, 5, 6}};
    List<String> paths = object.printAllPaths(mat, 0, 0);
    for (String path : paths) {
      System.out.println(path);
    }
  }

  @Test
  public void topToBottomPath() throws Exception {
    int[][] mat = {{1, 2, 3},
            {4, 5, 6}};
    //List<String> result = object.topToBottomPath(mat);
    //result.forEach(x -> System.out.println(x));
  }

    @Test
  public void maxRowWith1s() throws Exception {
    int[][] mat = {{0, 0, 1}, {0, 1, 1}, {1, 1, 1}};
    System.out.println(object.maxRowWith1s(mat,3,3));
  }

    MatrixExamples object = new MatrixExamples();

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

  @Test
  public void search() throws Exception {
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    object.search(mat, 9);
  }

  @Test
  public void printTranspose() throws Exception {
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
