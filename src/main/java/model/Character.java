package model;

import RendererEngine.CharacterRenderer;
import RendererEngine.RigidObjectRenderer;

import java.util.List;

public abstract class Character extends RigidObject implements Movable {


    private int speed;

    public Character(GameContext gameContext, int x, int y, int width, int height, int speed) {
        super(gameContext, x, y, width, height);
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void move(int x, int y) {
        // Normalize value
        if(x != 0) {
            x = x / Math.abs(x);
        }
        if(y != 0) {
            y = y / Math.abs(y);
        }

        int nextX = getX() + x * speed;
        int nextY = getY() + y * speed;

        List<CollidableObject> colliders = checkForCollisions(nextX, nextY);

        boolean canMove = true;

        for(CollidableObject c : colliders) {
            if(c.isRigid()) {
                canMove = false;
            }
        }

        if(canMove) {
            setPosition(nextX, nextY);
        }
    }

    @Override
    public void renderRigidObject(RigidObjectRenderer rigidObjectRenderer) {
        rigidObjectRenderer.renderCharacter(this);
    }

    public abstract void renderCharacter(CharacterRenderer characterRenderer);
}
