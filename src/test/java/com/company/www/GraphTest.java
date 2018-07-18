package com.company.www;

import com.company.www.utils.Graph;
import org.junit.Test;

public class GraphTest {
  @Test
  public void dFS() throws Exception {
    int[][]  mat = {{0, 1, 1, 1}, {0, 0, 0, 1}, {1, 1, 0, 0}, {0, 0, 0, 0}};
    Graph graph = new Graph();
    graph.dFS(mat);
  }
}