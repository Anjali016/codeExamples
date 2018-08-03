package com.company.www.data.structures.queue;

import org.junit.Test;

class QueueExamplesTest {

  QueueExamples queObject = new QueueExamples();

  @Test
  public void enqueue() throws Exception {
    QueueExamples.MyQueue q = new QueueExamples().new MyQueue();
    q.enqueue(1);
    q.enqueue(2);

    System.out.println(q.dequeue(2));
  }
}
