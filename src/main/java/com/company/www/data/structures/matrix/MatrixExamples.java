package com.company.www.data.structures.matrix;

import java.util.ArrayList;
import java.util.List;

class MatrixExamples {


  /** Print all elements in sorted order from row and column wise sorted matrix.*/
  /** Count Negative Numbers in a Column-Wise and Row-Wise Sorted Matrix. Start from top right
   * use binary search. **/
  int countNegatives(int[][] mat) {
      int count = 0;
      int i = 0, j = mat[0].length-1;
      while(i < mat.length && j >= 0){
        if(mat[i][j] < 0) {
          count += j+1;
          i++;
        }
        else j--;
      }
      return count;
  }

  /**
   * Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island.
   * *
   */
  int countIslands(int[][] matrix) {
    int islandCount = 0;
    boolean[][] isVisited = new boolean[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 1 && isVisited[i][j]) {
          dfs(matrix, i, j, isVisited);
          islandCount++;
        }
      }
    }
    return islandCount;
  }

  private void dfs(int[][] matrix, int i, int j, boolean[][] isVisited) {
    isVisited[i][j] = true;
    int[][] moves = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}, {-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
    for (int[] move : moves)
      if (isSafe(matrix, i + move[0], j + move[1], isVisited))
        dfs(matrix, i + move[0], j + move[1], isVisited);
  }

  private boolean isSafe(int[][] matrix, int i, int j, boolean[][] isVisited) {
    return i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && !isVisited[i][j];
  }


  /** Given maximum number of 1s in an island* */
  /**
   * print all the possible paths from top left to bottom right of a mXn matrix with the constraints
   * that from each cell you can either move only to right or down.
   */

  List<String> printAllPaths(int[][] mat, int x, int y) {
    List<String> paths = new ArrayList<>();
    printPaths(mat, "", x, y, paths);
    return paths;
  }

  private void printPaths(int[][] mat, String path, int x, int y, List<String> paths) {
    if (x == mat.length - 1 && y == mat[0].length - 1) {
      paths.add(path + mat[x][y]);
    } else {
      if ((x < mat.length && y < mat[0].length)) {
        printPaths(mat, path + mat[x][y], x + 1, y, paths);
        printPaths(mat, path + mat[x][y], x, y + 1, paths);
      }
    }
  }

  /** Given a matrix, clockwise rotate elements in it. * */
  void rotateMatrixElement(int[][] matrix) {
    int startRow = 0, endRow = matrix.length - 1;
    int startCol = 0, endCol = matrix[0].length - 1;
    int temp;

    while (startCol <= endCol && startRow <= endCol) {

      temp = matrix[startRow][endCol];

      for (int i = endCol; i > startCol; i--) {
        matrix[startRow][i] = matrix[startRow][i - 1];
      }
      startRow++;
      matrix[startRow][endCol] = temp;
      temp = matrix[endRow][endCol];

      for (int j = endRow; j > startRow + 1; j--) {

        matrix[j][endCol] = matrix[j - 1][endCol];
      }
      endCol--;
      matrix[endRow][endCol] = temp;
      temp = matrix[endRow][startCol];

      for (int m = endCol - 1; m > startCol; m--) {
        matrix[endRow][m] = matrix[endRow][m - 1];
      }
      endRow--;
      matrix[startCol][endRow] = temp;
      // temp = matrix[startCol][startRow--];

      for (int n = endRow; n > startCol; n--) {
        matrix[n][startCol] = matrix[n - 1][startCol];
      }
      startCol++;
    }

    print(matrix);
  }

  /** Find the row with maximum number of 1s in a boolean 2D array, where each row is sorted .* */
  int max = Integer.MIN_VALUE;

  int maxRow = 0;

  int maxRowWith1s(int[][] matrix, int row, int col) {
    for (int i = 0; i < col; i++) {
      int index = getFirstIndex(matrix[i], 0, col);
      int count = col - index;
      if (count > max) {
        max = count;
        maxRow = i;
      }
    }
    return maxRow;
  }

  private int getFirstIndex(int[] matrix, int start, int end) {
    if (start < end) {
      int mid = start + end / 2;
      if (matrix[mid] == 0 || matrix[mid - 1] == 0 && matrix[mid] == 1) return mid;
      else if (matrix[mid] == 1) return getFirstIndex(matrix, start, mid - 1);
      else return getFirstIndex(matrix, mid + 1, end);
    }
    return -1;
  }

  /**
   * Given a matrix of odd order i.e(5*5). Task is to check if the center element of the matrix is
   * equal to the individual sum of all the half diagonals.*
   */
  boolean isHalfDiagonal(int[][] matrix, int order) {
    int LD1 = 0;
    int LD2 = 0;
    int RD1 = 0;
    int RD2 = 0;

    for (int i = 0, j = order - 1; i < order; i++, j--) {
      if (i < order / 2) {
        LD1 = LD1 + matrix[i][i];
        LD2 = LD2 + matrix[j][i];
      }
      if (i > order / 2) {
        RD1 = RD1 + matrix[i][i];
        RD2 = RD2 + matrix[j][i];
      }
    }
    return (LD1 == LD2 && LD2 == RD1 && RD1 == RD2 && RD2 == matrix[order / 2][order / 2]);
  }

  /** Efficiently compute sums of diagonals of a matrix Using one loop. * */

  /**
   * Given a matrix of n x n size, Find saddle point of matrix. Element is said to be Saddle point
   * of Matrix if it is both a minimum of its row and a maximum of its column or vice versa.*
   */

  /** Rotate a matrix by 90 degree 1) Transpose 2) Reversing each row of the resultant matrix.* */
  void rotated(int[][] matrix, int[][] result) {
    int row = matrix.length;
    int col = matrix[0].length;
    for (int r = 0; r < row; r++) {
      for (int c = 0; c < col; c++) {
        result[c][row - r - 1] = matrix[r][c];
        System.out.println(result[c][row - r - 1]);
      }
    }
  }

  /** print 90 degree rotated matrix. * */
  void print(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = matrix[0].length - 1; j >= 0; j--) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }
  }

  /** Given a 2D matrix, print all elements of the given matrix in diagonal order .* */
  void diagonal(int[][] matrix) {
    int itr = 0;
    int rows = matrix.length;
    int cols = matrix[0].length;
    while (itr <= rows + cols - 1) {
      for (int j = 0; j < cols; j++) {
        for (int i = 0; i < rows; i++) {
          if (i + j == itr) System.out.print(matrix[i][j] + " ");
        }
      }
      System.out.println();
      itr++;
    }
  }



  /** Print a given matrix in spiral form. * */
  void spiralMatrix(int[][] matrix) {
    int startRow = 0, endRow = matrix.length - 1;
    int startColumn = 0;
    int endColumn = matrix[0].length - 1;

    while (startRow <= endRow && startColumn <= endColumn) {
      for (int i = startColumn; i <= endColumn; ++i) System.out.println(matrix[startRow][i]);
      startRow++;
      for (int i = startRow; i <= endRow; ++i) System.out.print(matrix[i][endColumn]);
      endColumn--;
      if (startRow < endRow) {
        for (int i = endColumn; i >= startColumn; --i) System.out.print(matrix[endRow][i]);
        endRow--;
      }
      if (startColumn < endColumn) {
        for (int i = endRow; i >= startRow; --i) System.out.print(matrix[i][startColumn]);
        startColumn++;
      }
    }
  }
  /**
   * Zero Matrix Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it
   * in place. use the first column and the first row to track if a row/column should be set to 0.
   */
  void zeroMatrix(int[][] matrix) {

    int rowZero = 1;
    int colZero = 1;

    if (matrix.length == 0 || matrix[0].length == 0) return;

    for (int r = 0; r < matrix.length; r++) rowZero = rowZero * matrix[0][r];

    for (int c = 0; c < matrix[0].length; c++) colZero = colZero * matrix[c][0];

    for (int i = 1; i < matrix.length; i++)
      for (int j = 1; j < matrix[0].length; j++)
        if (matrix[i][j] == 0) {
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }

    for (int i = 1; i < matrix.length; i++) {
      if (matrix[i][0] == 0) for (int j = 1; j < matrix[i].length; j++) matrix[i][j] = 0;
    }

    for (int n = 1; n < matrix[0].length; n++) {
      if (matrix[0][n] == 0) for (int m = 1; m < matrix.length; m++) matrix[m][n] = 0;
    }
    if (rowZero == 0) for (int l = 0; l < matrix.length; l++) matrix[0][l] = 0;

    if (colZero == 0) for (int q = 0; q < matrix.length; q++) matrix[q][0] = 0;
  }

  /**
   * Search in a row wise and column wise sorted matrix Given an n x n matrix and a number x, find
   * position of x in the matrix if it is present in it. Else print “Not Found”. In the given
   * matrix, every row and column is sorted in increasing order. The designed algorithm should have
   * linear time complexity.
   *
   * <p>Example :
   *
   * <p>Input : mat[4][4] = { {10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39,
   * 50}}; x = 29 Output : Found at (2, 1)
   */
  public void search(int[][] matrix, int key) {
    int a = 0, k = matrix[0].length - 1;
    // int iterator = matrix[i][k];
    while (a < matrix.length && k >= 0) {
      if (matrix[a][k] < key) a++;
      else {
        if (matrix[a][k] > key) k--;
        else if (matrix[a][k] == key) System.out.println("found at " + a + k);
        return;
      }
    }
  }

  /** Print Transpose of a given matrix * */
  void transpose(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = i + 1; j < mat[0].length; j++) {
        swap(mat, i, j);
      }
    }
  }

  private void swap(int[][] mat, int x, int y) {
    int temp = mat[x][y];
    mat[x][y] = mat[y][x];
    mat[y][x] = temp;
  }
}
