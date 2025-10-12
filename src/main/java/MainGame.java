import GraphicEngine.ProcessingGraphicEngine;
import InputEngine.InputController;
import RendererEngine.GameObjectRenderer;
import RendererEngine.Renderer;
import model.GameContext;
import model.Player;
import model.World;
import processing.core.PApplet;

public class MainGame extends PApplet implements GameContext {

    ProcessingGraphicEngine graphicEngine;
    GameObjectRenderer gameRenderer;
    InputController inputController;
    World world;

    Player player;

    @Override
    public void settings() {
        size(800, 800, P2D);
    }

    @Override
    public void setup() {
        frameRate(60);

        graphicEngine = new ProcessingGraphicEngine(this);
        gameRenderer = new GameObjectRenderer(graphicEngine);
        world = new World(this);
        player = new Player(this, 400, 400);
        inputController = new InputController(player);

        world.generate();
    }

    @Override
    public void draw() {
        world.renderGameObject(gameRenderer);
        player.renderGameObject(gameRenderer);

        inputController.execute();
        world.execute();
    }

    @Override
    public void keyPressed() {
        inputController.handleInput(keyCode, true);
    }
    @Override
    public void keyReleased() {
        inputController.handleInput(keyCode, false);
    }

    public static void main(String[] args) {
        MainGame mainGame = new MainGame();

        PApplet.main(MainGame.class);
    }

    @Override
    public int getWindowWidth() {
        return width;
    }

    @Override
    public int getWindowHeight() {
        return height;
    }

    @Override
    public Player getPlayer() {
        return player;
    }
}
