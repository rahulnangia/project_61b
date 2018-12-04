package byog.Core;

/**
 * Created by rahul
 */
public class Main {

    public static void main(String[] args) {
        if (args.length > 1){
            System.out.println("Can only have one argument - replay the string");
            System.exit(0);
        }else if (args.length == 1){
            Game game = new Game();
            TETile[][] worldState = game.playWithInputString(args[0]);
            System.out.println(TETile.toString(worldState));
        }else {
            Game game = new Game();
            game.playWithKeyboard();
        }
    }
}
