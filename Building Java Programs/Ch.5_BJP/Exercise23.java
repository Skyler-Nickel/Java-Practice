// Write a method called hasAnOddDigit that returns whether a given positive integer has at least one digit whose
// value is odd.
public class Exercise23 {
    public boolean hasAnOddDigit(int num) {
        int num2 = num;
        while (num2 != 0) {
            if ((num2 % 10) % 2 != 0) {
                return true;
            }
            num2 /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Exercise23 a = new Exercise23();
        System.out.println(a.hasAnOddDigit(4822116));
        System.out.println(a.hasAnOddDigit(2448));
    }
}
