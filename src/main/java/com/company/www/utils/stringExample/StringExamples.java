package com.company.www.utils.stringExample;

public class StringExamples {
    /**
     * Given a string determine if it is a palindrom considering only alphanumerica characters and
     * ignoring cases. 'A man, a plan, a canal: Panama' is palindrome. 'race a car' is not a
     * palindrome. Return 0/1
     */


    public boolean isPalindrom(String str) {
        String p = str.replaceAll("[^A-Za-z0-9]", "");
        String s = p.toLowerCase();
        if (s.length() <= 1) return true;
        else
            return (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrom(s.substring(1, s.length() - 1)));
    }


    /**
     * Find all the factors of a number
     */
    void printDivisors(int N) {
        for (int i = 1; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (N % i == i) System.out.println(i);
                else System.out.print(" " + i + " " + N / i);
            }
        }
    }

    /**
     * Given a positive number N, print all numbers from 1 to N , except for multiple of 3 it should
     * print Fizz and for multiple of 5 it should print Buzz and for multiple of 3 and 5 it should
     * print FizzBuzz
     */
    public void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            boolean divbythree = (i % 3 == 0);
            boolean divbyfive = (i % 5 == 0);
            if (divbythree && divbyfive) {
                System.out.print("FizzBuzz");
            } else if (divbythree) {
                System.out.print("Fizz");
            } else if (divbyfive) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        StringExamples s = new StringExamples();
        System.out.println(s.isPalindrom("rac a car"));
    }

}