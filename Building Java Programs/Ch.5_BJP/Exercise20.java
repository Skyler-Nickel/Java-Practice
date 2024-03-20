// Write a method called digitRange that accepts an integer as a parameter and returns the range of values of its digits.
// The range is defined as 1 more than the difference between the largest and smallest digit value.
public class Exercise20 {
    public static int digitRange(int num) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int num2 = num;
        while (num2 != 0) {
            if (largest < Math.abs(num2 % 10)) {
                largest = Math.abs(num2 % 10);
            }
            if (smallest > Math.abs(num2 % 10)) {
                smallest = Math.abs(num2 % 10);
            }
            num2 /= 10;
        }
        return (largest - smallest) + 1;
    }

    public static void main(String[] args) {
        System.out.println(digitRange(68437));
    }
}
