// Write a method called area that accepts as a parameter the radius of a circle
// and that returns the area of the circle
public class Exercise10 {
    public static double area(double radius) {
        return Math.PI * (radius * radius);
    }

    public static void main(String[] args) {
        System.out.println(area(2.0));
    }
}
