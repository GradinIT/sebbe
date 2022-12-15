package org.example.tutorial;

public class SwitchStatement {
    public static void main(String[] args) {
        for(int i = 0 ; i < 4 ; i++){
            switch (i) {
                case 1 -> System.out.println("one");
                case 2 -> System.out.println("two");
                default -> System.out.println(i);
            }
        }
    }
}
