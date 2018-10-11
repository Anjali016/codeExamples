package com.company.www.data.structures.list;

import com.company.www.utils.LinkNode;

public class ListExamples {

  /** Sort a linked list of 0s, 1s and 2s by changing links **/

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
      return head1;
    }
  }

  /** sum of even nodes in a LinkedList* */
  int sumOfEven(LinkNode head) {
    if (head == null) return 0;
    else if ((int) head.data % 2 == 0) return (int) head.data + sumOfEven(head.next);
    return sumOfEven(head.next);
  }

  /** counts the number of times a given integer occurs in a Linked List * */
  int countOccurence(LinkNode head, int key) {
    if (head == null) return 0;
    else if ((int) head.data == key) return 1 + countOccurence(head.next, key);
    else return countOccurence(head.next, key);
  }

  /** get Nth node in a linkedlist* */
  LinkNode getNthNode(LinkNode head, int n) {
    if (head == null || n == 1) return head;
    else return getNthNode(head.next, n - 1);
  }

  /** get Nth node from last. * */
  LinkNode nthFromLast(LinkNode head, int n) {
    LinkNode pointer = getNthNode(head, n);
    return nthFromLast(head, pointer);
  }

  private LinkNode nthFromLast(LinkNode head, LinkNode pointer) {
    if (head == null) return null;
    if (pointer.next == null) return head;
    else return nthFromLast(head.next, pointer.next);
  }

  /** get the intersection point of two Linked Lists(when linkelist are of same length)* */
  LinkNode intertsection(LinkNode head1, LinkNode head2) {
    if (head1 == null || head2 == null) return null;
    if ((int) head1.data == (int) head2.data) return head1;
    else return intertsection(head1.next, head2.next);
  }

  /** get the intersection point of two Linked Lists(when linkelist are of different length)* */
  LinkNode intersection(LinkNode head1, LinkNode head2) {
    int first = countNodes(head1);
    int second = countNodes(head2);
    LinkNode displacedHead;
    if (first > second) {
      displacedHead = getNthNode(head1, first - second);
      return intertsection(displacedHead, head2);

    } else {
      displacedHead = getNthNode(head2, second - first);
      return intertsection(head1, displacedHead);
    }
  }

  /** Detect loop in a linked list * */
  boolean hasLoop(LinkNode head) {
    if (head == null) return false;
    else return detectLoop(head, head.next);
  }

  private boolean detectLoop(LinkNode slow, LinkNode fast) {
    if (slow == null || fast == null) return false;
    if (slow == fast) return true;
    else return detectLoop(slow.next, fast.next.next);
  }

  /** Find the length of a loop * */

  /** Remove Loop from Linked List * */

  /** Find the middle of a given linked list * */
  LinkNode middleOfList(LinkNode head) {
    if (head == null) return null;
    return middleOfList(head, head.next);
  }

  private LinkNode middleOfList(LinkNode slow, LinkNode fast) {
    if (slow == null || fast == null) return null;
    if (fast.next == null) return slow;
    if (fast.next.next == null) return slow.next;
    else return middleOfList(slow.next, fast.next.next);
  }

  /** Function to check if a singly linked list is palindrome * */

  /**
   * swap elements pairwise. For example, if the linked list is 1->2->3->4->5 then the function
   * should change it to 2->1->4->3->5 .
   */
  void pairWiseSwap(LinkNode head) {
    if (head == null || head.next == null) return;
    else {
      pairWiseSwap(head.next.next);
      swapTwoNodes(head, head.next);
    }
  }
  private void swapTwoNodes(LinkNode node1, LinkNode node2) {
    int temp = (int) node1.data;
    node1.data = node2.data;
    node2.data = temp;
  }

  /** Rotate a linkedlist by a given value K For example,
   * if the given linked list is 10->20->30->40->50->60 and k is 4,
   * the list should be modified to 50->60->10->20->30->40**/
  LinkNode rotateByK(LinkNode head, int k){
    if(head == null) return null;
    else {
      LinkNode kthNode = getNthNode(head, k);
      LinkNode temp = kthNode.next;
      kthNode.next = null;
      head = temp;
    }
    return head;
  }
}
