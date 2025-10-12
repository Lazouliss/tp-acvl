package model;

import RendererEngine.GameObjectRenderer;
import RendererEngine.RigidObjectRenderer;

public class Obstacle extends RigidObject {

    public Obstacle(GameContext gameContext, int x, int y, int width, int height) {
        super(gameContext, x, y, width, height);
    }

    @Override
    public void renderRigidObject(RigidObjectRenderer rigidObjectRenderer) {
        rigidObjectRenderer.renderObstacle(this);
    }
}
