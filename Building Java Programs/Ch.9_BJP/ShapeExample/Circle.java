// Circle class that implements Shape interface

// Exercise 14:
// Add an equals method to each of the Rectangle, Circle, and Triangle classes introduced
// in this chapter. Two shapes are considered equal if their fields have equivalent values.

// Represents circular shapes.
public class Circle implements Shape {
    private double radius;

    // constructs a new circle with the given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // returns the area of this circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // returns the perimeter of this circle
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }

    // equals method
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            return radius == c.radius;
        }
        return false;
    }
}
