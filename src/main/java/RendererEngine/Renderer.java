package RendererEngine;

import GraphicEngine.GraphicEngine;

public abstract class Renderer {

    GraphicEngine graphicEngine;

    public Renderer(GraphicEngine g) {
        this.graphicEngine = g;
    }

    public GraphicEngine getGraphicEngine() {
        return graphicEngine;
    }

}
