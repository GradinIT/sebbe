package org.example.tutorial;

import java.util.Scanner;

public class WhileStatement {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("do you wanna quit ( Yes / No ): ");
            String answer = scanner.next();
            if(answer.equals("Yes")) {
                System.exit(0);
            }
        }
    }
}
