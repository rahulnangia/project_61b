package byog.game.player;

import byog.game.player.impl.KeyboardGamePlayer;
import byog.game.player.impl.StringGamePlayer;

/**
 * Implementaion for Factory class for Factory Pattern
 *
 * Created by rahul
 */
public class GamePlayerFactory {

    public static GamePlayer getGamePlayer(String args[]) {
        GamePlayer player;
        if (args.length == 1) {
            player = new StringGamePlayer();
            player.setState(args);
        } else {
            player = new KeyboardGamePlayer();
        }
        return player;
    }
}
