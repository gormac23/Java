package com.gormac23;

// using methods, we clean up the code from 'IfAndCodeblocks'
public class Methods {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Can state variables before the method, or in the method call itself
        calculateScore(gameOver ,score, levelCompleted, bonus);

        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("High Score = " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score = " + finalScore); // finalScore is created inside the code-block
            return finalScore;
        } else {
            return -1; // using -1 is conventional way for returning a value when there is an error or no value found
        }
    }
}
