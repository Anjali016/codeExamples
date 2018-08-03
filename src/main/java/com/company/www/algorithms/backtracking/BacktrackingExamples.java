package com.company.www.algorithms.backtracking;

public class BacktrackingExamples {

  /**
   * Given an undirected graph and a number m, determine if the graph can be colored with at most m
   * colors such that no two adjacent vertices of the graph are colored with same color. *
   */
  boolean graphColoring(int[][] graph, int m) {
    int[] colors = new int[graph[0].length];
    boolean result = graphColoring(graph, m, colors, 0);
    if (result) {
      for (int color : colors) System.out.println(color);
    }
    return result;
  }

  private boolean graphColoring(int[][] graph, int m, int[] colors, int v) {
    if (v == graph.length) return true;
    else {
      for (int c = 0; c <= m; c++) {
        if (isSafe(graph, colors, v, c)) {
          colors[v] = c;
          if (graphColoring(graph, m, colors, v + 1)) return true;
        }
      }
    }
    return false;
  }

  private boolean isSafe(int[][] graph, int[] colors, int v, int color) {
    for (int i = 0; i < graph.length; i++)
      if (graph[v][i] == 1 && graph[v][i] == color) return false;
    return true;
  }

  /** N - Queen Problem* */
  private boolean isSafe(int[][] board, int row, int column) {
    for (int c = column; c >= 0; c--) if (board[row][column] == 1) return false;
    for (int r = row, c = column; r >= 0 && c >= 0; r--, c--) if (board[r][c] == 1) return false;
    for (int r = row, c = column; r < board.length && c >= 0; r++, c--)
      if (board[r][c] == 1) return false;
    return true;
  }

  private void placeQueen(int[][] board, int row, int column) {
    board[row][column] = 1;
  }

  private void removeQueen(int[][] board, int row, int column) {
    board[row][column] = 0;
  }

  public boolean solveQueen(int[][] board, int column) {
    if (column >= board[0].length) {
      return true;
    } else {
      for (int row = 0; row < board.length; row++) {
        if (isSafe(board, row, column)) {
          placeQueen(board, row, column);
          if (solveQueen(board, column + 1)) return true;
          removeQueen(board, row, column);
        }
      }
      return false;
    }
  }

  /**
   * A Maze is given as N*N binary matrix of blocks where source block is the upper left most block
   * i.e., maze[0][0] and destination block is lower rightmost block i.e., maze[N-1][N-1]. A rat
   * starts from source and has to reach the destinationa and can move only in two directions:
   * forward and down
   */
  void solveMaze(int[][] board) {
    int[][] solution = new int[board.length][board[0].length];
    if (solveMazeUtil(solution, board, board.length - 1, board[0].length - 1))
      printMatrix(solution);
  }

  private void printMatrix(int[][] solution) {
    for (int i = 0; i < solution.length; i++) {
      for (int j = 0; j < solution[0].length; j++) System.out.print(solution[i][j]);
      System.out.println();
    }
  }

  private boolean solveMazeUtil(int[][] solution, int[][] maze, int i, int j) {
    if (i == 0 && j == 0 && maze[0][0] == 1) {
      solution[0][0] = 1;
      return true;
    } else {
      if (isValid(maze, i, j)) {
        solution[i][j] = 1;
        if (solveMazeUtil(solution, maze, i, j - 1) || solveMazeUtil(solution, maze, i - 1, j))
          return true;
        solution[i][j] = 0;
      }
      return false;
    }
  }

  private boolean isValid(int[][] maze, int i, int j) {
    return (i >= 0 && j >= 0 && maze[i][j] == 1);
  }

  /**
   * given a N * M chessboard, a Knight’s Tour is defined as the Sequence of moves of a Knight, such
   * that the Knight visits every square only once.*
   */
  int MaxMove = 64; // for 8*8 chess Board

  private int Moves[][] =
      new int[][] {{2, 1}, {2, -1}, {1, 2}, {1, -2}, {-2, 1}, {-2, -1}, {-1, 2}, {-1, -2}};

  void solveKnightTour(int[][] board) {
    knightsTourUtil(board, 0, 0, 1);
  }

  private boolean isSafeMove(int[][] board, int r, int c) {
    if (r < 0 || r >= board.length - 1 || c < 0 || c >= board.length - 1 || board[r][c] != -1)
      return false;
    return true;
  }

  private boolean knightsTourUtil(int[][] board, int presentRow, int presentCol, int KthMove) {
    if (KthMove >= board.length * board.length) {
      return true;
    }
    for (int i = 0; i < Moves.length; i++) {
      int nextRow = presentRow + Moves[i][0];
      int nextCol = presentCol + Moves[i][1];
      if (isSafeMove(board, nextRow, nextCol)) {
        board[nextRow][nextCol] = KthMove;
        if (knightsTourUtil(board
                , nextRow, nextCol, KthMove + 1)) {
          return true;
        }
        board[nextRow][nextCol] = -1;
      }
    }
    return false;
  }
}
