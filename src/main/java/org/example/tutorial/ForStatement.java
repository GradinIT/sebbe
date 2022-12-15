package org.example.tutorial;

public class ForStatement {
    public static void main(String[] args) {
        for ( int i = 0 ; i < args.length ; i++) {
            System.out.printf("argument nbr: %d conatains %s\n",i,args[i]);
        }
    }
}
