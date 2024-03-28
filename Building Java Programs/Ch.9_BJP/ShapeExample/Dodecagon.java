// Exercise 17:
// Write a class named Dodecagon whose objects represent regular dodecagons(12-sided polygons)
// Your class should implement the Shape interface.

// a regular dodecagon has equal side lengths

public class Dodecagon implements Shape {
    private double side;

    public Dodecagon(double side) {
        this.side = side;
    }

    public double getArea() {
        return ((3.0 *(2.0 + Math.sqrt(3.0))) * (side * side));
    }

    public double getPerimeter() {
        return 12.0 * side;
    }
}
