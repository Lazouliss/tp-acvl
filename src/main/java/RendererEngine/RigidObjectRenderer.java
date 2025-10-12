package RendererEngine;

import GraphicEngine.GraphicEngine;
import model.Character;
import model.Obstacle;

public class RigidObjectRenderer extends Renderer {
    public RigidObjectRenderer(GraphicEngine p) {
        super(p);
    }

    public void renderCharacter(Character character) {
        CharacterRenderer characterRenderer = new CharacterRenderer(getGraphicEngine());
        character.renderCharacter(characterRenderer);
    }

    public void renderObstacle(Obstacle obstacle) {
        ObstacleRenderer obstacleRenderer = new ObstacleRenderer(getGraphicEngine());
        obstacleRenderer.renderObstacle(obstacle);
    }
}
