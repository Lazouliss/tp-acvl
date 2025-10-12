package RendererEngine;

import GraphicEngine.GraphicEngine;
import GraphicEngine.Color;
import model.Obstacle;

public class ObstacleRenderer extends Renderer {

    public ObstacleRenderer(GraphicEngine g) {
        super(g);
    }

    public void renderObstacle(Obstacle obstacle) {
        GraphicEngine g = getGraphicEngine();

        g.drawFillRectangle(obstacle.getX(), obstacle.getY(), obstacle.getWidth(), obstacle.getHeight(), Color.WHITE, Color.WHITE);
    }
}
