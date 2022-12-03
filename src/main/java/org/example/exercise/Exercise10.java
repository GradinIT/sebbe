package org.example.exercise;

import org.example.Exercise;

public class Exercise10 implements Exercise {
    public static void main(String[] args) {
        int a = 5, b = 4;
    }

    @Override
    public void run() {
        System.out.println("Running: " + this.getClass().getSimpleName());
        exercise10(5, 5);
        exercise10(5, 6);
        exercise10(8, 4);
    }

    private void exercise10(int x, int y) {
        if (x == y) {
            System.out.printf("%d is equal to %d\n", x, y);
        } else {
            x = y = 0;
            System.out.println(x);
            System.out.println(y);
        }
    }
}
