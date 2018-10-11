package com.company.www.data.structures.graph;

import com.company.www.utils.GraphNode;
import com.company.www.utils.MatrixGraph;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Stack;

public class GraphExampleTest {
  @Test
  public void topologicalSort() throws Exception {
    MatrixGraph graph = new MatrixGraph(6);
    graph.insertEdge(5, 2);
    graph.insertEdge(5, 0);
    graph.insertEdge(2, 3);
    graph.insertEdge(3, 1);
    graph.insertEdge(4, 0);
    graph.insertEdge(4, 1);
    Stack<Integer> result = gr.topologicalSort(graph);
    while(!result.isEmpty()){
      System.out.print(result.pop()+ " ");
    }
  }

  @Test
  public void hasSamePath() throws Exception {
    MatrixGraph graph = new MatrixGraph(7);
    graph.insertEdge(0, 1);
    graph.insertEdge(0, 2);
    graph.insertEdge(0, 3);
    graph.insertEdge(1, 4);
    graph.insertEdge(2, 5);
    graph.insertEdge(3, 6);
    Assert.assertEquals(false, gr.hasSamePath(graph, 5, 6, 0, new HashSet<>()));
    Assert.assertEquals(true, gr.hasSamePath(graph, 0, 3, 0, new HashSet<>()));
    Assert.assertEquals(false, gr.hasSamePath(graph, 2, 3, 0, new HashSet<>()));
    Assert.assertEquals(true, gr.hasSamePath(graph, 3, 6, 0, new HashSet<>()));
    Assert.assertEquals(true, gr.hasSamePath(graph, 0, 5, 0, new HashSet<>()));
    Assert.assertEquals(false, gr.hasSamePath(graph, 1, 2, 0, new HashSet<>()));
  }

  @Test
  public void pathCount() throws Exception {
    MatrixGraph graph = new MatrixGraph(4);
    graph.insertEdge(0, 1);
    graph.insertEdge(0, 2);
    graph.insertEdge(0, 3);
    graph.insertEdge(2, 0);
    graph.insertEdge(2, 1);
    graph.insertEdge(1, 3);
    Assert.assertEquals(3, gr.pathCount(graph, 2, 3, new HashSet<>()));
  }

  @Test
  public void transitiveClosure() throws Exception {
    MatrixGraph graph = new MatrixGraph(4);
    graph.insertEdge(0, 1);
    graph.insertEdge(0, 2);
    graph.insertEdge(1, 2);
    graph.insertEdge(2, 0);
    graph.insertEdge(2, 3);
    graph.insertEdge(3, 3);
    MatrixGraph closure = new MatrixGraph(graph.length());
    gr.transitiveClosure(graph, closure).graphPrint();
  }

  @Test
  public void containsCycle() throws Exception {
    MatrixGraph graph = new MatrixGraph(3);
    graph.insertEdge(0, 1);
    graph.insertEdge(0, 2);
    /*graph.insertEdge(1,2);
    graph.insertEdge(2,0);
    graph.insertEdge(2,3);
    graph.insertEdge(3,3);*/
    System.out.println(gr.containsCycle(graph.getMatrixGraph(), 3));
  }

  @Test
  public void motherNode() throws Exception {
    MatrixGraph graph = new MatrixGraph(4);
    graph.insertEdge(0, 1);
    graph.insertEdge(1, 2);
    graph.insertEdge(2, 3);
    gr.motherNode(graph.getMatrixGraph(), 4);
  }

  @Test
  public void DFSMatrix() throws Exception {
    MatrixGraph graph = new MatrixGraph(4);
    graph.insertEdge(0, 1);
    graph.insertEdge(0, 2);
    graph.insertEdge(1, 2);
    graph.insertEdge(2, 0);
    graph.insertEdge(2, 3);
    graph.insertEdge(3, 3);
    gr.DFSMatrix(graph.getMatrixGraph(), 0, 4);
  }

  @Test
  public void BFSMatrix() throws Exception {
    MatrixGraph graph = new MatrixGraph(4);
    graph.insertEdge(0, 1);
    graph.insertEdge(0, 2);
    graph.insertEdge(1, 2);
    graph.insertEdge(2, 0);
    graph.insertEdge(2, 3);
    graph.getMatrixGraph();
    gr.BFSMatrix(graph.getMatrixGraph(), 2, 4);
  }

  @Test
  public void DFS() throws Exception {
    GraphNode graph = new GraphNode(4);
    graph.addEdge(graph, 0, 1);
    graph.addEdge(graph, 0, 2);
    graph.addEdge(graph, 1, 2);
    graph.addEdge(graph, 2, 0);
    graph.addEdge(graph, 2, 3);
    gr.DFS(2, graph, 4);
  }

  GraphExample gr = new GraphExample();

  @Test
  public void BFS() throws Exception {
    GraphNode graph = new GraphNode(4);
    graph.addEdge(graph, 0, 1);
    graph.addEdge(graph, 0, 2);
    graph.addEdge(graph, 1, 2);
    graph.addEdge(graph, 2, 0);
    graph.addEdge(graph, 2, 3);
    gr.BFS(2, graph, 4);
  }
}
