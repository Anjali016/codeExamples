package com.company.www.utils;

import com.company.www.ifaces.GraphInterface;

public class Graph<T> implements GraphInterface<T> {

  @Override
  public boolean contains(T vertex) {
    return false;
  }

  @Override
  public void dFS(int[][] mat) {
    boolean[] isVisited = new boolean[mat.length];
    for (int i = 0; i < mat.length; i++) if (!isVisited[i]) depthFirstSearch(mat, i, isVisited);
  }

  private void depthFirstSearch(int[][] mat, int i, boolean[] isVisited) {
    isVisited[i] = true;
    System.out.print(i + " ");
    for (int j = 0; j < mat[0].length; j++) if (!isVisited[j] && mat[i][j] == 1) depthFirstSearch(mat, j, isVisited);
  }

  @Override
  public void add(T vertex) {}

  @Override
  public void connection(T from, T to) {}

  @Override
  public void size() {}

  @Override
  public void remove(T vertex) {}
}
