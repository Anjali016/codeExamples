package com.company.www.utils;

import com.company.www.utils.ifaces.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

  List<String> list = new LinkedList();

  @Test
  public void addAtFront() throws Exception {
    list.addAtFront("hello");
    assertFalse(list.isEmpty());
  }

  @Test
  public void addAtEnd() throws Exception {}

  @Test
  public void printList() throws Exception {}

  @Test
  public void removeFromFront() throws Exception {}

  @Test
  public void remove() throws Exception {}

  @Test
  public void addAtGivenNode() throws Exception {}

  @Test
  public void removeFromLast() throws Exception {}

  @Test
  public void size() throws Exception {}

  @Test
  public void isEmpty() throws Exception {}
}