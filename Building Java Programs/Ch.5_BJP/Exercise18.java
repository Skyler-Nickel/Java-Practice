// Write a method called digitSum that accepts an integer as a parameter and returns the sum of the digits of that number.
public class Exercise18 {
    public static int digitSum(int num) {
        int sum = 0;
        int num2 = num;
        while (num2 != 0) {
            sum += Math.abs(num2 % 10);
            num2 /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(0));
        System.out.println(digitSum(29107));
        System.out.println(digitSum(-456));
    }
}
