// Test the Rectangle class implementation

import java.awt.*;

public class RectangleMain {
    public static void main(String[] args) {
        // Constructs new Rectangle object
        Rectangle rect = new Rectangle(1, 2, 3, 4);
        // Test getHeight()
        System.out.println(rect.getHeight());
        // Test getWidth()
        System.out.println(rect.getWidth());
        // Test getX()
        System.out.println(rect.getX());
        // Test getY()
        System.out.println(rect.getY());
        // Test toString()
        String s = rect.toString();
        System.out.println(s);
        System.out.println();

        // Constructs new Rectangle using Point
        Point p1 = new Point(1, 2);
        Rectangle rect2 = new Rectangle(p1, 3, 4);
        String s2 = rect.toString();
        System.out.println(s2);
        System.out.println();

        // Test contains(int x, int y)
        System.out.println(rect.contains(4, 8));
        System.out.println(rect2.contains(3, 4));
        
        // Test contains(Point p)
        Point p2 = new Point(3,4);
        Point p3 = new Point(4, 8);
        System.out.println(rect.contains(p2));
        System.out.println(rect2.contains(p3));

        // Test will be for union()
        // something goes here
    }    
}
