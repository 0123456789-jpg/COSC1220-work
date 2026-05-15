/**
 * @since 2026-05-01
 */
public class Cards {
    public final String face;
    public final String suit;

    public Cards(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String toString() {
        return this.face + " of " + this.suit;
    }

}