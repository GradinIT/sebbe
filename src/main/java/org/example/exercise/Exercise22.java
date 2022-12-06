package org.example.exercise;

import org.example.Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise22 implements Exercise {
    private static Random rand = new Random(); //instance of random class
    //generate random values from 0- 1 000 000
    private final Integer randomValue = rand.nextInt(1000000);
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Integer guess = 0;
        int counter = 0;
        System.out.println("Give me a number between 0 and 1 000 000: ");
        guess = scanner.nextInt();
        while(guess != randomValue && counter < 20) {
            if(guess > randomValue) {
                System.out.println("The value is lower than your guess");
            }
            else {
                System.out.println("The value is higher than your guess");
            }
            counter++;
            System.out.println("you have " + ( 20 -counter )+ "guesses left");
            System.out.println("Give me a number between 0 and 1 000 000: ");
            guess = scanner.nextInt();
        }
    }
}
