package com.gormac23;

public class ExpressionChallenge {
    // state what is an expression
    public static void main(String[] args) {

        int score = 100; // Expression = "score = 100"
        if (score > 90) { // Expression = "score > 90"
            System.out.println("You got the highscore!"); // Expression = ""You got the highscore!""
            score = 0; // score = 0
        }
    }
}
