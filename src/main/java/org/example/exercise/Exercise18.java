package org.example.exercise;

import org.example.Exercise;

public class Exercise18 implements Exercise {
    @Override
    public void run() {
        for (char c = 'A';  c <= 'Z' ; c++) {
            System.out.print(c);
        }
    }

    @Override
    public void printInformation() {

    }
}
