// Exercise 16:
// Write a recursive method called evenDigits that accepts an integer parameter and that returns the integer
// formed by removing the odd digits from it.

public class Exercise16 {
    public static void main(String[] args) {
        System.out.println(evenDigits(8342116));
        System.out.println(evenDigits(-34512));
    }

    public static int evenDigits(int n) {
        if (n == 0) {
            return 0;
        } else if ((n % 10) % 2 != 0) {
            return evenDigits(n / 10);
        } else {
            return evenDigits(n / 10) * 10 + (n % 10); 
        }
    }
}
