package com.company.www.utils;

import java.util.ArrayList;

public class GraphNode {

  int noOfVertex;

  java.util.List<java.util.List<Integer>> vertex = new ArrayList<>();

  public GraphNode(int noOfVertex) {
    this.noOfVertex = noOfVertex;
    for (int i = 0; i < noOfVertex; i++) vertex.add(new ArrayList<>());
  }

  public void addEdge(GraphNode graph, int source, int dest) {
    vertex.get(source).add(dest);
  }

  public java.util.List<java.util.List<Integer>> getGraph() {
    return vertex;
  }
}
