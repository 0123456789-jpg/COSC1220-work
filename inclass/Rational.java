/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-04-20
 */
public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static void main(String[] args) {
        Rational x = new Rational(2, 3);
        Rational y = new Rational(-1, 4);
        System.out.println(x.plus(y).times(x).divides(y));
    }

    private Rational inverse() {
        return new Rational(this.denominator, this.numerator);
    }

    public Rational plus(Rational rhs) {
        return new Rational(this.numerator * rhs.denominator + rhs.numerator * this.denominator, this.denominator * rhs.denominator);
    }

    public Rational minus(Rational rhs) {
        return this.plus(new Rational(rhs.numerator * -1, rhs.denominator));
    }

    public Rational times(Rational rhs) {
        return new Rational(this.numerator * rhs.numerator, this.denominator * rhs.denominator);
    }

    public Rational divides(Rational rhs) {
        return this.times(rhs.inverse());
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator + "=" + ((double) this.numerator / this.denominator);
    }
}
