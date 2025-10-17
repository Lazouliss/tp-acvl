package model;

import RendererEngine.GameObjectRenderer;
import RendererEngine.Renderer;

import java.util.ArrayList;

public class World extends GameObject {

    private ArrayList<Room> rooms;
    private Room currentRoom;

    public World(GameContext gameContext) {
        super(gameContext);
        rooms = new ArrayList<>();
        currentRoom = new Room(gameContext);

        rooms.add(currentRoom);
    }

    @Override
    public void execute() {
        currentRoom.execute();
    }

    public void generate() {
        currentRoom.generate();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    @Override
    public void renderGameObject(GameObjectRenderer gameObjectRenderer) {
        gameObjectRenderer.renderWorld(this);
    }
}
