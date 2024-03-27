// Implemented and tested in RectangleExample folder

// Write a class called Rectangle that represents a rectangular two-dimensional region.
// Your Rectangle objects should have the following methods:

// Constructs a new Rectangle whose top-left corner is specified by the given coordinates
// and with the given width and height.
// public Rectangle(int x, int y, int width, int height)

// Returns this Rectangle's height
// public int getHeight()

// Returns this Rectangle's width
// public int getWidth()

// Returns this Rectangle's x-coordinate
// public int getX()

// Returns this Rectangle's y-coordinate
// public int getY()

// Returns a String representation of this Rectangle
// public String toString()

public class Exercise18 {
    private int x;
    private int y;
    private int width;
    private int height;

    // Constructs a new Rectangle
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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
}
