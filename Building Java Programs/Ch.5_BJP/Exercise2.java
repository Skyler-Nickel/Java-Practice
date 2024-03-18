// Write a method called gcd that accepts two integers as parameters and returns the 
// greatest common divisor of the two numbers
public class Exercise2 {
    public static int gcd(int a, int b) {
        while(b > 0) {
            int help = a;
            a = b;
            b = help % b;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(10, 20));
        System.out.println(gcd(45, 90));
        System.out.println(gcd(252, 105));
        System.out.println(gcd(128, 47));
    }
}
