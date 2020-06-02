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


        // CHALLENGE
        //create calculateHighScorePostion and displayHighScore methods

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Waluigi",     (highScorePosition));

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Mario", (highScorePosition));

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Luigi", (highScorePosition));

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Wario", (highScorePosition));

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

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public  static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        }else if (playerScore > 500) {
            return 2;
        } else if (playerScore > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
