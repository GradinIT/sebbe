package org.example.exercise;

import org.example.Exercise;

import java.util.Scanner;

public class Exercise20 implements Exercise {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number ( 0 to exit )");
        int value = scanner.nextInt();
        while (value!= 0 ) {
            if( value % 2 == 0) {
                System.out.printf("%d is even\n",value);
            }
            else {
                System.out.printf("%d is odd\n",value);

            }
            System.out.print("Give me a number ( 0 to exit )");
            value = scanner.nextInt();
        }
    }
}
