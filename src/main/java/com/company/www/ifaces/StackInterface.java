package com.company.www.ifaces;

public interface StackInterface<T> {

  public void push(T object);

  public T pop();

  public T peek();

  boolean isEmpty();

  public int size();

  public void printStack();
}
