package ex9;

public class Circle extends Ellipse {
    public Circle(double radius) {
        super(radius, radius);
    }

    public double getRadius() {
        return getMajorAxis();
    }
}
