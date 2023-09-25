// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Deck d1 = new Deck();
        d1.Shuffle();
        System.out.println(d1);
        Game game = new Game(d1);
        System.out.println(game);
    }
}