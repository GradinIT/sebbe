package org.example.tutorial;

public class Arrays {
    public static void main(String[] args) {

        int[] myIntArray = {5,4,3,2,1};
        String[] myStringArray = {"Word","by","Word"};
        Person[] persons = {new Person(10,"name"),new Person(22,"Sebbe")};

        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("index i array:" +i + ", värdet: "+myIntArray[i]);
        }
        for (int i = 1 ; i > -1; i--) {
            System.out.println("index i array:" +i + ", värdet: "+persons[i]);
        }

    }

    private static final class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
