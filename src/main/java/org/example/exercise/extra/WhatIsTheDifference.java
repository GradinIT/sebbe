package org.example.exercise.extra;


public class WhatIsTheDifference {
    public static void main(String[] args) {
        int i = 10;
        Integer integer = 10;

        System.out.println(i);
        System.out.println(++i);
        System.out.println(integer);
        System.out.println(++integer);

        System.out.println( i == integer);
        System.out.println(integer.compareTo(i) == 0); // why can you access methods on the instance integer but not on i ??
    }
}
