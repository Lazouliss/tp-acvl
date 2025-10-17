package model;

import RendererEngine.GameObjectRenderer;
import RendererEngine.Renderer;
import RendererEngine.RigidObjectRenderer;

public abstract class RigidObject extends CollidableObject {
    public RigidObject(GameContext gameContext, int x, int y, int width, int height) {
        super(gameContext, x, y, width, height);
    }

    @Override
    public void renderGameObject(GameObjectRenderer gameObjectRenderer) {
        gameObjectRenderer.renderRigidObject(this);
    }

    public abstract void renderRigidObject(RigidObjectRenderer rigidObjectRenderer);
}
