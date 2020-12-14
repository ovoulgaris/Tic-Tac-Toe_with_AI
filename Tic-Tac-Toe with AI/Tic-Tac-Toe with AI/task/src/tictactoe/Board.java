package tictactoe;

import java.util.ArrayList;

public class Board {
    ArrayList<ArrayList<Cell>> gameBoard;

    public Board() {
        gameBoard = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            gameBoard.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                gameBoard.get(i).add(new Cell());
            }
        }
        print();
    }

    public void addToBoard(ArrayList<Integer> coordinates, Player player) {
        Cell cell = gameBoard.get(coordinates.get(0)).get(coordinates.get(1));
        cell.setPlayer(player);
        print();
        checkForWinner(player);
    }

    private void print() {
        System.out.print("---------");
        for (ArrayList<Cell> row : gameBoard) {
            System.out.print("\n| ");
            for (Cell cell : row) {
                cell.print();
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println("\n---------");
    }

    public boolean checkForTotalSymbols() {
        int xCount = 0;
        int oCount = 0;
        for (ArrayList<Cell> row : gameBoard) {
            for (Cell cell : row) {
                if (cell.getPlayer() == null) {
                    return false;
                } else if (cell.getPlayerSymbol().equals("X")) {
                    xCount++;
                } else if (cell.getPlayerSymbol().equals("O")) {
                    oCount++;
                }
            }
        }
        return xCount + oCount == 9;
    }

    private void checkForWinner(Player player) {

        int count = 0;

        for (ArrayList<Cell> row : gameBoard) {
            count = 0;
            for (Cell cell : row) {
                if (!(cell.getPlayer() == null)) {
                    if (cell.getPlayer().getName().equals(player.getName())) {
                        count++;
                    }
                }
            }
            if (count == 3) {
                System.out.println(player.getName() + " wins");
                System.exit(0);
            }
        }

        for (int i = 0; i < 3; i++) {
            count = 0;
            for (int j = 0; j < 3; j++) {
                Cell currentCell = gameBoard.get(j).get(i);
                if (!(currentCell.getPlayer() == null)) {
                    if (currentCell.getPlayer().getName().equals(player.getName())) {
                        count++;
                    }
                }
            }
            if (count == 3) {
                System.out.println(player.getName() + " wins");
                System.exit(0);
            }
        }

        count = 0;
        for (int i = 0; i < 3; i++) {
            Cell currentCell = gameBoard.get(i).get(i);
            if (!(currentCell.getPlayer() == null)) {
                if (currentCell.getPlayer().getName().equals(player.getName())) {
                    count++;
                }
            }
        }
        if (count == 3) {
            System.out.println(player.getName() + " wins");
            System.exit(0);
        }

        count = 0;
        int j = 0;
        for (int i = 2; i >= 0; i--) {
            Cell currentCell = gameBoard.get(j).get(i);
            if (!(currentCell.getPlayer() == null)) {
                if (currentCell.getPlayer().getName().equals(player.getName())) {
                    count++;
                }
            }
            j++;
        }
        if (count == 3) {
            System.out.println(player.getName() + " wins");
            System.exit(0);
        }

        if (checkForTotalSymbols()) {
            System.out.println("Draw");
            System.exit(0);
        }
    }
}
