package com.company.www.data.structures.list;

import com.company.www.utils.LinkNode;
import org.junit.Test;

public class ListExamplesTest {
  @Test
  public void pairWiseSwap() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(4);
    head.next.next.next.next = new LinkNode(5);
    head.next.next.next.next.next = new LinkNode(6);
    list.pairWiseSwap(head);
    printList(head);

  }
  /*private void printList(LinkNode head) {
    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }*/

  private void printList(LinkNode head){
    if(head == null) return ;
    System.out.println((int)head.data);
    printList(head.next);
  }

  @Test
  public void middleOfList() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(5);
    head.next.next.next.next = new LinkNode(6);
/*    head.next.next.next.next.next = new LinkNode(10);*/
    System.out.println(list.middleOfList(head).data);
  }

  @Test
  public void hasLoop() throws Exception {
      LinkNode head = new LinkNode(1);
      head.next = new LinkNode(2);
      head.next.next = new LinkNode(3);
      head.next.next.next = new LinkNode(5);
      head.next.next.next.next = new LinkNode(6);
      head.next.next.next.next.next = head.next.next;
      System.out.println(list.hasLoop(head));

  }



  @Test
  public void intersection() throws Exception {
    LinkNode head1 = new LinkNode(1);
    head1.next = new LinkNode(2);
    head1.next.next = new LinkNode(3);
    head1.next.next.next = new LinkNode(6);
    head1.next.next.next.next = new LinkNode(7);

    LinkNode head2 = new LinkNode(4);
    head2.next = new LinkNode(5);
    head2.next.next = new LinkNode(6);
    head2.next.next.next = new LinkNode(7);

    System.out.println(list.intersection(head1,head2).data);
  }

  @Test
  public void nthFromLast() throws Exception {
    LinkNode head1 = new LinkNode(1);
    head1.next = new LinkNode(2);
    head1.next.next = new LinkNode(3);
    head1.next.next.next = new LinkNode(6);
    head1.next.next.next.next = new LinkNode(7);
    head1.next.next.next.next.next = new LinkNode(0);

    System.out.println(list.nthFromLast(head1, 2).data);
  }

  @Test
  public void getNthNode() throws Exception {
    LinkNode head1 = new LinkNode(1);
    head1.next = new LinkNode(2);
    head1.next.next = new LinkNode(3);
    head1.next.next.next = new LinkNode(6);
    head1.next.next.next.next = new LinkNode(7);
    System.out.println(list.getNthNode(head1, 2).data);
  }

  @Test
  public void intertsection() throws Exception {
    LinkNode head1 = new LinkNode(1);
    head1.next = new LinkNode(2);
    head1.next.next = new LinkNode(3);
    head1.next.next.next = new LinkNode(6);
    head1.next.next.next.next = new LinkNode(7);

    LinkNode head2 = new LinkNode(4);
    head2.next = new LinkNode(5);
    head2.next.next = new LinkNode(12);
    head2.next.next.next = new LinkNode(6);
    head2.next.next.next.next = new LinkNode(7);

    System.out.println(list.intertsection(head1, head2));
  }

  ListExamples list = new ListExamples();

  @Test
  public void countOccurence() throws Exception {
    LinkNode head1 = new LinkNode(1);
    head1.next = new LinkNode(2);
    head1.next.next = new LinkNode(10);
    head1.next.next.next = new LinkNode(4);
    head1.next.next.next.next = new LinkNode(4);
    System.out.println(list.countOccurence(head1, 4));
  }

  @Test
  public void sumOfEven() throws Exception {
    LinkNode head1 = new LinkNode(1);
    head1.next = new LinkNode(2);
    head1.next.next = new LinkNode(10);
    head1.next.next.next = new LinkNode(4);
    System.out.println(list.sumOfEven(head1));
  }

  @Test
  public void areIdentical() throws Exception {
    LinkNode head1 = new LinkNode(1);
    head1.next = new LinkNode(2);
    head1.next.next = new LinkNode(3);

    LinkNode head2 = new LinkNode(1);
    head2.next = new LinkNode(2);
    System.out.println(list.areIdentical(head1, head2));
  }

  @Test
  public void hasNode() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    System.out.println(list.hasNode(head, 4));
  }

  @Test
  public void insertAtRear() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
  }

  @Test
  public void searchNode() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    System.out.println(list.searchNode(head, 3, 1).data);
  }

  @Test
  public void printReverse() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    list.printReverse(head);
  }

  @Test
  public void sumOfNodes() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(5);
    System.out.println(list.sumOfNodes(head));
  }

  @Test
  public void countNodes() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(5);
    System.out.println(list.countNodes(head));
  }


  }

