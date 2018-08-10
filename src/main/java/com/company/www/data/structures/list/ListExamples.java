package com.company.www.data.structures.list;

import com.company.www.utils.LinkNode;

import java.util.HashSet;

public class ListExamples {

  /** Count the number of nodes in LinkedList */
  int countNodes(LinkNode head) {
    if (head == null) return 0;
    int n = countNodes(head.next);
    return 1 + n;
  }

  /** sum of all nodes in a LinkedList */
  int sumOfNodes(LinkNode head) {
    if (head == null) return 0;
    int sum = sumOfNodes(head.next);
    return (int) head.data + sum;
  }

  /** Print a list in the reverse order */
  void printReverse(LinkNode head) {
    if (head == null) return;
    printReverse(head.next);
    System.out.println(head.data);
  }

  /**
   * performs a linear search and returns either null or a reference to the node containing value.
   */
  LinkNode searchNode(LinkNode head, int key, int position) {
    if (head == null || (int) head.data == key) return head;
    else return searchNode(head.next, key, position + 1);
  }

  boolean hasNode(LinkNode head, int key) {
    if (head == null) return false;
    else if ((int) head.data == key) return true;
    else return hasNode(head.next, key);
  }

  /**
   * return a reference to the linked list l, in which a new node containing value is inserted at
   * its rear.*
   */
  LinkNode insertAtRear(LinkNode head, int value) {
    if (head == null) return new LinkNode(value);
    else head.next = insertAtRear(head.next, value);
    return head;
  }
  /** insert a value into an ordered list * */
  LinkNode insertNode(LinkNode head, int key) {
    if (head == null || (int) head.data > key) return new LinkNode(key);
    else head.next = new LinkNode(key);
    return head;
  }

  /** removes just the first occurrence of a given value * */
  LinkNode removeFirstOccurence(LinkNode head, int key) {
    if (head == null) return null;
    else {
      if ((int) head.next.data == key) head.next = head.next.next;
      return removeFirstOccurence(head.next, key);
    }
  }

  /** Check if two linked lists are identical* */
  boolean areIdentical(LinkNode head1, LinkNode head2) {
    if (head1 == null && head2 == null) return true;
    if (head1 == null && head2 != null || head2 == null && head1 != null) return false;
    return ((int) head1.data == (int) head2.data) && areIdentical(head1.next, head2.next);
  }

  /** Merging two sorted lists * */
  LinkNode mergeSortedList(LinkNode head1, LinkNode head2) {
    if (head1 == null) return head2;
    else if (head2 == null) return head1;
    else if ((int) head1.data > (int) head2.data) {
      head2.next = mergeSortedList(head1, head2.next);
      return head2;
    } else {
      head1.next = mergeSortedList(head1.next, head2);
      return head2;
    }
  }

  /** sum of even nodes in a LinkedList**/

  int sumOfEven(LinkNode head){
    if(head == null) return 0;
    else if((int)head.data % 2 == 0) return (int)head.data + sumOfEven(head.next);
    return sumOfEven(head.next);
  }
  /**
   * 17. Problem: Remove duplicates from a sorted linked list. Solution: Traverse the list from the
   * head (or start) node. While traversing, compare each node with its next node. If data of next
   * node is same as current node then delete the next node. Before we delete a node, we need to
   * store next pointer of the node.
   */
  LinkNode removeDuplicates(LinkNode head) {
    if (head == null || head.next == null) return head;
    else {
      LinkNode current = head;
      while (current != null && current.next != null) {
        if (current.data == current.next.data) {
          current.next = current.next.next;
        }
        current = current.next;
      }
      return head;
    }
  }

  /** 18. Problem: Remove duplicates from an unsorted linked list. Solution: Use HashSet. * */
  LinkNode removeDupsUnsorted(LinkNode head) {
    HashSet<Integer> set = new HashSet<>();
    LinkNode prev = null, current = head;
    while (current != null) {
      if (set.contains(current.data)) prev.next = current.next;
      else {
        set.add((int) current.data);
        prev = current;
      }
      current = prev.next;
    }
    return head;
  }

  /** Problem: Print alternate nodes of a linked list using recursion. */
  void printAlternateRec(LinkNode head, boolean isOdd) {
    if (head == null) return;
    if (isOdd == true) System.out.println(head.data);
    printAlternateRec(head.next, !isOdd);
  }

  void printAlternate(LinkNode head) {
    LinkNode temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next.next;
    }
  }

  /**
   * Given a linked list, and a number, check if their exist two numbers whose sum is equal to given
   * number. If there exist two numbers, print them. If there are multiple answer, print any of
   * them.*
   */
  void pairSum(LinkNode head, int sum) {
    HashSet<Integer> set = new HashSet<>();
    while (head != null) {
      int diff = sum - (int) head.data;
      if (set.contains(diff)) System.out.println(head.data + " and " + diff);
      else set.add((int) head.data);
      head = head.next;
    }
  }

  /**
   * 24. Problem: Intersection of two Sorted Linked Lists. Given two lists sorted in increasing
   * order, create and return a new list representing the intersection of the two lists. The new
   * list should be made with its own memory — the original lists should not be changed For example,
   * let the first linked list be 1->2->3->4->6 and second linked list be 2->4->6->8, then your
   * function should create and return a third list as 2->4->6. Solution:
   */
  void intersection(LinkNode head1, LinkNode head2) {
    HashSet<Integer> set = new HashSet<>();
    while (head1 != null) {
      set.add((int) head1.data);
      head1 = head1.next;
    }

    while (head2 != null) {
      if (set.contains(head2.data)) System.out.println(head2.data);
      head2 = head2.next;
    }
  }

  /**
   * Problem: Given a sorted linked list and a value to insert, write a function to insert the value
   * in sorted way.
   */
  LinkNode sortedList(LinkNode head, LinkNode node) {
    if (head == null || (int) head.data >= (int) node.data) {
      head.next = node;
      return node;
    } else {
      LinkNode temp = head;
      while (temp.next != null || (int) temp.next.data < (int) node.data) temp = temp.next;
      node.next = temp.next;
      temp.next = node;
      return head;
    }
  }
}
