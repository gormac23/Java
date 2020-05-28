package com.gormac23;

public class LogicalOperators {

    public static void main(String[] args) {

        int topScore = 100;
        // Equal Operator
        if (topScore == 100) {
            System.out.println("You have the high-score");
        }
        // Not Operator
        if (topScore != 100) {
            System.out.println("You do NOT have the high-score");
        }
        boolean isTopScore = false;
        if (isTopScore == false) {
            System.out.println("Not the top score");
        }
        // This is a better way to write the above code
        if (!isTopScore) {
            System.out.println("Not the top score");
        }
        // You can shorten boolean expressions by using the variable name itself as the comparrison
        // this works for true and false...
        // instead of using isTopScore == true or false etc.
        // just use isTopScore or !isTopScore, as seen above

        // Greater-than Operator
        int newScore = 150;
        if (newScore > 100) {
            System.out.println("You beat the high-score");
        }
        // Less-than Operator
        int badScore = 10;
        if (badScore < 100) {
            System.out.println("You didn't beat the high-score");
        }
        // AND Operator ... Both sides need to be TRUE
        int secondScore = 50;
        if ((secondScore > badScore) && (secondScore < topScore)) {
            System.out.println("Beat the lowest but less than the high-score");
        }
        // OR Operator ... Only one side need to be TRUE
        if ((secondScore > badScore) || (secondScore > topScore)) {
            System.out.println("Beat the lowest OR you score was less than the high-score");
        }
    }
}
