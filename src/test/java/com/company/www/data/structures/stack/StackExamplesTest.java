package com.company.www.data.structures.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackExamplesTest {
  @Test
  public void pushList() throws Exception {
    obj.pushList(100);
    obj.pushList(200);
    obj.pushList(300);
    obj.popList();
    obj.printList();
  }

  StackExamples obj = new StackExamples();
  @Test
  public void push() throws Exception {
    obj.push(1);
    obj.push(2);
    obj.push(3);
    obj.pop();
    obj.printStack();
  }
}