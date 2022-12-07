package org.example.exercise;

import org.example.Exercise;

public class Exercise18 implements Exercise {
    @Override
    public void run() {
        for (char c = 65 ; c < 91; c++) {
            System.out.println(c);
        }
        for (char c = 91 ; c > 64; c--) {
            System.out.println(c);
        }
    }

    @Override
    public void printInformation() {

    }
}
