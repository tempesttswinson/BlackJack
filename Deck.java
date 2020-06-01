import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    // constructor
    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void createFullDeck() {
        // generating cards
        for (Suit cardSuit : Suit.values()) {
            for (Value cardValue : Value.values()) {
                // adding a new card to the mix
                this.cards.add(new Card(cardSuit, cardValue));
            }
        }
    }

    // Methods
    public void shuffle() {

    }

    public void removeCard() {

    }

    public Card getCard() {

    }

    public void draw() {

    }

    public String toString() {
        return " ";
    }

    public void moveAllToDeck() {

    }

    public int deckSize() {
        return 0;
    }

    public int cardsValue() {
        return 0;
    }

}