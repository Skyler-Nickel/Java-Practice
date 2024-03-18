// Write a method called pow that accepts a base and an exponent as
// parameters and returns the base raised to the given power
public class Exercise5 {
    public static int pow(int base, int exponent) {
        if (base < 0) {
            throw new IllegalArgumentException("You entered negative number, nonnegative expected");
        }
        // one way
        int num = base;
        for (int i = 1; i < exponent; i++) {
            num *= base;
        }
        //return num;
        
        // easy way
        return (int) Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        System.out.println(pow(3, 4));
    }
}
