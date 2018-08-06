package com.company.www.multithreading.three.thread.sequence;

public class ThreeSequence {

  /** Print Thread 1 -> A Thread 2 -> B Thread 3 -> C Thread 1 -> D * */
  static final Object lock = new Object();

  static int flag = 1;

  static Runnable thread1 =
      () -> {
        synchronized (lock) {
          try {
            while (flag != 1) {
              lock.wait();
            }
            for (char i = 'A'; i <= 'K'; i = (char) (i + 3)) {
              System.out.println(Thread.currentThread().getName() + i);
              flag = 2;
              lock.notify();
            }
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      };

  static Runnable thread2 =
      () -> {
        synchronized (lock) {
          try {
            while (flag != 2) {
              lock.wait();
            }
            for (char i = 'B'; i <= 'K'; i = (char) (i + 3)) {
              System.out.println(Thread.currentThread().getName() + i);
              flag = 3;
              lock.notify();
            }

          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      };
  static Runnable thread3 =
      () -> {
        synchronized (lock) {
          try {
            while (flag != 3) {
              lock.wait();
            }
            for (char i = 'C'; i <= 'K'; i = (char) (i + 3)) {
              System.out.println(Thread.currentThread().getName() + i);
              flag = 1;
              lock.notify();
            }
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      };

  public static void main(String[] args) {
    Thread t1 = new Thread(thread1);
    Thread t2 = new Thread(thread2);
    Thread t3 = new Thread(thread3);

    t1.start();
    t2.start();
    t3.start();
  }
}
