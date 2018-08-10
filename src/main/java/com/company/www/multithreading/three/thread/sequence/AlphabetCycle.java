package com.company.www.multithreading.three.thread.sequence;

class AlphabetCycle {

    /**  print
     * Thread 1 - A
     * Thread 2 - B
     * Thread 3 - C
     * Thread 1 - A **/

    private static final Object lock = new Object();
   private static int flag = 1;
  static Runnable printA =
      () -> {
          synchronized (lock) {
          while( flag != 1){
              try {
                  lock.wait();
              }
              catch (InterruptedException e) {
                  e.printStackTrace();
              }
              System.out.println("Thread 1 - A");
              flag = 2 ;
              lock.notifyAll();
          }
      }

      };

    static Runnable printB = () -> {
        synchronized (lock){
            while(flag != 2){
                try {
                    lock.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 - B");
                flag = 3 ;
                lock.notifyAll();
            }
        }

    };

    static Runnable printC = () -> {
        synchronized (lock){
            while(flag != 3){
                try {
                    lock.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread C - B");
                flag = 1 ;
                lock.notifyAll();
            }
        }
    };

  public static void main(String[] args) {
    Thread t1 = new Thread(printA);
    Thread t2 = new Thread(printB);
    Thread t3 = new Thread(printC);

    t1.start();
    t2.start();
    t3.start();
  }
}
