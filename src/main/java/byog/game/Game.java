package byog.game;

import byog.game.map.WorldMapGenerator;
import byog.game.player.GamePlayer;
import byog.game.player.GamePlayerFactory;

/**
 * Created by rahul
 */
public class Game {

    public static void main(String[] args) {
        GamePlayer player = GamePlayerFactory.getGamePlayer(args);
        long seed = System.currentTimeMillis();
        player.play(WorldMapGenerator.generateMap(seed));
    }
}
