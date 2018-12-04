package byog.game.player.impl;

import byog.game.player.GamePlayer;

/**
 * Created by rahul
 */
public class StringGamePlayer extends GamePlayer {

    @Override
    protected boolean checkInput() {
        return args[0].equalsIgnoreCase("input_key_stroke");
    }

}
