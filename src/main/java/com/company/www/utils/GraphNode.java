package com.company.www.utils;

public class GraphNode {

  private int noOfVertex;
  LinkedList[] listArray;

  GraphNode(int noOfVertex) {
    this.noOfVertex = noOfVertex;

    listArray = new LinkedList[noOfVertex];
    for (int i = 0; i < noOfVertex; i++) listArray[i] = new LinkedList<>();
  }
}
