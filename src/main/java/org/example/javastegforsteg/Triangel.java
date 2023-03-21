package org.example.javastegforsteg;

public class Triangel {

    public static void main(String[] args) {
        double sideA = 3;
        double sideB = 4;
        double sideC = lengthOfThirdSideInATriangle(sideA,sideB,90);
        System.out.println(sideC);
        System.out.println(isIsosceles(sideA,sideB,sideC));
        System.out.println(isEquilateralTriangle(sideA,sideB,sideC));
        System.out.println(isDifferentSided(sideA,sideB,sideC));
    }
    private static boolean isDifferentSided(double  sideA, double sideB, double sideC) {
        double epsilon = 0.000001d;
        return Math.abs(sideA - sideB) > epsilon && Math.abs(sideA -sideC) > epsilon;
    }
    private static boolean isEquilateralTriangle(double  sideA, double sideB, double sideC) {
        double epsilon = 0.000001d;
        return Math.abs(sideA - sideB) < epsilon && Math.abs(sideA -sideC) < epsilon;
    }
    private static boolean isIsosceles(double  sideA, double sideB, double sideC) {
        double epsilon = 0.000001d;
        return Math.abs(sideA - sideB) < epsilon || Math.abs(sideA -sideC) < epsilon;
    }
    private static double lengthOfThirdSideInATriangle( double sideA, double sideB , double angle) {
        double sqSideA = sideA * sideA;
        double sqSideB = sideB * sideB;
        double cosAngle = Math.cos(angle);
        double sideATimesSideBtimesTwo = 2*(sideA * sideB);

        return Math.sqrt(sqSideA + sqSideB - (sideATimesSideBtimesTwo * cosAngle));
    }
}
