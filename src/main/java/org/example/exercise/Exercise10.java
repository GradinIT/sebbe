package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise10 implements Exercise {
    public static void main(String[] args) {
        int a = 5, b = 4;
    }

    @Override
    public void run() {
        printInformation();
        System.out.print("prövar me x = 5 , y = 5 \t"); exercise10(5, 5);
        System.out.print("prövar me x = 5 , y = 6 \t"); exercise10(5, 6);
        System.out.print("prövar me x = 8 , y = 4 \t"); exercise10(8, 4);
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("10. Skriv en if-sats som kontrollerar värdet på två heltal. Har de samma värdeså ska det skrivas ut i konsolen. \nOm de inte har samma värde så ska båda variablernas värde ändras till 0. Skriv sedan utför att kontrollera att värdena har ändrats."));
    }

    private void exercise10(int x, int y) {
        if (x == y) {
            System.out.printf("%d is equal to %d\n", x, y);
        } else {
            x = y = 0;
            System.out.printf("Not equal, set bouth to zero %d %d\n", x, y);
        }
    }
}
