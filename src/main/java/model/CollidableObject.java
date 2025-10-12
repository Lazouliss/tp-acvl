package model;

import java.util.ArrayList;
import java.util.List;

public abstract class CollidableObject extends PositionableObject {
    private static ArrayList<CollidableObject> collidableObjects;

    static {
        collidableObjects = new ArrayList<>();
    }

    public CollidableObject(GameContext gameContext, int x, int y, int width, int height) {
        super(gameContext, x, y, width, height);
        CollidableObject.addCollidable(this);
    }

    public List<CollidableObject> checkForCollisions(int x, int y) {
        ArrayList<CollidableObject> colliders = new ArrayList<>();
        for(CollidableObject c : collidableObjects) {
            if(c != this) {
                if (Math.abs(x - c.getX()) < (c.getWidth() + getWidth()) / 2
                        && Math.abs(y - c.getY()) < (c.getHeight() + getHeight()) / 2) {
                    colliders.add(c);
                }
            }
        }
        return colliders;
    }

    public boolean isRigid() {
        return this instanceof RigidObject;
    }

    public boolean isCollectable() {
        return this instanceof FloorCollectableObject;
    }

    public boolean isInteractable() {
        return this instanceof Interactable;
    }

    public static void addCollidable(CollidableObject collidableObject) {
        collidableObjects.add(collidableObject);
    }

    public static void removeCollidable(CollidableObject collidableObject) {
        collidableObjects.remove(collidableObject);
    }
}
