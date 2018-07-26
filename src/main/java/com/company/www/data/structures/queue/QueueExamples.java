package com.company.www.data.structures.queue;

import java.util.Stack;

public class QueueExamples {

  /** Problem: Implement Queue using Stacks* */
  class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
      stack1 = new Stack<>();
      stack2 = new Stack<>();
    }

    void enqueue(int item) {
      stack1.push(item);
    }

    int dequeue(int item) {
      reverseStack(stack2, stack1);
      int front = stack2.pop();
      reverseStack(stack1, stack2);
      return front;
    }

    private void reverseStack(Stack<Integer> stack2, Stack<Integer> stack1) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }
  }

  /*
  Stack<Integer> enqueue(Stack<Integer> queue, int item){
      if(!queue.isEmpty()){
          int temp = queue.pop();
          enqueue(queue,item);
           queue.add(temp);
           return queue;
      }
      else queue.add(item);
      return queue;
  }*/
}
