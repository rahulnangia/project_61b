package byog.game.player;

import byog.game.tiles.Tile;

/**
 * A Bridge for the Bridge pattern to separate the
 * implementation from abstraction
 *
 * Created by rahul
 *
 */
public abstract class GamePlayer {

    protected String args[];

    public void setState(String args[]){
        this.args = args;
    }

    public void play(Tile tile){
        while(checkInput()) {
            //Chain of Responsibility pattern gets implemented here
            tile = tile.handle();
        }
    }

    protected abstract boolean checkInput();
}
