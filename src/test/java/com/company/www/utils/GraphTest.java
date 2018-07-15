package com.company.www.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {
  @Test
  public void dFS() throws Exception {
    int[][]  mat = {{0, 1, 1, 1}, {0, 0, 0, 1}, {1, 1, 0, 0}, {0, 0, 0, 0}};
    Graph graph = new Graph();
    graph.dFS(mat);
  }
}