// Exercise 4:
// Write a recursive method called doubleDigits that accepts an integer n as a parameter and returns
// the integer obtained by replacing every digit of n with two of that digit.

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("The digit is " + doubleDigits(0));
        System.out.println("The digit is " + doubleDigits(348));
        System.out.println("The digit is " + doubleDigits(-789));
        System.out.println("The digit is " + doubleDigits(12345));
    }

    public static int doubleDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return doubleDigits(n / 10) * 100 + (n % 10) * 10 + n % 10;
    }
}
