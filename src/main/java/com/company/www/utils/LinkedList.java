package com.company.www.utils;

import com.company.www.utils.ifaces.List;

public class LinkedList<T> implements List<T> {

  LinkNode<T> head = null;

  @Override
  public void addAtFront(T object) {
    LinkNode newLinkNode = new LinkNode(object);
    newLinkNode.next = head;
    head = newLinkNode;
  }

  @Override
  public void addAtEnd(Object object) {
    LinkNode newLinkNode = new LinkNode(object);
    LinkNode iterator = head;
    while (iterator.next != null) iterator = iterator.next;
    iterator.next = newLinkNode;
  }

  @Override
  public void printList() {
    while (head != null) {
      System.out.print(head.data + "->");
      head = head.next;
    }
  }

  @Override
  public void removeFromFront() {
    if (head != null) {
      LinkNode temp = head.next;
      head.next = null;
      head = temp;
    }
  }

  @Override
  public LinkNode get(int index) {
    LinkNode x = head;
    for(int i = 0 ; i < index; i++) x = x.next;
    return x;

  }

  @Override
  public void remove(T key) {
    LinkNode temp = head;
    if (size() == 1 || head.data == key) {
      head = head.next;
      return;
    }
    while (temp != null && temp.next.data != key) temp = temp.next;
    LinkNode toRemove = temp.next;
    temp.next = temp.next.next;
    toRemove.next = null;
  }

  @Override
  public void addAtGivenNode(T after, T key) {
    LinkNode toInsert = new LinkNode(key);
    LinkNode temp = head, x = null;
    while (temp.data != after) temp = temp.next;
    x = temp.next;
    temp.next = toInsert;
    toInsert.next = x;
  }

  public void removeFromLast() {
    LinkNode temp = head;
    while (temp.next.next != null) temp = temp.next;
    temp.next = null;
  }

  @Override
  public int size() {
    int count = 0;
    LinkNode iterator = head;
    while (iterator != null) {
      count++;
      iterator = iterator.next;
    }
    return count;
  }


  @Override
  public boolean isEmpty() {
    return size() == 0;
  }
}
