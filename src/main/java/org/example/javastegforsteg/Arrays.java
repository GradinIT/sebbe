package org.example.javastegforsteg;

public class Arrays {
    private static int[] a;
    private static int[] b;
    public static void main(String[] args) {
        a = initialize(false,100);
        b = initialize(true,20);
    }

    private static int[] initialize(boolean setElementsToZero , final int numberOfElements) {
        int[] result = new int [numberOfElements];
        for(int i= 0; i<numberOfElements; i++) {
            if(setElementsToZero) {
                result[i] = 0;
            }
            else {
                result[i] = i;
            }
        }
        return result;
    }
}
