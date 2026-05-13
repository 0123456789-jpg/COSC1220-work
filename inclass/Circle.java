/**
 * @version 0.1.1
 * @since 2026-05-13
 */
public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
        this.area = areaCalc();
        this.perimeter = perimeterCalc();
    }

    @Override
    public double areaCalc() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeterCalc() {
        return 2 * Math.PI * this.radius;
    }
}