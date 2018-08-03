package com.company.www.multithreading.word.count;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountPrint {

  private final int countUntil;

  CountPrint(int countUntil) {
    this.countUntil = countUntil;
  }

  static Runnable countWords =
      () -> {
        File file = new File("/Users/anjalisingh/chandrayaan.txt");
        try (Scanner sc = new Scanner(file)) {
          int count = 0;
          while (sc.hasNext()) {
            count++;
          }
          System.out.println(count);
          sc.close();
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }
      };

  public static void main(String[] args) {

    Thread t1 = new Thread(countWords);
    t1.start();
  }
}
