package org.example.tutorial;

public class Arrays {
    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5};
        String[] myStringArray = {"Word","by","Word"};

        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(myIntArray[i]);
        }
    }
}
