package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise9 implements Exercise {
    @Override
    public void run() {
        printInformation();
        System.out.println(" a = 5 är en tilldelning, dvs variabeln a innehåller nu värdet 5 ");
        System.out.println(" a == 5 är en jämförelse, dvs ett logiskt uttryck som kontrollerar om a innehåller värdet 5\n");
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("9. Vad är skillnaden på a = 5 och a == 5?"));
    }
}
