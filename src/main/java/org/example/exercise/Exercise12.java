package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

import java.util.Scanner;

public class Exercise12 implements Exercise {
    @Override
    public void run() {
        printInformation();
        Scanner scanner = new Scanner(System.in); // reads input from console
        System.out.println("Give me your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "Welcome!");
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("12. Skriv ett program som frågar–Vad heter du? \n" +
                "    Användaren får sedan skriva in sitt namn och programmet ska då skrivaut \n" +
                "    -Hej (användarens namn).Välkommen hit!"));

    }
}
