package RendererEngine;

import GraphicEngine.GraphicEngine;
import GraphicEngine.Color;
import model.Ennemy;

public class EnnemyRenderer extends Renderer {
    public EnnemyRenderer(GraphicEngine g) {
        super(g);
    }

    public void renderEnnemy(Ennemy ennemy) {
        GraphicEngine g = getGraphicEngine();
        g.drawFillRectangle(ennemy.getX(), ennemy.getY(), ennemy.getWidth(), ennemy.getHeight(), Color.RED, Color.RED);
    }
}
