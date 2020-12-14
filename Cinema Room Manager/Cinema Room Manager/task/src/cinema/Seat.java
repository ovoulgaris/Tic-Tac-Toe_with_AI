package cinema;

public class Seat {
    private final int price;
    private boolean isSeatOccupied;

    public Seat(int price) {
        this.price = price;
        this.isSeatOccupied = false;
    }

    public void bookSeat () {
        this.isSeatOccupied = true;
    }

    public int getPrice() {
        return price;
    }

    public boolean isSeatOccupied() {
        return isSeatOccupied;
    }
}
