package org.example.exercise;

import org.example.Exercise;

public class Exercise1 implements Exercise {
    @Override
    public void run() {
        System.out.println("Running: "+this.getClass().getSimpleName());
        System.out.println("I Love Java");
    }
}
