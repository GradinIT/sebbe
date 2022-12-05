package org.example;

import org.example.exercise.Exercise1;
import org.example.exercise.Exercise10;
import org.example.exercise.Exercise14;
import org.example.exercise.Exercise16;
import org.example.exercise.Exercise17;
import org.example.exercise.Exercise18;
import org.example.exercise.Exercise2;
import org.example.exercise.Exercise20;
import org.example.exercise.Exercise23;
import org.example.exercise.Exercise3A;
import org.example.exercise.Exercise3B;
import org.example.exercise.RandomDice;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Exercise> exercises = Arrays.asList(
               // new Exercise20(),
               // new RandomDice()
                new Exercise23()
        );
        exercises.forEach(Exercise::run);
    }
}