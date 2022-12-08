package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

import java.util.Scanner;

public class Exercise15 implements Exercise {
    private static final double exchangeRate = 0.094;
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Summa i SEK:");
        int amountInSek = scanner.nextInt();
        System.out.printf(" %d SEK är %f Euro",amountInSek, amountInEuro(amountInSek));
    }

    private double amountInEuro(int amountInSek) {
        return amountInSek * exchangeRate;
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("15. Skriv ett program som frågar användaren efter en summa i svenska kronor och returnerar hur mycket det motsvarar i euro (1 svensk krona = 0,094 Euro när uppgiften skapades)"));
    }
}
