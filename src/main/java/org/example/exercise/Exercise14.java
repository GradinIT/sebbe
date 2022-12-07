package org.example.exercise;

import org.example.Exercise;

import java.util.Scanner;

public class Exercise14 implements Exercise {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an integer:");
        int x = scanner.nextInt();
        System.out.println("Give me another integer:");
        int y = scanner.nextInt();
        System.out.printf("the sum of %d and %d is %d",x,y , add(x, y));
    }

    @Override
    public void printInformation() {

    }

    private int add(int x , int y) {
        return x + y;
    }
}