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
                new Exercise4()
  /*
                new Exercise10(),
                new Exercise14(),
                new Exercise16(),
                new Exercise17(),
                new Exercise18(),
                new Exercise20(),
                new Exercise23(),
                new RandomDice(),
                new Exercise22()

  */
        );
        exercises.forEach(Exercise::run);
    }
}