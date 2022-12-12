package org.example;

import org.example.exercise.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Exercise> exercises = Arrays.asList(
                new Exercise1(),
                new Exercise2(),
                new Exercise3(),
                new Exercise4(),
                new Exercise5(),
                new Exercise6(),
                new Exercise7(),
                new Exercise8(),
                new Exercise9(),
                new Exercise10(),
                new Exercise11(),
                new Exercise12(),
                new Exercise13(),
                new Exercise14(),
                new Exercise15(),
                new Exercise16(),
                new Exercise17(),
                new Exercise18(),
                new Exercise19(),
                new Exercise20(),
                new Exercise21(),
                new Exercise22(),
                new Exercise23(),
                new RandomDice()
        );
        exercises.forEach(Exercise::run);

    }
}