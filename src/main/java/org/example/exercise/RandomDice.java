package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class RandomDice implements Exercise {
    @Override
    public void run() {
        Dice dice = new Dice();
        System.out.println(dice.throwDice());
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("Random Dice Example"));
    }
}
