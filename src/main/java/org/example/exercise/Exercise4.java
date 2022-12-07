package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise4 implements Exercise {
    @Override
    public void run() {
        printInformation();
        System.out.println("en int är en primär datatyp som representerar heltal och är 4 byte stor");
        System.out.println("en int är en primär datatyp som representerar flyttal/decimaltal och är 8 byte stor\n");
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("4. Vad är det för skillnad på int, som är en heltalsvariabel, och double, som är en flyttalsvariabel?"));
    }
}
