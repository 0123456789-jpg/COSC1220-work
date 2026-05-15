import java.security.SecureRandom;

/**
 * @since 2026-05-01
 */
public class DeckOfCards {
    public static final int NUMBER_OF_CARDS = 52;
    private final SecureRandom randomNum = new SecureRandom();
    private Cards[] deck;
    private int currentCard;

    public DeckOfCards() {
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Club", "Spade", "Diamond", "Heart"};
        Cards[] deck = new Cards[NUMBER_OF_CARDS];
        for (int face = 0; face < faces.length; face++) {
            for (int suit = 0; suit < suits.length; suit++) {
                deck[face * suits.length + suit] = new Cards(faces[face], suits[suit]);
            }
        }
        this.deck = deck;
        this.currentCard = 0;
    }

    public Cards dealCards() {
        int current = this.currentCard;
        this.currentCard += 1;
        return this.deck[current];
    }

    public void shuffle() {
        boolean[] selected = new boolean[NUMBER_OF_CARDS];
        int current = 0;
        Cards[] shuffle = new Cards[NUMBER_OF_CARDS];
        while (current < NUMBER_OF_CARDS) {
            int selection = this.randomNum.nextInt(NUMBER_OF_CARDS);
            if (!selected[selection]) {
                shuffle[current++] = this.deck[selection];
                selected[selection] = true;
            }
        }
        this.deck = shuffle;
    }


}