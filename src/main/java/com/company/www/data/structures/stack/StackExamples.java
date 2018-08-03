package com.company.www.data.structures.stack;

import com.company.www.utils.LinkNode;

import java.util.LinkedList;
import java.util.List;

public class StackExamples {

  /** Four Methods Pop, Peek, Push, isEmpty() * */

  /** Implement a stack using Array * */
  int MAX = 5;

  private int[] array = new int[MAX];
  private int top;

  StackExamples() {
    top = -1;
  }

  void push(int item) {
    if (top == array.length - 1) System.out.println("Stack is full ");
    else {
      array[top + 1] = item;
      top++;
    }
  }

  void peek() {
    if (top < 0) System.out.println(" Stack underflow");
    else System.out.println(array[top]);
  }

  void pop() {
    if (top < 0) System.out.println(" Stack underflow");
    else System.out.println("Popped item" + array[top]);
    top--;
  }

  void printStack() {
    for (int i = 0; i <= top; i++) System.out.print(array[i] + " ");
  }

  /** Implement a Stack using list* */
  private LinkNode head = null;

  List<Integer> list = new LinkedList<>();
  int capacity = 50;

  void pushList(int item) {
    if (top > capacity) System.out.println("Stack is full");
    else {
      insertAtFirst(item);
      top++;
    }
  }

  private void insertAtFirst(int item) {
    LinkNode newNode = new LinkNode(item);
    newNode.next = head;
    head = newNode;
  }

  void popList() {
    if (head != null) {
      deleteFromFirst();
      top = top - 1;
    }
  }

  private LinkNode deleteFromFirst() {
    LinkNode temp = head;
    head = head.next;
    return temp;
  }

  void printList() {
    LinkNode temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
