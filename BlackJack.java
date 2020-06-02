public class BlackJack {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("Welcome to Blackjack!");

        // create our playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();

        System.out.println(playingDeck);

    }
}