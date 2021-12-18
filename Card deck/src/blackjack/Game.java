package blackjack;

import java.util.*;

public class Game {

    private int pval;
    private int dval;
    private Person player;
    private Dealer dealer;
    private Deck deck;

    public Game(int pval, int dval, Person player, Dealer dealer, Deck deck) {
        this.pval = pval;
        this.dval = dval;
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
        boot();
    }

    public void boot() {
        System.out.println("");
        this.player.draw(this.deck);
        this.player.draw(this.deck);
        this.pval = this.player.handval();
        this.dealer.draw(this.deck);
        this.dealer.draw(this.deck);
        this.dval = this.dealer.handval();
        System.out.println("");
        System.out.println("Your Cards: ");
        this.player.showhand();
        System.out.println("");
        System.out.println("Dealer's Cards: ");
        this.dealer.showHhand();
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hit (1) or Stand (2)?");
        int play = scan.nextInt();
        scan.close();
        if (play == 1) {
            this.player.draw(this.deck);
            this.pval = this.player.handval();
            this.dealer.draw(this.deck);
            this.dval = this.dealer.handval();
            logic();
        }
        else if (play == 2) {
            if (this.dval < 17) {
                this.dealer.draw(this.deck);
                this.dval = this.dealer.handval();
            }
            if (this.pval > this.dval) {
                finalcards();
                System.out.println("--YOU WIN--");
     
            }
            else if (this.pval == this.dval) {
                finalcards();
                System.out.println("--TIE--");
            }
            else {
                finalcards();
                System.out.println("--YOU LOSE--");
    
            }
        }
        else {
            System.out.println("-= think u messed up bud =-");
            logic();
        }

    }

    public void logic() {
        if (this.pval == 21) {
            finalcards();
            System.out.println("--BLACK JACK, YOU WIN--");

        }
        else if (this.pval > 21) {
            finalcards();
            System.out.println("--BUSTED--");

        }
        else if (this.dval > 21) {
            finalcards();
            System.out.println("--DEALER BUST--");

        }
        else if (this.pval < 21) {
            play();
        }
    }

    public void finalcards() {
        System.out.println(" ");
        System.out.println("Your hand:");
        this.player.showhand();
        System.out.println(" ");
        System.out.println("Dealer Hand:");
        this.dealer.showhand();
        System.out.println(" ");
        System.out.println("final points:");
        System.out.println("Your total is " + this.pval + " and Dealer total is " + this.dval);
    }
}
