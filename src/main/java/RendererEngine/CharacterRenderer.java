package RendererEngine;

import GraphicEngine.GraphicEngine;
import model.Ennemy;
import model.NeutralCharacter;
import model.Player;

public class CharacterRenderer extends Renderer {
    public CharacterRenderer(GraphicEngine g) {
        super(g);
    }

    public void renderPlayer(Player player) {
        PlayerRenderer playerRenderer = new PlayerRenderer(getGraphicEngine());
        playerRenderer.renderPlayer(player);
    }

    public void renderEnnemy(Ennemy ennemy) {

    }

    public void renderNeutralCharacter(NeutralCharacter neutralCharacter) {

    }
}
