package org.example.exercise;

import org.example.Exercise;

public class RandomDice implements Exercise {
    @Override
    public void run() {
        System.out.println("Running: "+this.getClass().getSimpleName()); // skriver ut Running Exercise1 i Terminalen
        Dice dice = new Dice();
        System.out.println(dice.throwDice());
    }
}
