package com.company.www.crossover;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class RecipeRemainder {
    /**
     * Complete the function below.And make sure to include required imports
     * DONOT MODIFY anything outside this function!
     */
    static int[]  calculateRemainders(int[] proportions,int[] availableGrams) {
        int[] remaining_grams = new int[proportions.length];

        if (proportions.length == 0)
            return remaining_grams;

        int value = availableGrams[0] / proportions[0];
        for (int i = 1; i < availableGrams.length; i++) {
            int v = availableGrams[i] / proportions[i];
            if (v < value) {
                value = v;
            }
        }

        for (int i = 0; i < availableGrams.length; i++) {
            remaining_grams[i] = availableGrams[i] - (proportions[i] * value);
        }

        return remaining_grams;

    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] proportions = Arrays.stream(in.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        int[] availableGrams = Arrays.stream(in.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();

        int[] remainder = calculateRemainders(proportions,availableGrams) ;

        System.out.println(Arrays.stream(remainder)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));
    }
}

