package org.example.exercise;

import org.example.Exercise;

public class Exercise1 implements Exercise {
    @Override
    public void run() {
        System.out.println("Running: "+this.getClass().getSimpleName()); // skriver ut Running Exercise1 i Terminalen
        System.out.println("I Love Java"); // Skriver ut I Love Java i terminalen
    }

    @Override
    public void printInformation() {

    }
}
