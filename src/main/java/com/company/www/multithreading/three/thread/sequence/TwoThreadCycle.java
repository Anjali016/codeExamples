package com.company.www.multithreading.three.thread.sequence;

public class TwoThreadCycle {

  private static final Object lock = new Object();

  static Runnable printA =
      () -> {
        synchronized (lock) {
          for (int i = 0; i < 3; i++){
              System.out.println(" Thread 1 - A");
          lock.notify();
          try {
            lock.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        }
      };

  static Runnable printB =
      () -> {
        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                System.out.println(" Thread 2 - B");
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
    Thread thread1 = new Thread(printA);
    Thread thread2 = new Thread(printB);

    thread1.start();
    thread2.start();
  }
}
