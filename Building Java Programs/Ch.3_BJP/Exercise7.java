// This program writes a variation to exercise 6 that takes three parameters
// and returns largest aboslute value of the three
public class Exercise7 {
    public static int largestAbsVal(int number, int number2, int number3) {
        int help = Math.max(Math.abs(number), Math.abs(number2));
        help = Math.max(help, Math.abs(number3));
        return help;
    }

    public static void main(String[] args) {
        System.out.println(largestAbsVal(7, -2, -11));
        System.out.println(largestAbsVal(-4, 5, 2));
    }
}
