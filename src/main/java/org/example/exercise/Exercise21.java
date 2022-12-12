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
        BigDecimal value = scanner.nextBigDecimal();
        while( !value.equals(0) ) {
            System.out.printf("%.2f square is %.2f",value,square(value));
            System.out.print("Give me a number to square( 0 to exit): ");
            value = scanner.nextBigDecimal();
        }
    }
    private BigDecimal square(BigDecimal x) {
        return x.multiply(x);
    }
    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("21. Skriv ett program som låter användaren mata in ett tal och returnerar det inmatade talet i kvadrat. " +
                "Om användaren matar in en nolla ska programmet avslutas"));
    }
}
