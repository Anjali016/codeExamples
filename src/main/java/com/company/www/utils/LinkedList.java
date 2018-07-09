package com.company.www.utils;

import com.company.www.utils.ifaces.List;

public class LinkedList<T> implements List<T> {

  Node<T> head = null;

  @Override
  public void addAtFront(T object) {
    Node newNode = new Node(object);
    newNode.next = head;
    head = newNode;
  }

  @Override
  public void addAtEnd(Object object) {
    Node newNode = new Node(object);
    Node iterator = head;
    while (iterator.next != null) iterator = iterator.next;
    iterator.next = newNode;
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
      Node temp = head.next;
      head.next = null;
      head = temp;
    }
  }

  @Override
  public void remove(T key) {
    Node temp = head;
    if (size() == 1 || head.data == key) {
      head = head.next;
      return;
    }
    while (temp != null && temp.next.data != key) temp = temp.next;
    Node toRemove = temp.next;
    temp.next = temp.next.next;
    toRemove.next = null;
  }

  @Override
  public void addAtGivenNode(T after, T key) {
    Node toInsert = new Node(key);
    Node temp = head, x = null;
    while (temp.data != after) temp = temp.next;
    x = temp.next;
    temp.next = toInsert;
    toInsert.next = x;
  }

  public void removeFromLast() {
    Node temp = head;
    while (temp.next.next != null) temp = temp.next;
    temp.next = null;
  }

  @Override
  public int size() {
    int count = 0;
    Node iterator = head;
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
