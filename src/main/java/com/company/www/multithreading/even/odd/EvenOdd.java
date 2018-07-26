package com.company.www.multithreading.even.odd;

public class EvenOdd {

  private static final Object lock = new Object();
  static Runnable odd =
      () -> {
        synchronized (lock) {
          for (int i = 1; i < 10; i = i + 2) {
            System.out.println(Thread.currentThread().getName() + " " + i);
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

  static Runnable even =
      () -> {
        synchronized (lock) {
          for (int i = 2; i <= 10; i = i + 2) {

            System.out.println(Thread.currentThread().getName() + " " + i);
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

    Thread oddThread = new Thread(odd, "odd");
    Thread evenThread = new Thread(even, "even");

    oddThread.start();
    evenThread.start();
  }
}
