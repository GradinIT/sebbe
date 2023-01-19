package org.example.javastegforsteg;

public class Score {
    public Score(int i) {
        System.out.printf("the score %d give you a grade of %s\n",i,getGrade(i));
    }

    private String getGrade(int score) {
        if(score < 25) return "F";
        if(score > 25 && score <30) return "E";
        if(score > 30 && score <35) return "D";
        if(score > 35 && score <40) return "C";
        if(score > 40 && score <45) return "B";
        return "A";
    }

    public static void main(String[] args) {
        new Score(33);
    }
}
