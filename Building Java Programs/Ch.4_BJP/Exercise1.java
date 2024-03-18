// Write a method called fractionSum that accepts an integer parameter n and returns
// as a double the sum of the first n terms
public class Exercise1 {
    public static double fractionSum(int n) {
        double result = 1;
        if (n < 0) {
            throw new IllegalArgumentException("n is a negative number: " + n);
        }
        for (int i = 2; i <= n; i++) {
            result += 1.0/i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fractionSum(2));
        System.out.println(fractionSum(5));
        System.out.println(fractionSum(10));
    }
}