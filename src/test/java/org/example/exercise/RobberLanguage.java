package org.example.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class RobberLanguage {
    private static List<Character> vowel = List.of('a','o','u','å','e','i','y','ä','ö');
    public static void main(String[] args) throws Exception {
        //Övning 10.6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a line to translate to robber language:");
        String textToTranslate = scanner.nextLine();
        String translatedText = translateToRobberLanguage(textToTranslate);
        System.out.println(translatedText);

        File file = new File("crypto.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(translatedText);
        writer.flush();
        writer.close();

        // Övning 10.7
        BufferedReader reader = new BufferedReader(new FileReader(file));
        translatedText = reader.readLine();
        reader.close();
        System.out.println(translateFromRobberLanguage(translatedText));

    }
    private static String translateToRobberLanguage(String textToTranslate){
        StringBuilder builder = new StringBuilder();
        textToTranslate.chars().forEach(character -> {
            char c = (char)character;
            if(vowel.contains(c) || c == ' ' ) {
                builder.append(c);
            }
            else {
                builder.append(c+"o"+c);
            }
        });
        return builder.toString();
    }
    private static String translateFromRobberLanguage(String textToTranslate){
        StringBuilder builder = new StringBuilder();
        char[] chars = textToTranslate.toCharArray();
        for (int i = 1 ; i < chars.length; i++) {
            if(chars[i] == 'o' && chars[i-1] == chars[i+1]) {
                i++;
            }
            else {
              builder.append(chars[i-1]);
            }
        }
        return builder.toString();
    }
}
