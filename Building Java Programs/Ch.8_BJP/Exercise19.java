// Implemented/Tested in RectangleExample folder
// Add the following constructor to your Rectangle class:

// public Rectangle(Point p, int width, int height)

public class Exercise19 {
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Constructs a new Rectangle using Point
    public Rectangle(Point p, int width, int height) {
        this(p.x, p.y, width, height);
    }
}
