// A program that deals with points.
// Note that there is some redundancy in the test and could be simplified

public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);

        // prints each point and its distance from the origin
        System.out.println("p1 is " + p1);
        System.out.println("distance from origin = " + p1.distanceFromOrigin());
        System.out.println("p2 is " + p2);
        System.out.println("distance from origin = " + p2.distanceFromOrigin());

        // translate each point to a new location
        p1.translate(11, 6);
        p2.translate(1, 7);

        // print the points again
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
        System.out.println();


        Point p3 = new Point(1,1);
        Point p4 = new Point(-1, 2);
        Point p5 = new Point(-1, -1);
        Point p6 = new Point(1, -1);
        Point p7 = new Point();

        // Test the quadrant accessor method
        testQuadrant(p3);
        testQuadrant(p4);
        testQuadrant(p5);
        testQuadrant(p6);
        testQuadrant(p7);

        // Test the flip mutator method
        Point pt1 = new Point(5, -3);
        Point pt2 = new Point(4, 17);
        System.out.println("Before the flip : " + pt1);
        System.out.println("Before the flip: " + pt2);
        System.out.println();
        pt1.flip();
        pt2.flip();
        System.out.println("After the flip : " + pt1);
        System.out.println("After the flip: " + pt2);
        System.out.println();

        // Test the manhattanDistance mutator method
        Point p8 = new Point(12, 10);
        Point p9 = new Point(10, 8);
        System.out.println("The Manhattan distance is " + p8.manhattanDistance(p9));
        System.out.println();

        // Test the isVertical accessor method
        Point p10 = new Point(10, 18);
        Point p11 = new Point(10, 5);
        Point p12 = new Point();
        System.out.println(p10.isVertical(p11));
        System.out.println(p10.isVertical(p12));
        System.out.println();

        // Test the slope accessor method
        
        // Test IllegalArguementException
        //Point p13 = new Point();
        //Point p14 = new Point();
        //System.out.println("The slope is " + p13.slope(p14));
        Point p15 = new Point(5, 5);
        Point p16 = new Point(8, 9);
        System.out.println("The slope is " + p15.slope(p16));
        System.out.println();

        // Test isCollinear(Point p1, Point p2)
        Point p17 = new Point(5, 5);
        Point p18 = new Point(6, 6);
        Point p19 = new Point(7, 7);
        System.out.println(p17.isCollinear(p18, p19));
        System.out.println(p17.isCollinear(p19, p16));
    }

    // Test the quadrant accessor method
    public static void testQuadrant(Point p) {
        int quadrant = p.quadrant();
        System.out.println("The quadrant of " + p + ": " + quadrant);
        System.out.println();
    }
}
