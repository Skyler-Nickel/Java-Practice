// Client to test Line.java

import java.awt.*;

public class LineMain {
    public static void main(String[] args) {
        Point p1 = new Point(22, 3);
        Point p2 = new Point(4, 7);
        //Constructs a new line using points
        Line line = new Line(p1, p2);
        
        // Constructs a new line using ints as parameters
        Line line1 = new Line(22, 3, 4, 7);

        // Test getP1 and getP2
        System.out.println(line.getP1());
        System.out.println(line.getP2());
        System.out.println(line1.getP1());
        System.out.println(line1.getP2());
        System.out.println();

        // Test toString
        String s1 = line.toString();
        System.out.println(s1);
        s1 = line1.toString();
        System.out.println(s1);
        System.out.println();

        // Test getSlope()
        System.out.println(line.getSlope());
        System.out.println(line1.getSlope());
        System.out.println();

        // Test isCollinear(Point p)
        


    }    
}
