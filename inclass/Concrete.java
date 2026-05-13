/**
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 2026-05-13
 */
public class Concrete extends Shape {
    private final double a;

    public Concrete(double a) {
        super();
        this.a = a;
    }

    @Override
    public double areaCalc() {
        return this.a * this.a;
    }

    @Override
    public double perimeterCalc() {
        return this.a * 4;
    }
}
