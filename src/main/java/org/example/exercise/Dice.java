package org.example.exercise;

public class Dice {
    private int value;

    public Dice() {

    }
    public int throwDice() {
        this.value = (int)(Math.random() * 6) +1;
        return value;
    }
    public int getValue() {
        return value;
    }
}
