package RendererEngine;

import GraphicEngine.GraphicEngine;
import GraphicEngine.Color;
import model.World;

public class WorldRenderer extends Renderer {
    public WorldRenderer(GraphicEngine g) {
        super(g);
    }

    public void renderWorld(World world) {
        GraphicEngine g = getGraphicEngine();
        g.drawFillRectangle(g.width() / 2, g.height() / 2, g.width(), g.height(), Color.BLACK, Color.BLACK);

        // Render content of room
        RoomRenderer roomRenderer = new RoomRenderer(getGraphicEngine());
        roomRenderer.renderRoom(world.getCurrentRoom());
    }
}
