package byog.game.tiles;

import byog.game.enums.TileType;

/**
 *
 * Tile Bridge
 *
 * Created by rahul
 */
public abstract class Tile {

    protected TileType type;
    private Tile prev;
    private Tile next;
//    private Tile left;
//    private Tile right;
//    private Tile top;
//    private Tile bottom;

    public Tile(TileType me) {
        this.type = me;
    }

    public Tile getPrev() {
        return prev;
    }

    public void setPrev(Tile prev) {
        this.prev = prev;
    }

    public Tile getNext() {
        return next;
    }

    public void setNext(Tile next) {
        this.next = next;
    }

    public Tile handle() {

        //Observer/Listener Pattern
        return type.getTileHandler().onEntry(this);
    }
}
