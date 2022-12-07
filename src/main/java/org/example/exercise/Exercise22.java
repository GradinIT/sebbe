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
        printInformation();
        Scanner scanner = new Scanner(System.in);
        Integer guess = 0;
        int counter = 0;
        System.out.println("Give me a number between 1 and 1 000 000 (0 to quit ): ");
        guess = scanner.nextInt();
        while(guess.compareTo(randomValue) != 0 && counter < 20 && guess != 0) {
            if(guess.compareTo(randomValue) > 0) {
                System.out.println("The value is lower than your guess");
            }
            else if (guess.compareTo(randomValue) < 0 ){
                System.out.println("The value is higher than your guess");
            }
            counter++;
            System.out.println("you have " + ( 20 -counter )+ " guesses left");
            System.out.println("Give me a number between 0 and 1 000 000 (0 to quit ): ");
            guess = scanner.nextInt();
        }
        if(guess == 0) {
            System.exit(0);
        }
        System.out.println(" correct the number was " +randomValue + " and you guessed correct in "+counter + " tries");
    }

    @Override
    public void printInformation() {
        System.out.println("22. Skriv ett program som heter '20 frågor'. Programmet ska slumpa fram ett tal mellan 1 – 1000000.\n Användaren ska på högst 20 försök gissa vilket tal som har slumpats fram.\nFör varje gissning ska programmet svara om gissningenär rätt, för hög eller för låg.");

    }
}
