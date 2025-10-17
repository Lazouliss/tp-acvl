package model;

import RendererEngine.GameObjectRenderer;

public class FloorCollectableObject extends CollidableObject {

    private Collectable collectableItem;

    public FloorCollectableObject(GameContext gameContext, int x, int y, int width, int height, Collectable item) {
        super(gameContext, x, y, width, height);
        collectableItem = item;
    }

    @Override
    public void renderGameObject(GameObjectRenderer gameObjectRenderer) {
        gameObjectRenderer.renderFloorCollectableObject(this);
    }

    @Override
    public void execute() {

    }
}
