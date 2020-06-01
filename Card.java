
public class Card {

    private Suit suit;
    private Value value;

    // constructor
    public Card(Suit suit, Value value) {
        this.value = value;
        this.suit = suit;
    }

    // Methods
    public void getValue() {
        return this.value;

    }

    public String toString() {
        return this.suit.toString() + " - " + this.value.toString();
    }

}