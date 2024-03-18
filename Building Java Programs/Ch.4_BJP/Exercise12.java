// Write a method called printTriangleType, this method accpets integer arguments
// representing the lengths of the sides of a triangle and prints the type of
// triangle
public class Exercise12 {
    public static void printTriangleType(int a, int b, int c) {
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            throw new IllegalArgumentException("Invalid values, two sides sum less than one side length.");
        }
        if ((a == b) && (b == c)) {
            System.out.println("equilateral");
        } else if ((a == b) || (b == c) || (a == c)) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }

    public static void main(String[] args) {
        printTriangleType(5, 7, 7);
        printTriangleType(6, 6, 6);
        printTriangleType(5, 7, 8);
        printTriangleType(2, 18, 2);
    }
}
