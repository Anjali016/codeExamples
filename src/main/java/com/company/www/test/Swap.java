package com.company.www.test;

public class Swap {

  public static void main(String[] args) {

    int i = 1;
    if (i++ == --i) {
      System.out.println(0);
    }
    else System.out.println(1);
    /*Swap swap = new Swap();
    int x = 5;
    System.out.println("Values of x before " + x);
    modifyWrappers(x);
    System.out.println("Values of x after: " + x);

    //    System.out.println("Values of obj1 & obj2 after wrapper modification: ");
    //  System.out.println("obj1 = " + obj1.intValue() + " ; obj2 = " + obj2.intValue());*/

  }

  private static void modifyWrappers(Integer a) {
    a = 0;
  }
}


