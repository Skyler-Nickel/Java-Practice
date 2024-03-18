// Modify your pow method from exercise 5 to make a new method called pow2 that uses
// the type double for the first parameter and that works correctly for negative
// numbers
public class Exercise14 {
    public static double pow2(double base, int exponent) {
        double num = base;
        if (exponent > 0) {
            for (int i = 1; i < exponent; i++) {
                num *= base;
            }
            return num;
        } else {
            for (int i = -1; i > exponent; i--) {
                num *= base;
            }
            return (double) (1 / num);
        }
        
        // easy way
        //return (int) Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        System.out.println(pow2(-4.0, -2));
        System.out.println(pow2(-4.0, 3));
    }
}
