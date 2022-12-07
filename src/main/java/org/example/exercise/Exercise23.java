package org.example.exercise;

import org.example.Exercise;

public class Exercise23 implements Exercise {
    @Override
    public void run() {
        System.out.println("Running: "+this.getClass().getSimpleName()); // skriver ut Running Exercise1 i Terminalen

        for(int i = 0 ; i < 30 ; i += 10) {
            System.out.printf("%02d\n",i);
            for( int y = 1 ; y < 3 ; y++ ) {
                System.out.println(y);
            }
        }
    }

    @Override
    public void printInformation() {

    }
}
