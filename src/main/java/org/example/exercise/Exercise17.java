package org.example.exercise;

import org.example.Exercise;

public class Exercise17 implements Exercise {
    @Override
    public void run() {
        for( int i = 0; i < 21 ; i++) {
            if ( i % 2 != 0)
                System.out.println(i);
        }
    }
}
