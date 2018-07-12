package com.company.www.utils;

import com.company.www.utils.ifaces.GraphInterface;

public class Graph<T> implements GraphInterface<T> {


    @Override
    public boolean contains(T vertex) {
        return false;
    }


    @Override
    public void dFS(int[][] graph) {
       boolean[] isVisited = new boolean[graph.length];
        for(int i = 0; i < graph.length;i++)
            if(!isVisited[i]) depthFirst(graph,i,isVisited);
    }

    public void depthFirst(int[][] graph, int i,boolean[] isVisited){
        isVisited[i] = true;
    System.out.println(i + " ");
    for(int j = 0;j<graph[0].length;j++)
        if(!isVisited[i] && graph[i][j] == 1)
            depthFirst(graph,j,isVisited);
    }


    @Override
    public void add(T vertex) {

    }

    @Override
    public void connection(T from, T to) {

    }

    @Override
    public void size() {

    }

    @Override
    public void remove(T vertex) {

    }
}
