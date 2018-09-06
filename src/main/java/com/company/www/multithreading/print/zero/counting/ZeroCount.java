package com.company.www.multithreading.print.zero.counting;

public class ZeroCount {

  /**
   * print series 010203040506.st thread will print only 0 2nd thread will print only even numbers
   * and 3rd thread print only odd numbers*
   */
  static final Object lock = new Object();

  static Runnable printZero =
      () -> {
        synchronized (lock) {
            for (int i = 0; i < 7; i++) {
                System.out.print(0 + " ");
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.notify();
                }
            }
        }
      };

  static Runnable printCount =
      () -> {
        synchronized (lock) {
            for (int i = 1; i < 7; i++) {
                System.out.print(i + " ");
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.notify();
                }
            }
        }
      };



  public static void main(String[] args) {
    Thread zero = new Thread(printZero);
    Thread count = new Thread(printCount);

    zero.start();;
    count.start();
  }
}
