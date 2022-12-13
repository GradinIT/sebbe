package org.example.tutorial;

public class TheIfStatement {
    public static void main(String[] args) {
        for( int i = 0 ; i < 20 ; i++) {
            if( i < 10) {
                System.out.printf("%d is less than 10\n",i);
            }
            else if ( i == 10) {
                System.out.printf("%d is equal to 10\n",i);
            }
            else {
                System.out.printf("%d is greater than 10\n",i);
            }
        }
    }
}
