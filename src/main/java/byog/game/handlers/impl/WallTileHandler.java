package byog.game.handlers.impl;

import byog.game.handlers.TileHandler;
import byog.game.tiles.Tile;

/**
 * A wall tile handler pushes you back to the previous tile
 * Created by rahul
 */
public class WallTileHandler implements TileHandler {

    public Tile onEntry(Tile tile) {
        return tile.getPrev();
    }
}
