package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise21 implements Exercise {
    @Override
    public void run() {
        printInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number to square( 0 to exit): ");
        int value = scanner.nextInt();
        while( value != 0 ) {
            System.out.printf("%.2f square is %.2f\n",value,square(value));
            System.out.print("Give me a number to square( 0 to exit): ");
            value = scanner.nextInt();
        }
    }
    private BigDecimal square(int x) {
        return new BigDecimal(x).multiply(new BigDecimal(x));
    }
    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("21. Skriv ett program som låter användaren mata in ett tal och returnerar det inmatade talet i kvadrat. " +
                "Om användaren matar in en nolla ska programmet avslutas"));
    }
}
