package tictactoe;

import java.util.ArrayList;
import java.util.Random;

public class AIPLayer extends Player {

    public AIPLayer(String name) {
        super(name);
        super.symbol = "O";
    }

    @Override
    public ArrayList<Integer> getCoordinates () {
        Random random = new Random();
        ArrayList<Integer> coordinates = new ArrayList<>();
        coordinates.add(random.nextInt(2));
        coordinates.add(random.nextInt(2));
        return coordinates;
    }

    public void moveCompleted () {
        System.out.println("Making move level \"easy\"");
    }
}
