// Write a method called quadratic that solves quadratic 
// equations nad prints their roots
public class Exercise8 {
    public static void quadratic(int a, int b, int c) {
        double x;
        x = (-b + Math.sqrt((b * b) - (4 * (a * c)))) / (2 * a);
        System.out.println("x = " + (int) x);
        x = (-b - Math.sqrt((b * b) - (4 * (a * c)))) / (2 * a);
        System.out.println("x = " + (int) x);
    } 

    public static void main(String[] args) {
        quadratic(1, -7, 12);
        quadratic(1, 3, 2);
    }
}
