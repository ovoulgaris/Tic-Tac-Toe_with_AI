
import java.util.ArrayList;
import java.util.Scanner;

public class GameHandler {
    ArrayList<ArrayList<Cell>> gameBoard;
    ArrayList<Player> playerList;
    Scanner scanner = new Scanner(System.in);
    private boolean gameFinished = false;

    public GameHandler() {
        createBoard();
        addPlayers();
    }

    private void print() {
        System.out.print("---------");
        for (ArrayList<Cell> row : gameBoard){
            System.out.print("\n| ");
            for (Cell cell : row) {
                cell.print();
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println("\n---------");
    }

    private boolean checkForWinner() {
        for (ArrayList<Cell> row : gameBoard) {
            if (!row.get(0).getPlayerSymbol().equals(" ")
                    && row.get(0).getPlayerSymbol().equals(row.get(1).getPlayerSymbol())
                    && row.get(0).getPlayerSymbol().equals(row.get(2).getPlayerSymbol())) {
                System.out.println(playerList.get(0).getName() + " wins");
                this.gameFinished = true;
                return true;
            }
        }
        for (int i = 0; i < gameBoard.size(); i++) {
            if (!gameBoard.get(0).get(i).getPlayerSymbol().equals(" ")
                    && gameBoard.get(0).get(i).getPlayerSymbol().equals(gameBoard.get(1).get(i).getPlayerSymbol())
                    && gameBoard.get(0).get(i).getPlayerSymbol().equals(gameBoard.get(2).get(i).getPlayerSymbol())) {
                System.out.println(playerList.get(0).getName() + " wins");
                this.gameFinished = true;
                return true;
            }
        }

        if (!gameBoard.get(0).get(0).getPlayerSymbol().equals(" ")
                && gameBoard.get(0).get(0).getPlayerSymbol().equals(gameBoard.get(1).get(1).getPlayerSymbol())
                && gameBoard.get(0).get(0).getPlayerSymbol().equals(gameBoard.get(2).get(2).getPlayerSymbol())) {
            System.out.println(playerList.get(0).getName() + " wins");
            this.gameFinished = true;
            return true;
        }
        else if (!gameBoard.get(0).get(2).getPlayerSymbol().equals(" ")
                && gameBoard.get(0).get(2).getPlayerSymbol().equals(gameBoard.get(1).get(1).getPlayerSymbol())
                && gameBoard.get(0).get(2).getPlayerSymbol().equals(gameBoard.get(2).get(0).getPlayerSymbol())) {
            System.out.println(playerList.get(0).getName() + " wins");
            this.gameFinished = true;
            return true;
        }
        else if (checkForTotalSymbols()) {
            System.out.println("Draw");
            this.gameFinished = true;
        }
        return false;
    }

    public void addToBoard() {
        System.out.println("Enter the coordinates (x then y):");
        int x = scanner.nextInt() - 1;
        int y = scanner.nextInt() - 1;

        if (x > 2 || y > 2) {
            System.out.println("Coordinates should be from 1 to 3!");
            addToBoard();
        } else {
            if (gameBoard.get(y).get(x).getPlayer() == null) {
                gameBoard.get(y).get(x).setPlayer(playerList.get(0));
                print();
                checkForWinner();
                switchPlayer();
            } else {
                System.out.println("This cell is occupied! Choose another one!");
                addToBoard();
            }
        }
    }

    private boolean checkForTotalSymbols (){
        int xCount = 0;
        int oCount = 0;
        for (ArrayList<Cell> row : gameBoard){
            for (Cell cell : row){
                if (cell.getPlayerSymbol().equals("X")){
                    xCount++;
                }
                else if (cell.getPlayerSymbol().equals("O")){
                    oCount++;
                }
            }
        }
        return xCount + oCount == 9;
    }

    private void switchPlayer () {
        playerList.add(playerList.remove(0));
    }

    private void createBoard() {
        gameBoard = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            gameBoard.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                gameBoard.get(i).add(new Cell());
            }
        }
        print();
    }

    private void addPlayers () {
        playerList = new ArrayList<>();
        System.out.println("First player, type your name:");
        String firstPlayerName = scanner.nextLine();
        System.out.println("Second player, type your name:");
        String secondPlayerName = scanner.nextLine();
        playerList.add(new Player(firstPlayerName, "X"));
        playerList.add(new Player(secondPlayerName, "O"));
    }

    public boolean isGameFinished() {
        return gameFinished;
    }
}
