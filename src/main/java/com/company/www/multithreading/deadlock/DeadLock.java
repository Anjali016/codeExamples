package com.company.www.multithreading.deadlock;

public class DeadLock {

  private static final Object lock1 = new Object();
  private static final Object lock2 = new Object();

  private static Runnable class1 =
      () -> {
        synchronized (lock1) {
          System.out.println(" Thread 1 is holding lock 1");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(" Thread 1 waiting for lock 2");

          synchronized (lock2) {
            System.out.println(" Thread 1 is holding lock 1 and 2");
          }
        }
      };

  static Runnable class2 =
      () -> {
        synchronized (lock2) {
          System.out.println(" Thread 2 is holding lock 2");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(" Thread 2 waiting for lock 1");

          synchronized (lock1) {
            System.out.println(" Thread 2 is holding lock 1 and 2 ");
          }
        }
      };

  public static void main(String args[]) {
    Thread t1 = new Thread(class1);
    Thread t2 = new Thread(class2);
    t1.start();
    t2.start();
  }
}
