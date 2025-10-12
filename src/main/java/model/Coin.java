package model;

public class Coin implements Collectable {

    private int value;

    public Coin(int value) {
        this.value = value;
    }

    @Override
    public void collect(Player p) {
        p.addCoins(value);
    }
}
