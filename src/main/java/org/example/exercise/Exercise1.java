package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise1 implements Exercise {
    @Override
    public void run() {
        printInformation();
        System.out.println("I Love Java\n"); // Skriver ut I Love Java i terminalen
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("1. Skriv ett program som skriver ut JAG ÄLSKAR JAVA på skärmen"));
    }
}
