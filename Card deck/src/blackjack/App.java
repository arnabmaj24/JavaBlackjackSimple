package blackjack;


public class App {
    public static void main(String[] args) {
        Deck newdeck = new Deck();
        newdeck.shuffledeck();
        Person me = new Person();
        Dealer cunt = new Dealer();
        Game game = new Game(0, 0, me, cunt, newdeck);
        game.play();
    }
}
