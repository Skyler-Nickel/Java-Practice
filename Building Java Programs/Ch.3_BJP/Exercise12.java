// Write a method called scentific that accepts a real number base and an exponent
// as parameters and computes the base times 10 to the exponent
public class Exercise12 {
    public static void scientific(double base, double exponent) {
        System.out.println(base * Math.pow(10, exponent));
    }

    public static void main(String[] args) {
        scientific(6.23, 5);
        scientific(1.9, -2);
    }
}
