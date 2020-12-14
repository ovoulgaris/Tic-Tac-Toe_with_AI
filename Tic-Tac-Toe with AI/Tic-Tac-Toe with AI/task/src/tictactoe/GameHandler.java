package tictactoe;

import java.util.ArrayList;

public class GameHandler {

    private ArrayList<Player> playerList;
    private Board board;

    public GameHandler(String player1, String player2) {
        playerList = new ArrayList<>();
        playerList.add(new HumanPlayer(player1));
        playerList.add(new AIPLayer(player2));
        this.board = new Board();
        nextMove();
    }

    public void nextMove () {
        ArrayList<Integer> coordinates = playerList.get(0).getCoordinates();
        this.board.addToBoard(coordinates,playerList.get(0));
        switchPlayer();
        nextMove();
    }

    public void switchPlayer () {
        playerList.add(playerList.remove(0));
    }
}

