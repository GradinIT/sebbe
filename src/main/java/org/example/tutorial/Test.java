package org.example.tutorial;

public class Test {
    public static void main(String[] args) {
       for(int i = -2 ; i < 12 ; i++ ) {
           System.out.println(i + " " +tioKomplement(i));
       }
    }
    private static int tioKomplement(int p){
        if( p < 0 || p > 10)
            return -1;
        return 10-p;
    }
}
