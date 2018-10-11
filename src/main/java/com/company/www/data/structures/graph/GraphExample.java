package com.company.www.data.structures.graph;

import com.company.www.utils.GraphNode;
import com.company.www.utils.MatrixGraph;

import java.util.*;

public class GraphExample {

  /** Using List * */
  List<Integer> list;

  void BFS(int start, GraphNode graph, int noOfVertex) {
    list = new ArrayList<>();
    boolean[] visited = new boolean[noOfVertex];
    java.util.Queue<Integer> queue = new LinkedList<>();
    visited[start] = true;
    queue.add(start);
    while (!queue.isEmpty()) {
      int temp = queue.poll();
      System.out.print(temp + " ");
      list = graph.getGraph().get(temp);
      for (int i : list) {
        if (!visited[i]) {
          visited[i] = true;
          queue.add(i);
        }
      }
    }
  }

  void DFS(int start, GraphNode graph, int noOfVertex) {
    boolean[] visited = new boolean[noOfVertex];
    depthFirst(start, graph, visited);
    for (int i = 0; i < noOfVertex; i++) depthFirst(i, graph, visited);
  }

  private void depthFirst(int start, GraphNode graph, boolean[] visited) {
    if (!visited[start]) {
      visited[start] = true;
      System.out.print(start + " " + "" + "");
      list = graph.getGraph().get(start);
      for (int i : list) depthFirst(i, graph, visited);
    }
  }

  /** Using Matrix * */
  void BFSMatrix(int[][] graph, int start, int vertices) {
    boolean[] visited = new boolean[vertices];
    java.util.Queue<Integer> queue = new LinkedList<>();
    visited[start] = true;
    queue.add(start);
    while (!queue.isEmpty()) {
      int popped = queue.poll();
      System.out.print(popped + " ");
      for (int i = 0; i < vertices; i++) {
        if (graph[popped][i] == 1) {
          if (!visited[i]) {
            visited[i] = true;
            queue.add(i);
          }
        }
      }
    }
  }

  void DFSMatrix(int[][] graph, int start, int vertices) {
    boolean[] visited = new boolean[vertices];
    visited[start] = true;
    DFSMatrix(graph, start, visited);
  }

  private void DFSMatrix(int[][] graph, int start, boolean[] visited) {
    System.out.print(start + " ");
    for (int i = 0; i < graph.length; i++) {
      if (!visited[i] && graph[start][i] == 1) {
        visited[i] = true;
        DFSMatrix(graph, i, visited);
      }
    }
  }

  /** Mother Node in a graph * */
  void motherNode(int[][] graph, int vertices) {
    for (int i = 0; i < vertices; i++) {
      boolean[] visited = new boolean[vertices];
      visited[i] = true;
      motherNode(graph, visited, i, i);
    }
  }

  private boolean isTrue(boolean[] visited) {
    for (boolean i : visited) if (!i) return false;
    return true;
  }

  private void motherNode(int[][] graph, boolean[] visited, int current, int source) {
    if (isTrue(visited)) System.out.println(source);
    for (int i = 0; i < graph.length; i++) {
      if (graph[current][i] == 1 && !visited[i]) {
        visited[i] = true;
        motherNode(graph, visited, i, source);
      }
    }
  }

  /** Detect a cycles in a graph */
  boolean containsCycle(int[][] graph, int vertices) {
    boolean[] visited = new boolean[vertices];
    visited[0] = true;
    return containsCycle(graph, visited, 0);
  }

  private boolean containsCycle(int[][] graph, boolean[] visited, int start) {

    for (int i = 0; i < graph.length; i++) {
      if (graph[start][i] == 1)
        if (visited[i]) return true;
        else {
          visited[i] = true;
          containsCycle(graph, visited, i);
        }
    }
    return false;
  }

  /** Transitive Closure of a Graph using DFS * */
  MatrixGraph transitiveClosure(MatrixGraph graph, MatrixGraph closure) {
    for (int i = 0; i < closure.length(); i++) closure.insertEdge(i, i);
    for (int node : graph.allNodes()) {
      getTransitiveClosure(graph, closure, new boolean[graph.length()], node, node);
    }
    return closure;
  }

  private void getTransitiveClosure(
      MatrixGraph graph, MatrixGraph closure, boolean[] visited, int current, int source) {
    visited[current] = true;
    for (int node : graph.getNeighbours(current)) {
      if (!visited[node]) {
        visited[node] = true;
        closure.insertEdge(source, node);
        getTransitiveClosure(graph, closure, visited, node, source);
      }
    }
  }

  /** Count all possible paths between two vertices * */
  /*int pathCount(MatrixGraph graph, int source, int dest) {
      return pathCountDFS(graph, source, dest, new HashSet<>());
    }
  */
  int pathCount(MatrixGraph graph, int current, int dest, Set<Integer> visited) {
    if (visited.contains(current)) return 0;
    else if (current == dest) return 1;
    else {
      int count = 0;
      for (Integer neighbour : graph.getNeighbours(current)) {
        Set<Integer> visitedNodes = new HashSet<>();
        visitedNodes.addAll(visited);
        visitedNodes.add(current);
        count = count + pathCount(graph, neighbour, dest, visitedNodes);
      }
      return count;
    }
  }

  /** Check if two nodes are on same path in a tree */
  boolean hasSamePath(MatrixGraph graph, int node1, int node2, int root, Set<Integer> path) {
    if (path.contains(root)) return false;
    else if (path.contains(node1) && path.contains(node2)) return true;
    else {
      boolean result = false;
      if (graph.getNeighbours(root).isEmpty()) {
        path.add(root);
        return path.contains(node1) && path.contains(node2);
      }
      for (Integer neighbour : graph.getNeighbours(root)) {
        Set<Integer> pathNodes = new HashSet<>();
        pathNodes.addAll(path);
        pathNodes.add(root);
        result = result || hasSamePath(graph, node1, node2, neighbour, pathNodes);
      }
      return result;
    }
  }

  /** Topological Sorting * */
  Stack<Integer> topologicalSort(MatrixGraph graph) {
    Stack<Integer> stack = new Stack<>();
    Set<Integer> visited = new HashSet<>();
    for (int node : graph.allNodes())
      if (!visited.contains(node)) sortGraph(graph, node, visited, stack);
    return stack;
  }

  private void sortGraph(
      MatrixGraph graph, int current, Set<Integer> visited, Stack<Integer> stack) {
    visited.add(current);
    for (int neighbour : graph.getNeighbours(current)) {
      if (!visited.contains(neighbour)) sortGraph(graph, neighbour, visited, stack);
    }
    stack.push(current);
  }

  /** Dijkstra's Algorithm **/

  class MinHeap{

    MatrixGraph graph ;

    MinHeap(MatrixGraph graph){
      for(int node : graph.allNodes());

    }

  }














}
