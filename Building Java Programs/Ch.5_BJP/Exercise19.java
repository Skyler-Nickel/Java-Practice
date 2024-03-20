// Write a method called firstDigit that returns the first (most significant) digit of an integer.
public class Exercise19 {
    public static int firstDigit(int num) {
        int digit = 0;
        int num2 = num;
        while (num2 != 0) {
            digit = Math.abs( num2 % 10);
            num2 /= 10;
        }
        return digit;
    }

    public static void main(String[] args) {
        System.out.println(firstDigit(3572));
        System.out.println(firstDigit(-947));
    }
}
