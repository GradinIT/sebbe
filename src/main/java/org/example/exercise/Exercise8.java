package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise8 implements Exercise {
    @Override
    public void run() {
        printInformation();
        System.out.println("char hanterar tecken ett åt gången String är flera tecken i rad som avslutas med null\n");
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("8. String och char kan båda innehålla valfria tecken. Vad är det för skillnad på dem?"));
    }
}
