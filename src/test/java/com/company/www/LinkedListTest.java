package com.company.www;

import com.company.www.ifaces.List;
import com.company.www.utils.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

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
