package org.example.exercise;

import java.util.HashMap;
import java.util.Map;

public class NaturalDistribution {
    public static void main(String[] args) {

        Map<Integer,Long> diceRolls = new HashMap<>();
        for (int i = 0 ; i < 100000 ; i++) {
            Dice dice = new Dice();
            int roll = dice.throwDice();
            if(diceRolls.containsKey(roll)) {
                long value = diceRolls.get(roll);
                value++;
                diceRolls.put(roll,value);
            }
            else
                diceRolls.put(roll,1L);
        }

        System.out.println(diceRolls);
        System.out.println(100000/6);
    }

}
