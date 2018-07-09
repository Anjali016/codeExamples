package com.company.www.utils.ifaces;

public interface QueueInterface<T> {

  public void add(T Object);

  public void remove(T Object);

  public void printQueue();
}
