package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise11 implements Exercise {
    @Override
    public void run() {
        printInformation();
        System.out.println("metoden har fel returtyp ( void ) den bör returnera int");

    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("11. Vad är fel med följande metod? Skriv om den så programmet går att köra."));
    }
}
