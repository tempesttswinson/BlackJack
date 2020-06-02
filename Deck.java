import java.util.ArrayList;
import java.util.Random;

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
        // ArrayList<Card> tmpDeck = new ArrayList<Card>();
        // use random
        Random random = new Random();

        // temporary Card
        Card temp;

        int j;
        for (int i = 0; i < this.cards.size(); i++) {
            // generate random card j to swap i's value with
            j = random.nextInt(this.cards.size());

            // do swap
            temp = this.cards.get(i);
            this.cards.set(i, this.cards.get(j));
            this.cards.set(j, temp);
        }
    }

    public void removeCard(int i) {
        this.cards.remove(i);
    }

    public Card getCard(int i) {
        return this.cards.get(i);
    }

    public void addCard(Card addCard) {
        this.cards.add(addCard);
    }

    public void draw() {

    }

    public String toString() {
        String cardListOutput = "";
        int i = 0;
        for (Card aCard : this.cards) {
            cardListOutput += "\n" + i + " " + aCard.toString();
            i++;
        }
        return cardListOutput;
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