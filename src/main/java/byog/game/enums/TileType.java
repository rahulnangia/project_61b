package byog.game.enums;

import byog.game.handlers.TileHandler;
import byog.game.handlers.impl.DoorTileHandler;
import byog.game.handlers.impl.WallTileHandler;

/**
 *
 * WallTileHandlers & DoorTileHandlers are singletons
 *
 * Created by rahul
 */
public enum TileType {
    WALL(new WallTileHandler()), DOOR(new DoorTileHandler());

    private TileHandler tileHandler;

    TileType(TileHandler tileHandler) {
        this.tileHandler = tileHandler;
    }

    public TileHandler getTileHandler() {
        return tileHandler;
    }
}
