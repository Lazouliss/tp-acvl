package RendererEngine;

import GraphicEngine.GraphicEngine;
import GraphicEngine.Color;
import model.Player;

public class PlayerRenderer extends Renderer {

    public PlayerRenderer(GraphicEngine g) {
        super(g);
    }

    public void renderPlayer(Player player) {
        GraphicEngine g = getGraphicEngine();
        g.drawFillRectangle(player.getX(), player.getY(), player.getWidth(), player.getHeight(), Color.GREEN, Color.GREEN);
    }
}
