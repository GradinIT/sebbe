package org.example.exercise;

import org.example.Exercise;

public class Exercise2 implements Exercise {
    @Override
    public void run() {
        System.out.println("Running: "+this.getClass().getSimpleName());
        //TODO: add code
    }

    @Override
    public void printInformation() {

    }
}
