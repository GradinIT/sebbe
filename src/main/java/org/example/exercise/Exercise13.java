package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

import java.util.Scanner;

public class Exercise13 implements Exercise {
    @Override
    public void run() {
        printInformation();
        Scanner scanner = new Scanner(System.in); // reads input from console
        System.out.print("firstname: ");
        String firstname = scanner.nextLine();
        System.out.print("lastname: ");
        String lastname = scanner.nextLine();
        System.out.print("adress: ");
        String adress = scanner.nextLine();
        System.out.println("Firstname: " +firstname);
        System.out.println("Lastname: " +lastname);
        System.out.println("Adress: " +adress);
        System.out.println("");
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("13.Modifiera programmet så att användaren får skriva in förnamn, efternamn och adress. Skriv sedan ut dessa på skärmenpå varsin rad"));
    }
}
