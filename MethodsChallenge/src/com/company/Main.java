package com.company;

public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Ody", calculateHighScorePosition(1500));

        displayHighScorePosition("Ody", calculateHighScorePosition(900));

        displayHighScorePosition("Ody", calculateHighScorePosition(400));

        displayHighScorePosition("Ody", calculateHighScorePosition(50));


        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //

    }

    public static void displayHighScorePosition(String playerName, int tablePosition){

        System.out.println(playerName + " managed to get into position " + tablePosition);
    }

    public static int calculateHighScorePosition(int highScore){

        if(highScore >= 1000){
            return 1;
        }
        if(highScore >= 500 && highScore < 1000){
            return 2;
        }
        if(highScore >= 100 && highScore < 500){
            return 3;
        }
        else {
            return 4;
        }
    }
}
