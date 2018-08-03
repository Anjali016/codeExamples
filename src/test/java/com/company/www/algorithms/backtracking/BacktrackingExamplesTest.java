package com.company.www.algorithms.backtracking;

import org.junit.Test;

public class BacktrackingExamplesTest {
  @Test
  public void solveKnightTour() throws Exception {
    int[][] board = new int[8][8];
    bt.solveKnightTour(board);
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) System.out.print(board[i][j]);
      System.out.println();
    }
  }

  @Test
  public void solveQueen() throws Exception {
    int[][] board = new int[4][4];
    bt.solveQueen(board, 0);
  }

  BacktrackingExamples bt = new BacktrackingExamples();

  @Test
  public void solveMaze() throws Exception {
    int[][] board = {{1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 1, 1, 1}};
    bt.solveMaze(board);
  }
}
