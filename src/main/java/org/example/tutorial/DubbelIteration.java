package org.example.tutorial;

import java.util.Arrays;

public class DubbelIteration {
    public static void main(String[] args) {
       for (int i = 0 ; i < 6 ; i++) {
           grade(i);
       }
    }
    private static void grade( int x ) {
        if( x < 5) {
            if(x < 4)
                System.out.println("IG " +x);
            else
                System.out.println("G " +x);
        }
        else {
            System.out.println("VG " +x);
        }
    }
}
