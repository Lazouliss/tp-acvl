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
        for(GameObject gameObject : gameObjects) {
            gameObject.execute();
        }
    }

    public void generate() {
        // Place some obstacle
        for(int i = 0; i < 3; i++) {
            int x = (int) Math.round(Math.random() * gameContext.getWindowWidth());
            int y = (int) Math.round(Math.random() * gameContext.getWindowHeight());
            Obstacle obstacle = new Obstacle(gameContext, x, y, 30, 30);
            gameObjects.add(obstacle);
        }

        // Spawn an ennemy
        Ennemy ennemy = new Ennemy(gameContext, 100, 100);
        gameObjects.add(ennemy);
    }

    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }

    @Override
    public void renderGameObject(GameObjectRenderer gameObjectRenderer) {
        gameObjectRenderer.renderRoom(this);
    }
}
