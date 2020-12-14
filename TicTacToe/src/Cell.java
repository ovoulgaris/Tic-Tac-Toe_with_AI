public class Cell {
    private Player player = null;

    public Cell() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getPlayerSymbol () {
        if (this.player == null){
            return " ";
        }
        else return this.player.getSymbol();
    }

    public void print () {
        if (this.player == null){
            System.out.print(" ");
        }
        else System.out.print(this.player.getSymbol());
    }
}
