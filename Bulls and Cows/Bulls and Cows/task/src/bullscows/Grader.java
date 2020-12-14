package bullscows;

import java.util.ArrayList;
import java.util.Collections;

public class Grader {
    private ArrayList<Number> userGuess;
    private final ArrayList<Number> secretCode;
    private final String userInput;
    private int bulls = 0;
    private int cows = 0;

    public Grader(String userInput, ArrayList<Number> secretCode) {
        this.userInput = userInput;
        this.secretCode = secretCode;
        convertUserInput();
        checkGuess();
    }

    public int getBulls() {
        return bulls;
    }

    private void checkGuess () {
        for (int i = 0; i < userGuess.size(); i++) {
            if (userGuess.get(i).getNumber().equals(secretCode.get(i).getNumber())) {
                this.bulls++;
            }
            for (Number number : secretCode) {
                if (userGuess.get(i).getNumber().equals(number.getNumber())) {
                    this.cows++;
                }
            }
        }
        cows -= bulls;
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
        userGuess = new ArrayList<>();
        for (int i = 0; i < userInput.length(); i++){
            userGuess.add(new Number(String.valueOf(userInput.charAt(i))));
        }
    }
}
