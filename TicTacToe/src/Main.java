public class Main {

    public Main() {

        GameHandler gameHandler = new GameHandler();

        while (!gameHandler.isGameFinished()) {
            gameHandler.addToBoard();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
