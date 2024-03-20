// Write a method called allDigitsOdd that returns whether every digit of a positive integer is odd.
public class Exercise22 {
    public static boolean allDigitsOdd(int num) {
        int num2 = num;
        while (num2 != 0) {
            if ((num2 % 10) % 2 == 0) {
                return false;
            }
            num2 /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(allDigitsOdd(135319));
        System.out.println(allDigitsOdd(9145293));
    }
}
