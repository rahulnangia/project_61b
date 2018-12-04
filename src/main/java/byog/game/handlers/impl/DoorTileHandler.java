package byog.game.handlers.impl;

import byog.game.handlers.TileHandler;
import byog.game.tiles.Tile;

/**
 * A door tile handler allows you to move to next tile
 * Created by rahul
 */
public class DoorTileHandler implements TileHandler{

    public Tile onEntry(Tile tile) {
        return tile.getNext();
    }
}
