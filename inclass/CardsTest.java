/**
 * @since 2026-05-01
 */
public class CardsTest {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        int players = Integer.parseInt(args[0]);
        int cardNum = DeckOfCards.NUMBER_OF_CARDS / players;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardNum; j++) {
                System.out.print(deck.dealCards() + " ");
            }
            System.out.println();
        }
    }
}