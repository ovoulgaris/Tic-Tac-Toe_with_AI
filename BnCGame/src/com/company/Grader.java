package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Grader {
    private final ArrayList<Integer> userGuess = new ArrayList<>();
    private int userInput;
    private int bulls = 0;
    private int cows = 0;

    public Grader(int userInput) {
        this.userInput = userInput;
        convertUserInput();
    }

    public int getBulls() {
        return bulls;
    }

    public void checkGuess (ArrayList<Integer> secretCode) {
        for (int i = 0; i < userGuess.size(); i++) {
            System.out.println(userGuess.get(i));
            System.out.println((secretCode.get(i)));
            if (userGuess.get(i).equals(secretCode.get(i))) {
                this.bulls++;
            }
            else if (secretCode.contains(userGuess.get(i))) {
                this.cows++;
            }
        }
//        for (Integer guessDigit: userGuess){
//            if (secretCode.contains(guessDigit)){
//                this.cows++;
//            }
//        }
//        this.cows -= this.bulls;
    }

    public String printGuess () {
        if (this.bulls == 0 && this.cows == 0) {
            return "None";
        }
        else if (this.bulls == 0) {
            return this.cows + " cow(s)";
        }
        else if (this.cows == 0) {
            return this.bulls + " bull(s)";
        }
        else return this.bulls + " bull(s) and " + this.cows + " cow(s)";
    }

    private void convertUserInput () {
        int length = (int)(Math.log10(userInput)+1);
        for (int i = 0; i < length; i++){
            userGuess.add(userInput%10);
            userInput /= 10;
        }
        Collections.reverse(userGuess);
    }
}
