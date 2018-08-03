package com.company.www.multithreading.even.odd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEven implements Runnable {

    private final int countUntil;

    OddEven(int countUntil){
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        for (int i = 0; i <= countUntil; i++) {
            System.out.println(i);
            try {
                waitMethod();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        void waitMethod() throws InterruptedException {
        Thread.sleep(5000);
    }

  public static void main(String[] args) {

      ExecutorService executor = Executors.newFixedThreadPool(2);
      Runnable thread1 = new OddEven(10);
        executor.execute(thread1);  }
}

