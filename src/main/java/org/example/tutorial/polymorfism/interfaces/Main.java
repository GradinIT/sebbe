package org.example.tutorial.polymorfism.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Eatable> eatables = new ArrayList<>();
        List<Fruit> fruits = new ArrayList<>();
        Apple apple = Apple.builder()
                .name("Granny Smith")
                .id(1L)
                .build();
        eatables.add(apple);
        fruits.add(apple);
        System.out.println(eatables);
        System.out.println(fruits);


        System.out.println(Math.PI * Math.pow(2,2));
        System.out.println(Math.PI * 2);
    }
}
