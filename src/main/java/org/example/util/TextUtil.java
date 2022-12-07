package org.example.util;

public class TextUtil {
    public static String underLineText(String text) {
        return String.join("\u0332",text.split("",-1));
    }
}
