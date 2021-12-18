package blackjack;

import java.util.*;

public class Person {
    List<Card> hand;
    public Person() {
        this.hand = new ArrayList<Card>();
    }

    public Object draw(Deck deck) {
        this.hand.add(deck.draw());
        return null;
    }

    public void showhand() {
        for (Card c : this.hand) {
            c.show();
        }
    }

    public int handval() {
        int val = 0;
        for (Card c : this.hand) {
            val += c.getval();
        }
        return val;
    }
}
