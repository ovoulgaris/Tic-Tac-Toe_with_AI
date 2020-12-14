package tictactoe;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String name) {
        super(name);
        super.symbol = "X";
    }

    @Override
    public ArrayList<Integer> getCoordinates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates: ");
        String input = scanner.nextLine();
        ArrayList<Integer> coordinates = addCoordinates(input);
        if (coordinates == null) {
            getCoordinates();
        }
        return coordinates;
    }

    private ArrayList<Integer> addCoordinates (String inputtedCoordinates) {
        String[] str = inputtedCoordinates.split(" ");
        ArrayList<Integer> coordinatesArrayList = new ArrayList<>();
        for (String s : str) {
            coordinatesArrayList.add(Integer.parseInt(s) - 1);
        }
        for (Integer coordinates : coordinatesArrayList) {
            if (coordinates > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
                return null;
            }
        }
        return coordinatesArrayList;
    }

}
