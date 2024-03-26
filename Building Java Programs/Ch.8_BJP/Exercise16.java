// implemented and tested in LineExample folder
// Add the following constructor to your Line class:

// Constructs a new Line that contains the given two Points.
// public Line(int x1, int y1, int x2, int y2)

public class Exercise16 {
        // Constructs a line accepting 4 int values for p1 and p2
        public Line(int x1, int y1, int x2, int y2) {
            this.p1 = new Point(x1, y1);
            this.p2 = new Point(x2, y2);
        }
}
