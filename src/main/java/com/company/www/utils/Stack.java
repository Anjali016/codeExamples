package com.company.www.utils;

import com.company.www.utils.ifaces.StackInterface;

public class Stack<T> implements StackInterface<T> {

  private int top = -1;
  private int capacity = 50;

  private T[] array = (T[]) new Object[capacity];

  @Override
  public void push(T element) {
    if (array.length < capacity) {
      top++;
      array[top] = element;
    }
  }

  @Override
  public T pop() {
    T temp = (T) array[top];
    top--;
    return temp;
  }

  @Override
  public T peek() {
    return (T) array[top];
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public int size() {
    return top + 1;
  }

  @Override
  public void printStack() {
    int count = top;
    while (count > 0) {
      System.out.println(array[count]);
      count--;
    }
  }
}
