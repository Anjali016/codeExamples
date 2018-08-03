package com.company.www.multithreading.word.count;

import java.io.File;
import java.util.Scanner;

public class WordsInLine implements Runnable{

    private String fileName;
    public WordsInLine(String file){
        this.fileName = file;
    }

    @Override
    public void run() {


    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        File file = new File(input.nextLine());


    }
}
