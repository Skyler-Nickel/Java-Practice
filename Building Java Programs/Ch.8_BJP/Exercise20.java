// Implemented and tested in RectangleExample
// Add the following constructor to your Rectangle class:

// public boolean contains(int x, int y)
// public boolean contains(Point p)

// Returns whether the given Point or coordinate lie inside the bounds of this Rectangle

public class Exercise20 {
    // Returns whether the given coordinates lie inside the bounds of this Rectangle
    public boolean contains(int x, int y) {
        return this.x <= x && x <= this.x + width && this.y <= y && y <= this.y + height; 
    }

    // Returns whether the given Point lie inside the bounds of this Rectangle
    public boolean contains(Point p) {
        return this.x <= p.x && p.x <= this.x + width && this.y <= p.y && p.y <= this.y + height;
    }
}
