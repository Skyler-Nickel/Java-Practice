// Write a method called quadrant that accepts as parameters a pair of double values
// representing an (x, y) point and returns the quadrant number for that point
public class Exercise19 {
    public static int quadrant(double x, double y) {
        if ((x > 0) && (y > 0)) {
            return 1;
        } else if ((x < 0) && (y > 0)) {
            return 2;
        } else if ((x < 0) && (y < 0)) {
            return 3;
        } else {
            return 4;
        }
    }

    // Does not account for zero values will return 4 if 0 is included in x or y
    public static void main(String[] args) {
        System.out.println(quadrant(-2.3, 3.5));
        System.out.println(quadrant(4.5, -4.5));
        System.out.println(quadrant(1.2, 2.3));
        System.out.println(quadrant(-5.2, -6.2));
    }
}
