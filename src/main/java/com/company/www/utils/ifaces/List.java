package com.company.www.utils.ifaces;

import com.company.www.utils.LinkNode;

public interface List<T> {
  public void addAtFront(T object);

  public void addAtEnd(T object);

  public void remove(T object);

  public void addAtGivenNode(T object1, T object);

  public int size();

  public boolean isEmpty();

  public void printList();

  public void removeFromFront();

  public LinkNode get(int index);
}
