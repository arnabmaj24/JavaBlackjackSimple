package blackjack;

public class Card {

    public int value;
    public String suit;

    public Card(int value, String suit) {
    this.value = value;
    this.suit = suit;
    }
    

    public void show() {
        if (this.value>1 && this.value<11) {
            System.out.println(this.value+" of "+suit);
        } 
        else if (this.value == 1) {
            System.out.println("Ace of "+suit);
        }
        else if (this.value == 11) {
            System.out.println("Jack of "+suit);
        }
        else if (this.value == 12) {
            System.out.println("Queen of "+suit);
        }
        else if (this.value == 13) {
            System.out.println("King of "+suit);
        }
    }

    public int getval() {
        if (this.value>1 && this.value<11) {
            return this.value;
        } 
        else if (this.value == 1) {
            return this.value+10;
        }
        else if (this.value == 11) {
            return this.value-1;
        }
        else if (this.value == 12) {
            return this.value-2;
        }
        else if (this.value == 13) {
            return this.value-3;
        } else {
        return this.value;
        }
    }
    public String getsuit() {
        return this.suit;
    }
}
        

    
