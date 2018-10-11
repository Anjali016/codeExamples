package com.company.www.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MatrixGraph {

  int noOfVertex;

  public int[][] graph;

  public MatrixGraph(int noOfVertex) {
    this.noOfVertex = noOfVertex;
    this.graph = new int[noOfVertex][noOfVertex];
  }

  public void insertEdge(int node1, int node2) {
    graph[node1][node2] = 1;
  }

  public int length(){
    return graph.length;
  }
  public int[][] getMatrixGraph() {
    return graph;
  }

  public List<Integer> allNodes(){
    List<Integer> nodes = new LinkedList<>();
    for(int i = 0; i< graph.length;i++) {
      nodes.add(i);
    }
    return nodes;
  }

  public List<Integer> getNeighbours(int node) {
    List<Integer> neighbours = new ArrayList<>();
    for (int i = 0; i < graph.length; i++) {
        if (graph[node][i] == 1) neighbours.add(i);
    }
    return neighbours;
  }

  public void graphPrint() {
    for (int i = 0; i < graph.length; i++) {
      for (int j = 0; j < graph.length; j++) {
        System.out.print(graph[i][j] + " ");
      }
      System.out.println();
    }
  }
}
