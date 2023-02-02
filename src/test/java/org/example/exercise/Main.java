package org.example.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = Integer.parseInt(scanner.nextLine().substring(0,2));
        if((nbr >= 20 &&  nbr <= 62 ) ||  nbr == 65 || nbr == 66) {
            System.out.println("Götaland");
        }
        else if (nbr >= 80) {
            System.out.println("Norrland");
        }
        else {
            System.out.println("Svealand");
        }
    }
}
