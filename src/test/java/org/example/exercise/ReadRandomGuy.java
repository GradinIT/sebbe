package org.example.exercise;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ReadRandomGuy {
    private static final Map<Integer, String> guys = new HashMap<>();

    public static void main(String[] args) {
        try {
            InputStream inputStream = ReadRandomGuy.class.getClassLoader().getResourceAsStream("guys.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String guy = reader.readLine();
            int i = 1;
            while (guy != null) {
                guys.put(i, guy);
                i++;
                guy = reader.readLine();
            }
            System.out.println(guys);
            Random randomGenerator = new Random();
            for( int k = 0 ; k < 100 ; k++) {
                int randomIndex = randomGenerator.nextInt(1,guys.size()+1);
                System.out.println(guys.get(randomIndex));
            }
        } catch (Exception e) {

        }
    }
}
