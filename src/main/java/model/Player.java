package model;

import RendererEngine.CharacterRenderer;

public class Player extends AttackableCharacter {

    private boolean isInteractionEnabled;
    private int coins;

    public Player(GameContext gameContext, int x, int y, int width, int height, int speed, int hp, int strength, int shield) {
        super(gameContext, x, y, width, height, speed, hp, strength, shield);

        isInteractionEnabled = false;
        coins = 0;
    }

    public Player(GameContext gameContext, int x, int y) {
        this(gameContext, x, y, 25, 40, 5, 100, 4, 0);
    }

    public boolean isInteractionEnabled() {
        return isInteractionEnabled;
    }

    public void setInteractionEnabled(boolean interactionEnabled) {
        isInteractionEnabled = interactionEnabled;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void addCoins(int value) {
        this.coins += value;
    }

    @Override
    public int getAttack() {
        // TODO : Add weapon and object effect
        return super.getAttack();
    }

    @Override
    public int getDefense() {
        // TODO : Add object effect
        return super.getDefense();
    }

    @Override
    public void renderCharacter(CharacterRenderer characterRenderer) {
        characterRenderer.renderPlayer(this);
    }
}
