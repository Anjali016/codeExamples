package com.company.www.data.structures.list;

import com.company.www.utils.LinkNode;
import org.junit.Test;

public class ListExamplesTest {
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
    System.out.println(list.areIdentical(head1,head2));
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
    System.out.println(list.searchNode(head,3,1).data);
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


    @Test
  public void intersection() throws Exception {
    LinkNode head1 = new LinkNode(10);
    head1.next = new LinkNode(12);
    head1.next.next = new LinkNode(31);
    head1.next.next.next = new LinkNode(42);
    head1.next.next.next.next = new LinkNode(53);

    LinkNode head2 = new LinkNode(10);
    head2.next = new LinkNode(312);
    head2.next.next = new LinkNode(231);
    head2.next.next.next = new LinkNode(142);
    head2.next.next.next.next = new LinkNode(53);
    list.intersection(head1,head2);
  }

  @Test
  public void pairSum() throws Exception {
    LinkNode head = new LinkNode(10);
    head.next = new LinkNode(12);
    head.next.next = new LinkNode(31);
    head.next.next.next = new LinkNode(42);
    head.next.next.next.next = new LinkNode(53);
    list.pairSum(head,22);
  }

  @Test
  public void removeDupsUnsorted() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(4);
    head.next.next.next.next = new LinkNode(4);
    head.next.next.next.next.next= new LinkNode(6);
    head.next.next.next.next.next.next= null;
    list.removeDupsUnsorted(head);
    printList(head);
  }

  @Test
  public void removeDuplicates() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(4);
    head.next.next.next.next = new LinkNode(4);
    head.next.next.next.next.next= new LinkNode(6);
    head.next.next.next.next.next.next= null;
    list.removeDuplicates(head);
    printList(head);
  }

  private void printList(LinkNode head){
    while(head != null){
      System.out.println(head.data);
      head = head.next;
    }
  }

  @Test
  public void printAlternateRec() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(4);
    head.next.next.next.next = new LinkNode(5);
    head.next.next.next.next.next= new LinkNode(6);
    head.next.next.next.next.next.next= null;
    list.printAlternateRec(head,true);
  }

  ListExamples list = new ListExamples();
  @Test
  public void printAlternate() throws Exception {
    LinkNode head = new LinkNode(1);
    head.next = new LinkNode(2);
    head.next.next = new LinkNode(3);
    head.next.next.next = new LinkNode(4);
    head.next.next.next.next = new LinkNode(5);
    head.next.next.next.next.next= new LinkNode(6);
    head.next.next.next.next.next.next= null;
    list.printAlternate(head);

  }

    @Test
  public void getNthNode() throws Exception {
    System.out.println();
  }
}
