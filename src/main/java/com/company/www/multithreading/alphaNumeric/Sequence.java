package com.company.www.multithreading.alphaNumeric;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sequence {
  private static final Object lock = new Object();

  static Runnable alphabet =
      () -> {
        synchronized (lock) {
          for (char i = 'a'; i <= 'd'; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            lock.notify();
            try {
              lock.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            finally{
                lock.notify();
            }
          }
        }
      };

  static Runnable number =
      () -> {
        synchronized (lock) {
          for (int i = 1; i < 5; i++) {
              System.out.println(Thread.currentThread().getName() + " " + i);
              lock.notify();
              try {
                  lock.wait();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              lock.notify();
          }
        }
      };
  private static int nThreads;

  public static void main(String[] args) {

    /*Thread thread1 = new Thread(number);
    Thread thread2 = new Thread(alphabet);

    thread1.start();
    thread2.start();*/
    ExecutorService executor = Executors.newFixedThreadPool(2);
    executor.submit(alphabet);
    executor.submit(number);
    executor.shutdown();
  }
}
