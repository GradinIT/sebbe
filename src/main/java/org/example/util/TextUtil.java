package org.example.util;

public class TextUtil {
    public static String underLineText(String text) {
        return String.join("̲",text.split(""));
    }
}
