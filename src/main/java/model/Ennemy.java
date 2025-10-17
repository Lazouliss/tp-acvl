package model;

import RendererEngine.CharacterRenderer;

public class Ennemy extends AttackableCharacter {
    public Ennemy(GameContext gameContext, int x, int y, int width, int height, int speed, int hp, int strength, int shield) {
        super(gameContext, x, y, width, height, speed, hp, strength, shield);
    }

    public Ennemy(GameContext gameContext, int x, int y) {
        super(gameContext, x, y, 20, 40, 1, 100, 2, 0);
    }


    @Override
    public void renderCharacter(CharacterRenderer characterRenderer) {
        characterRenderer.renderEnnemy(this);
    }

    @Override
    public void execute() {
        Player player = gameContext.getPlayer();

        int dx = 0;
        int dy = 0;

        if(player.getX() > getX()) {
            dx = 1;
        }
        else if(player.getX() < getX()) {
            dx = -1;
        }

        if(player.getY() > getY()) {
            dy = 1;
        }
        else if(player.getY() < getY()) {
            dy = -1;
        }

        move(dx, dy);
    }
}
