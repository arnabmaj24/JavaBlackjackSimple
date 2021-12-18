package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {
    List<Card> cards;
    String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
    public Deck() {
        this.cards = new ArrayList<Card>();
        build();
            }

    public void build() {
        for (String s : suits) {
            for (int v=13; v>0; v--) {
                this.cards.add(new Card(v, s));
            } 
        }
    }
    
    public void showstuff() {
        for (Card X : this.cards) {
            X.show();
        }
    }

    public void shuffledeck() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        Card drawn = this.cards.remove(0);
        return drawn;

    }
}
