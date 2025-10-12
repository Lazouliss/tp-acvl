package model;

import RendererEngine.CharacterRenderer;

public class Ennemy extends AttackableCharacter {
    public Ennemy(GameContext gameContext, int x, int y, int width, int height, int speed, int hp, int strength, int shield) {
        super(gameContext, x, y, width, height, speed, hp, strength, shield);
    }


    @Override
    public void renderCharacter(CharacterRenderer characterRenderer) {
        characterRenderer.renderEnnemy(this);
    }
}
