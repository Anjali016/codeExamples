package com.company.www.multithreading.three.thread.sequence;

public class ThreeSequence {

  /** Print Thread 1 -> A Thread 2 -> B Thread 3 -> C Thread 1 -> D * */

  static final Object lock = new Object();

  static Runnable albhabets =
      () -> {
        synchronized (lock) {
            for (char i = 'A'; i < 'D'; i++) {
                System.out.println(Thread.currentThread().getName() + i);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
      };


    public static void main(String[] args) {
    Thread t1 = new Thread(albhabets);
    Thread t2 = new Thread(albhabets);
    Thread t3 = new Thread(albhabets);

    t1.start();
    t2.start();
    t3.start();

  }
}
