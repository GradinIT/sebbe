package org.example.tutorial;

public class DefiningAConstant {
    // using final defines a field to be constant
    // a constant is good practise to nam in CAPITAL letters
    private static final String CONSTANT_STRING_VALUE = "CANT BE CHANGED";

    public static void main(String[] args) {
        System.out.println(CONSTANT_STRING_VALUE);
        //CONSTANT_STRING_VALUE = ""; // uncomment this line and read the error by hovering mouse ponter over the red underline or try to run
    }
}
