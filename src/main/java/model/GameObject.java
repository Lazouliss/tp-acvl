package model;

import RendererEngine.GameObjectRenderer;
import RendererEngine.Rendable;
import RendererEngine.Renderer;

public abstract class GameObject {

    protected GameContext gameContext;

    public GameObject(GameContext gameContext) {
        this.gameContext = gameContext;
    }

    public abstract void execute();

    public abstract void renderGameObject(GameObjectRenderer gameObjectRenderer);
}
