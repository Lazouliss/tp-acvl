package RendererEngine;

import GraphicEngine.GraphicEngine;
import GraphicEngine.Color;

import model.GameObject;
import model.Room;

public class RoomRenderer extends Renderer {
    public RoomRenderer(GraphicEngine g) {
        super(g);
    }

    public void renderRoom(Room room) {
        // Render room decoration
        GraphicEngine g = getGraphicEngine();
        g.drawRectangle(g.width() / 2, g.height() / 2, g.width() - 20, g.height() - 10, Color.WHITE);

        // Render content of room
        GameObjectRenderer gameObjectRenderer = new GameObjectRenderer(getGraphicEngine());
        for(GameObject gameObject : room.getGameObjects()) {
            gameObject.renderGameObject(gameObjectRenderer);
        }
    }
}
