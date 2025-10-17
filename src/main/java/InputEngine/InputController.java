package InputEngine;

import model.Player;
import processing.core.PConstants;

public class InputController {
    private Player player;

    boolean rightPressed;
    boolean leftPressed;
    boolean upPressed;
    boolean downPressed;

    public InputController(Player player) {
        this.player = player;
    }

    public void handleInput(int keyCode, boolean pressed) {
        switch (keyCode) {
            case PConstants.UP:
                upPressed = pressed;
                break;
            case PConstants.DOWN:
                downPressed = pressed;
                break;
            case PConstants.RIGHT:
                rightPressed = pressed;
                break;
            case PConstants.LEFT:
                leftPressed = pressed;
                break;
        }
    }

    public void execute() {
        if(upPressed) {
            player.move(0, -1);
        }
        if(downPressed) {
            player.move(0, 1);
        }
        if(leftPressed) {
            player.move(-1, 0);
        }
        if(rightPressed) {
            player.move(1, 0);
        }
    }
}
