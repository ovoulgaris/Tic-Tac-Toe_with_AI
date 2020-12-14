package bullscows;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHandler {
    Scanner scanner = new Scanner(System.in);
//    private final StringBuilder secretCodeString = new StringBuilder();
    ArrayList<Number> secretCode = new ArrayList<>();
    private int turn = 1;
    private boolean gameFinished = false;

    public GameHandler(int length, int symbols) {
        createSecretCode(length,symbols);
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    private void createSecretCode (int length, int range){

        ArrayList<Number> numberArrayList = new ArrayList<>();

        for (int i = 0; i < range; i++) {
            if (i < 10) {
                numberArrayList.add(new Number(String.valueOf(i)));
            }
            else numberArrayList.add(new Number(Character.toString(i + 87)));
        }

        Random random = new Random();

        for (int i = 0; i < length; i++){

            int symbol = random.nextInt(numberArrayList.size());
            String str = numberArrayList.get(symbol).getNumber();
            boolean found = false;
            for (Number number: secretCode) {
                if (number.getNumber().equals(str)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                secretCode.add(new Number(str));
            }
            else i--;
        }

        String rangePrintout;
        if (range < 10) {
            rangePrintout = " (0-" + (range - 1) + ").";
        }
        else rangePrintout = " 0-9, a-" + numberArrayList.get(numberArrayList.size() - 1).getNumber() + ").";

        System.out.println("The secret code is prepared: " + "*".repeat(Math.max(0, length))
                + rangePrintout);
        System.out.println("Okay, let's start a game!");
    }

    public void printSecretCode () {
        for (Number number : secretCode) {
            number.printNumber();
        }
    }

    public void makeGuess () {
        System.out.printf("\nTurn %d:\n", this.turn);
        String input = scanner.nextLine();
        Grader grader = new Grader(input, this.secretCode);
        System.out.printf("Grade: %s.", grader.printGuess());
        if (secretCode.size() == grader.getBulls()) {
            System.out.println("\nCongratulations! You guessed the secret code.");
            this.gameFinished = true;
        }
        this.turn++;
    }
}
