package org.example.tutorial;

public class DefiningAConstant {
    private static final String CONSTANT_STRING_VALUE = "CANT BE CHANGED";

    public static void main(String[] args) {
        System.out.println(CONSTANT_STRING_VALUE);
        //CONSTANT_STRING_VALUE = ""; // uncomment this line and read the error by hovering mouse ponter over the red underline or try to run
    }
}
