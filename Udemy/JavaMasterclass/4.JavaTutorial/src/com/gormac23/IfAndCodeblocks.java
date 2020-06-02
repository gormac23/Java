package com.gormac23;

public class IfAndCodeblocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score = " + score);
            System.out.println("This is printed as well as part of the codeblock");
        } else if (score < 5000) {
            System.out.println("Use else if to access multple possible outcomes");
        } else {
            System.out.println("This tuns if everything else comparison fails");

        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score = " + finalScore); // finalScore is created inside the code-block
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score = " + finalScore); // finalScore is created inside the code-block
        }
    }
}
