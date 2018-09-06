package com.company.www.multithreading.three.thread.sequence;

public class ThreeSequence {

  /** Print Thread 1 -> A Thread 2 -> B Thread 3 -> C Thread 1 -> D * */
  static final Object lock = new Object();

  static int flag = 1;
  static char ch = 'A';

  static Runnable thread1 =
      () -> {
        synchronized (lock) {
          while (ch < 'K') {
            try {
              while (flag != 1) {
                lock.wait();
              }
              System.out.println(Thread.currentThread().getName() + ch);
              ch = (char) (ch + 1);
              flag = 2;
              lock.notifyAll();
              lock.wait();
              ;
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      };

  static Runnable thread2 =
      () -> {
        synchronized (lock) {
          while (ch < 'K') {
            try {
              while (flag != 2) {
                lock.wait();
              }
              System.out.println(Thread.currentThread().getName() + ch);
              ch = (char) (ch + 1);
              flag = 3;
              lock.notifyAll();
              lock.wait();
              ;
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      };
  static Runnable thread3 =
      () -> {
        synchronized (lock) {
          while (ch < 'K') {
            try {
              while (flag != 3) {
                lock.wait();
              }
              System.out.println(Thread.currentThread().getName() + ch);
              ch = (char) (ch + 1);
              flag = 1;
              lock.notifyAll();
              lock.wait();
              ;
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
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
