package tictactoe;

import java.util.ArrayList;

public abstract class Player {
    String name;
    String symbol;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract ArrayList<Integer> getCoordinates ();
}

