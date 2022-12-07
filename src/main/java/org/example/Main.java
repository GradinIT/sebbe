package org.example;

import org.example.exercise.Exercise1;
import org.example.exercise.Exercise10;
import org.example.exercise.Exercise14;
import org.example.exercise.Exercise16;
import org.example.exercise.Exercise17;
import org.example.exercise.Exercise18;
import org.example.exercise.Exercise2;
import org.example.exercise.Exercise20;
import org.example.exercise.Exercise22;
import org.example.exercise.Exercise23;
import org.example.exercise.Exercise3A;
import org.example.exercise.Exercise3B;
import org.example.exercise.RandomDice;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Exercise> exercises = Arrays.asList(
                new Exercise1(),
                new Exercise2()
 /*               new Exercise3A(),
                new Exercise3B(),
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