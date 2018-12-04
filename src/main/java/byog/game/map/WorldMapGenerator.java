package byog.game.map;

import byog.game.tiles.Tile;
import byog.game.tiles.impl.DoorTile;

/**
 * World Map Factory
 *
 * Created by rahul
 */
public class WorldMapGenerator {

    public static Tile generateMap(long seed){
        return new DoorTile();
    }

}
