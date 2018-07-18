package com.company.www.ifaces;

public interface GraphInterface<T> {

  public boolean contains(T vertex);

  public void dFS(int[][] graph);

  public void add(T vertex);

  public void connection(T from, T to);

  public void size();

  public void remove(T vertex);
}
