package org.example.exercise;

import org.example.Exercise;
import org.example.util.TextUtil;

public class Exercise2 implements Exercise {
    @Override
    public void run() {
        printInformation();
    }

    @Override
    public void printInformation() {
        System.out.println(TextUtil.underLineText("2. Skriv minsta möjliga program som kan kompileras och köras"));

        String minimalProgram = "public class Main {\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t}\n" +
                "}\n";
        System.out.println(minimalProgram);
    }
}
