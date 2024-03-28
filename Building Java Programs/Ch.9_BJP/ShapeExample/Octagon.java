// Exercise 15:

// Write a class named Octagon whose object represent regular Octagon(8-sided polygons)
// Your method should implement Shape interface, including methods for area and perimeter.

// regular octagons have equal side lengths

public class Octagon implements Shape {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return (2.0 * (1.0 + Math.sqrt(2.0))) * (side * side);
    }

    public double getPerimeter() {
        return 8.0 * side;
    }
}
