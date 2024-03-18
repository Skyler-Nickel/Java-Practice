// Write a method called largerAbsVal that takes two ints
// as parameters and returns the larger of the two absolute values
public class Exercise6 {
    public static int largerAbsVal(int number, int number2) {
        return Math.max(Math.abs(number), Math.abs(number2));
    }

    public static void main(String[] args) {
        System.out.println(largerAbsVal(11, 2));
        System.out.println(largerAbsVal(4, -5));
    }
}
