package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise19 implements Exercise {
    @Override
    public void run() {

    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText(
                "19. Modifiera programmet från Önving 18 så det skriver ut alfabetet i omvänd ordning (Z –A)\n"
        ));
    }
}
