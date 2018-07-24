package com.company.www.data.structures.list;

import com.company.www.utils.LinkNode;

public class ListExamples {

  public LinkNode searchNode(LinkNode head, int key) {
    while (head != null || (int) head.data == key) head = head.next;
    return head;
  }

  /** Merge two Sorted Linked List* */
  void mergeSortedList(LinkNode head1, LinkNode head2, LinkNode head) {

    if ((int) head1.data < (int) head2.data) {
      head = head1;
      head1 = head1.next;
    }
  }
}
