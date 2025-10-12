package model;

import RendererEngine.GameObjectRenderer;
import RendererEngine.Renderer;

import java.util.ArrayList;

public class Room extends GameObject {

    ArrayList<GameObject> gameObjects;

    public Room(GameContext gameContext) {
        super(gameContext);
        gameObjects = new ArrayList<>();
    }

    @Override
    public void execute() {
        // Do nothing
    }

    public void generate() {
        // Place some obstacle
        for(int i = 0; i < 3; i++) {
            int x = (int) Math.round(Math.random() * gameContext.getWindowWidth());
            int y = (int) Math.round(Math.random() * gameContext.getWindowHeight());
            Obstacle obstacle = new Obstacle(gameContext, x, y, 30, 30);
            gameObjects.add(obstacle);
        }
    }

    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }

    @Override
    public void renderGameObject(GameObjectRenderer gameObjectRenderer) {
        gameObjectRenderer.renderRoom(this);
    }
}
