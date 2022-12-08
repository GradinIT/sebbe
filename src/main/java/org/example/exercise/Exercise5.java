package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise5 implements Exercise {
    @Override
    public void run() {
        printInformation();
        System.out.println("Ett bra variabelnamn är tydligt och beskrivande så man förstår vad den är och hur den används.\n");
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("5. Vad kännetecknar ett bra variabelnamn?"));
    }
}
