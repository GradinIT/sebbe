package org.example.tutorial;

public class DefiningStringVariable {
    public static void main(String[] args) {
        String name = "Arthur Dent";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.chars().count());
        System.out.println(name.length());
        name = name + " more text";
        System.out.println(name);
        name = "a new text";
        System.out.println(name);
    }
}
