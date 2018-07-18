package com.company.www.ifaces;

public interface QueueInterface<T> {

  public void add(T Object);

  public void remove(T Object);

  public void printQueue();
}
