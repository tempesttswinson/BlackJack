public class BlackJack {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("Welcome to Blackjack!");

        // create our playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();

        // System.out.println(playingDeck);

        Deck playerHand = new Deck();
        playerHand.draw(playingDeck);
        playerHand.draw(playingDeck);

        System.out.println(playerHand.cardsValue());
        System.out.println("You drew: " + playerHand.getCard(playerHand.deckSize() - 1).toString());
    }
}