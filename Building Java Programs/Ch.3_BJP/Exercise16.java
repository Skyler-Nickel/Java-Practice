// Write a method called triangleArea that accepts the three side lengths of a triangle
// as parameters and returns the area of a triangle
public class Exercise16 {
    public static double triangleArea(double a, double b, double c) {
        double s = (a + b +c) / 2;
        double area = Math.sqrt(s * (s - a) *  (s - b) * (s - c));
        return area;
    }

    public static void main(String[] args) {
        System.out.println(triangleArea(8, 5.2, 7.1));
    }
}
