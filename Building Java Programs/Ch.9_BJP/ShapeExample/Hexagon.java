// Exercise 16:
// Write a class Hexagon whose object represent regular hexagons (6-sided polygons).
// Your class should implement Shape interface.

// regular hexagons have equal side lengths

public class Hexagon implements Shape {
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return ((3.0 * Math.sqrt(3.0)) / 2.0) * (side * side);
    }

    public double getPerimeter() {
        return 6.0 * side;
    }
}
