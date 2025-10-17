package model;

import processing.core.PApplet;

public abstract class PositionableObject extends GameObject {

    private int x, y;
    private int width, height;

    public PositionableObject(GameContext gameContext, int x, int y, int width, int height) {
        super(gameContext);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setPosition(int x, int y) {
        setX(x);
        setY(y);
    }
}
