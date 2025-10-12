package model;

import RendererEngine.CharacterRenderer;

public class NeutralCharacter extends Character implements Interactable {
    public NeutralCharacter(GameContext gameContext, int x, int y, int width, int height, int speed) {
        super(gameContext, x, y, width, height, speed);
    }

    @Override
    public void renderCharacter(CharacterRenderer characterRenderer) {
        characterRenderer.renderNeutralCharacter(this);
    }

    @Override
    public void interact(Player p) {
        // TODO : Manage interaction
    }
}
