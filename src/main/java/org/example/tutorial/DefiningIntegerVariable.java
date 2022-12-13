package org.example.tutorial;

public class DefiningIntegerVariable {
    public static void main(String[] args) {
        int age = 10; // defines and initialize a variable of typ int ( integer ) with the name age and value 10
        System.out.println(age);
        age++; //increment by one
        System.out.println(age);
        age--; //decrement by one
        System.out.println(age);
        age += 5; // add 5 to age ( 10 + 5)
        System.out.println(age);

        Integer integer = 10;
        System.out.println(integer);
        integer++;
        System.out.println(integer);
        integer--;
        System.out.println(integer);
        integer += 5;
        System.out.println(integer);
    }
}
