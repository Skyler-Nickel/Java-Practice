// Write a method called swapDigitPairs that accepts an integer n as a parameter and returns a new integer whose value
// is similar to n's but with each pair of digits swapped in order.
public class Exercise21 {
    public static int swapDigitPairs(int n) {
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = n;
        int count = 1;
        while (num3 != 0) {
            num1 = num3 % 10;
            num3 /= 10;
            if (num3 == 0) {
                result += count * num1;
                break;
            }
            num2 = num3 % 10;
            result = result + count * 10 * num1 + count * num2;
            num3 /= 10;
            count *= 100;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(swapDigitPairs(123));
        System.out.println(swapDigitPairs(12));
        System.out.println(swapDigitPairs(1234));
        System.out.println(swapDigitPairs(12345));
        System.out.println(swapDigitPairs(482596));
        System.out.println(swapDigitPairs(1234567));
    }
}
