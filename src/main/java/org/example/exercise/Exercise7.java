package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise7 implements Exercise {
    @Override
    public void run() {
        printInformation();
        System.out.println("Av de primitiva typerna är float och double lämpliga");
        System.out.println("Av Wrapper typerna är Float och Double lämpliga\n");
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("7. Nämn en datatyp som är lämplig för att innehålla en persons vikt"));
    }
}
