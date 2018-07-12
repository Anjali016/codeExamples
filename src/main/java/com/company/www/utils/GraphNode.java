package com.company.www.utils;

import java.util.LinkedList;

public class GraphNode {

  int noOfVertex;
  // LinkedList[] listArray;

  // List<List<Integer>> vertex = new LinkedList<>();

  java.util.List<java.util.List<Integer>> vertex = new LinkedList<>();

  GraphNode(int noOfVertexvertex) {
    this.noOfVertex = noOfVertex;

    for (int i = 0; i < noOfVertexvertex; i++) vertex.add(new LinkedList<>());
  }

  void addEdge(GraphNode graph, int source, int dest) {
    vertex.get(source).add(dest);
  }

  java.util.List<java.util.List<Integer>> getGraph() {
    return vertex;
  }
}
