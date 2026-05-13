/**
 * @version 0.1.1
 * @since 2026-05-13
 */
public abstract class Shape {
    public double area;
    public double perimeter;

    public Shape(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape() {
        this.area = 0.0;
        this.perimeter = 0.0;
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public abstract double areaCalc(); // no implementation needed

    public abstract double perimeterCalc();
}