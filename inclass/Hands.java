/**
 * @since 2026-05-01
 */
public class Hands {
    private static int faceValue(String face) {
        String[] faces = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (int i = 0; i < 13; i++) {
            if (face.equals(faces[i])) return i + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        Cards[] hand = new Cards[5];
        int maxValue = 0;
        Cards highCard = new Cards("null", "null");
        for (int i = 0; i < 5; i++) {
            Cards card = deck.dealCards();
            System.out.print(card + " ");
            hand[i] = card;
            int value = faceValue(card.face);
            if (value > maxValue) {
                maxValue = value;
                highCard = card;
            }
        }
        System.out.println();
        System.out.println("High card is " + highCard);
    }
}