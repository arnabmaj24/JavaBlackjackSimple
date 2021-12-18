package blackjack;

public class Dealer extends Person {
    public Dealer() {
    }

    public void showHhand() {
        for (Card c : this.hand) {
            if (c == this.hand.get(0)) {
                System.out.println("-hidden-");
            }
            else {
                c.show();    
            }
        }
    }
}
