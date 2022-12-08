package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise6 implements Exercise {
    @Override
    public void run() {
        printInformation();
        System.out.println("Eftersom en person sällan blir äldre än 100 så är byte,short och int lämpliga");
        System.out.println("Även Wrapper Typerna Byte, Short och Integer är lämpliga\n");
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("6. Nämn en datatyp som är lämplig för att innehålla en persons ålder"));
    }
}
