package org.example.tutorial;

import java.util.Scanner;

public class DoWhileStatement {
    public static void main(String[] args) {
        String answer = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("do you wanna quit ( Yes / No ): ");
            answer = scanner.next();
        } while (!answer.equals("Yes"));
    }
}
