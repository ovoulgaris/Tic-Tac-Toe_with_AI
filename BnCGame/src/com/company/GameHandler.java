package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHandler {
    Scanner scanner = new Scanner(System.in);
    //    private final StringBuilder secretCodeString = new StringBuilder();
    ArrayList<Integer> secretCode = new ArrayList<>();
    private int turn = 1;
    private boolean gameFinished = false;

    public GameHandler(int length) {
        createSecretCode(length);
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public void createSecretCode (int length){
        Random random = new Random();
        for (int i = 0; i < length; i++){
            int number = random.nextInt(10);
            if (!secretCode.contains(number)) {
                secretCode.add(number);
            }
            else i--;
        }
        System.out.println(secretCode);
    }

//    public void getSecretCodeString () {
//        for (Integer integer: secretCode){
//            this.secretCodeString.append(integer.toString());
//        }
//        System.out.printf("The random secret number is %s",
//                this.secretCodeString);
//    }

    public void makeGuess () {
        System.out.printf("\nTurn %d:\n", this.turn);
        int input = scanner.nextInt();
        System.out.println(input);
        Grader grader = new Grader(input);
        grader.checkGuess(this.secretCode);
        System.out.printf("Grade: %s.", grader.printGuess());
        if (secretCode.size() == grader.getBulls()) {
            System.out.println("\nCongratulations! You guessed the secret code.");
            this.gameFinished = true;
        }
        this.turn++;
    }
}
