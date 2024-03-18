// Write a method called cylinderSurfaceArea that accepts a radius and height
// as parameters and returns the surface area of a cylinder
public class Exercise14 {
    public static double cylinderSurfaceArea(double radius, double height) {
        double doublePi = 2 * Math.PI;
        return doublePi * (radius * radius) + doublePi * radius * height;
    }

    public static void main(String[] args) {
        System.out.println(cylinderSurfaceArea(3.0, 4.5));
    }
}
