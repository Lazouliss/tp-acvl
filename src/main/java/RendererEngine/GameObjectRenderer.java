package RendererEngine;

import GraphicEngine.GraphicEngine;
import model.FloorCollectableObject;
import model.RigidObject;
import model.Room;
import model.World;

public class GameObjectRenderer extends Renderer {

    public GameObjectRenderer(GraphicEngine g) {
        super(g);
    }

    public void renderWorld(World world) {
        WorldRenderer worldRenderer = new WorldRenderer(getGraphicEngine());
        worldRenderer.renderWorld(world);
    }

    public void renderRoom(Room room) {
        RoomRenderer roomRenderer = new RoomRenderer(getGraphicEngine());
        roomRenderer.renderRoom(room);
    }

    public void renderRigidObject(RigidObject rigidObject) {
        RigidObjectRenderer rigidObjectRenderer = new RigidObjectRenderer(getGraphicEngine());
        rigidObject.renderRigidObject(rigidObjectRenderer);
    }

    public void renderFloorCollectableObject(FloorCollectableObject floorCollectableObject) {

    }

}
