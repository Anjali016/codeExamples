package com.company.www.utils.ifaces;

public interface GraphInterface<T> {

  public boolean contains(T vertex);

  public void add(T vertex);

  public void connection(T from, T to);

  public void size();

  public void remove(T vertex);
}
