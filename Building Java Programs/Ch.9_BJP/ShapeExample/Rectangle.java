// Rectangle class that implements Shape interface

// Exercise 14:
// Add an equals method to each of the Rectangle, Circle, and Triangle classes introduced
// in this chapter. Two shapes are considered equal if their fields have equivalent values.

// Represents rectangle shapes.
public class Rectangle implements Shape {
    private double width;
    private double height;

    // constructs a new rectangle with the given dimensions
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // returns the area of this rectangle
    public double getArea() {
        return width * height;
    }

    // returns the perimeter of this rectangle
    public double getPerimeter() {
        return 2.0 * (width + height);
    }

    // equals method
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle r = (Rectangle) o;
            return ((width == r.width) && (height == r.height)); 
        }
        return false;
    }
}
