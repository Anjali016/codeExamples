package com.company.www.data.structures.list;

import com.company.www.utils.LinkNode;

import java.util.HashSet;

public class ListExamples {

  public LinkNode searchNode(LinkNode head, int key) {
    while (head != null || (int) head.data == key) head = head.next;
    return head;
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

  /** 80. Problem: Insertion Sort for Singly Linked List. Solution: */
  LinkNode insertion(LinkNode head) {
    LinkNode current = head, result = null;
    while (current != null) {
      LinkNode nextNode = current.next;
      result = sortedList(result, current);
      current = nextNode;
    }
    return result;
  }

  /** 10. Problem: Detect a loop in a linked list. */
  boolean hasLoop(LinkNode head) {
    if (head == null) return false;
    else return hasLoop(head, head.next);
  }

  boolean hasLoop(LinkNode slow, LinkNode fast) {
    if (fast == null || fast.next == null) return false;
    if (slow == fast) return true;
    else return hasLoop(slow.next, fast.next.next);
  }

  /**
   * Problem: Pairwise swap elements of a given linked list by changing links. if the linked list is
   * 1->2->3->4->5 then the function should change it to 2->1->4->3->5
   */
  void pairWiseSwap(LinkNode head) {
    if (head != null && head.next != null) {
      swapTwoNode(head, head.next);
      pairWiseSwap(head.next.next);
    }
  }

  private void swapTwoNode(LinkNode node1, LinkNode node2) {
    int temp = (int) node1.data;
    node1.data = node2.data;
    node2.data = temp;
  }

  /** 49. Problem: Flattening a Linked List. */
  /** 32. Problem: Reverse a Linked List in groups of given size | Set 1. Solution: */
  /** 31. Problem: Merge Sort for Linked Lists. */
  /** 158. Problem: Merge two sorted lists (in-place). Solution: Same as question 29. */
  /** 11. Problem: Function to check if a singly linked list is palindrome. */

  /**
   * 125. Problem: Remove every k-th node of the linked list. Given a singly linked list, Your task
   * is to remove every K-th node of the linked list. Input : 1->2->3->4->5->6->7->8 k = 3 Output :
   * 1->2->4->5->7->8 Solution: ** 123. Problem: Remove all occurrences of duplicates from a sorted
   * Linked List Given a sorted linked list, delete all nodes that have duplicate numbers (all
   * occurrences), leaving only numbers that appear once in the original list. Input :
   * 23->28->28->35->49->49->53->53 Output : 23->35 Input : 11->11->11->11->75->75 Output : empty
   * List Solution:
   */
  /**
   * 46. Problem: Rotate a Linked List Given a singly linked list, rotate the linked list
   * counter-clockwise by k nodes. Where k is a given positive integer. For example, if the given
   * linked list is 10->20->30->40->50->60 and k is 4, the list should be modified to
   * 50->60->10->20->30->40. Assume that k is smaller than the count of nodes in linked lis
   * Solution:To rotate the linked list, we need to change next of kth node to NULL, next of last
   * node to previous head node, and finally change head to (k+1)th node. So we need to get hold of
   * three nodes: kth node, (k+1)th node and last node.
   */
  /**
   * 86. Problem: Delete last occurrence of an item from linked list Given a liked list and a key to
   * be deleted. Delete last occurrence of key from linked. The list may have duplicates. Examples:
   * Input: 1->2->3->5->2->10, key = 2 Output: 1->2->3->5->10 Solution:
   */
  /**
   * 87. Problem: Rearrange a linked list such that all even and odd positioned nodes are together.
   * Input: 1->2->3->4 Output: 1->3->2->4 Solution:
   */
  void mergeSortedList(LinkNode head1, LinkNode head2, LinkNode head) {

    if ((int) head1.data < (int) head2.data) {
      head = head1;
      head1 = head1.next;
    }
  }
}
