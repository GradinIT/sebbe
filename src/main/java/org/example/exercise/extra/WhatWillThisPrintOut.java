package org.example.exercise.extra;

public class WhatWillThisPrintOut {
    private static final int MAX_ITERATIONS = 100;
    public static void main(String[] args) {
        for(int i = 10 ; i <= MAX_ITERATIONS ; i += 5) {
            if(isEven(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
}
