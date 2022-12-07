package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise23 implements Exercise {
    @Override
    public void run() {
        printInformation();
        for(int i = 0 ; i < 30 ; i += 10) {
            System.out.printf("%02d\n",i);
            for( int y = 1 ; y < 3 ; y++ ) {
                System.out.println(y);
            }
        }
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("23. Skriv koden som genererar följande utskriftAnvänd en nästlad for loop."));
    }
}
