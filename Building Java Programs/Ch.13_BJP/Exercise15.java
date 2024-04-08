// Exercise 15:
// Write a Comparator that compares Point objects by their distance from the origin of (0,0). Points that are
// closer to the origin are considered to come before those which are further from the origin.

import java.util.*;
import java.awt.*;

public class Exercise15 implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
        double d1 = Math.sqrt(((p1.x - 0) * (p1.x - 0)) + ((p1.y - 0) * (p1.y-0)));
        double d2 = Math.sqrt(((p2.x - 0) * (p2.x - 0)) + ((p2.y - 0) * (p2.y-0)));
        
        if (d1 == d2) {
            return 0;
        } else if (d1 < d2) {
            return -1;
        } else {
            return 1;
        }
    }
}
