package org.example.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(method(10000,0.04,-1000));
    }
    public static String leftPadding(String s , int numberOfLetters) {
        if(numberOfLetters < s.length()) {
            return String.format(  ">%" + numberOfLetters + "s<%n", s.substring(s.length()-numberOfLetters));
        }
        return String.format(  ">%" + numberOfLetters + "s<%n", s );
    }

    private static int method(double amount , double rate , double withdraw ){
        double interest = amount * rate;
        if(withdraw <= interest) {
            return Integer.MAX_VALUE;
        }
        double amount_account = (amount + interest - withdraw);
        int year_counter = 1;
        while( amount_account > 0) {
            System.out.println("left on account:" + amount_account);
            interest = amount_account * rate;
            amount_account += interest;
            amount_account -= withdraw;
            year_counter++;
        }
        return year_counter;
    }
}
