// Write a method called sphereVolume that accepts a radius as a parameter 
// and returns the volume of a sphere with that radius.
public class Exercise15 {
    public static double sphereVolume(double radius) {
        return (4.0/3.0) * Math.PI * (radius * radius * radius);
    }

    public static void main(String[] args) {
        System.out.println(sphereVolume(2.0));
    }
}
