// Implements rectangle class as specified in exercise 18 with additions made by
// exercises after 18, tested in ExerciseMain

import java.awt.*;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // Constructs a new Rectangle
    public Rectangle(int x, int y, int width, int height) {
        if (height < 0 || width < 0) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Constructs a new Rectangle using Point
    public Rectangle(Point p, int width, int height) {
        this(p.x, p.y, width, height);
    }

    // Returns this Rectangle's height
    public int getHeight() {
        return height;
    }

    // Returns this Rectangle's width
    public int getWidth() {
        return width;
    }

    // Returns this Rectangle's x-coordinate
    public int getX() {
        return x;
    }

    // Returns this Rectangle's y-coordinate
    public int getY() {
        return y;
    }

    // Returns a String representation of this Rectangle
    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y  + ",width=" + width + ", height=" + height + "]"; 
    }

    // Returns whether the given coordinates lie inside the bounds of this Rectangle
    public boolean contains(int x, int y) {
        return true;
    }

    // Returns whether the given Point lie inside the bounds of this Rectangle
    public boolean contains(Point p) {
        return true;
    }
}
