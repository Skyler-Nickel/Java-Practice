// Write a method called lastDigit that returns the last digit of an integer
public class Exercise9 {
    public static int lastDigit(int number) {
        String last = "";
        last += number;
        char c = last.charAt(last.length() - 1);
        int result = c - '0';
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(3572));
        System.out.println(lastDigit(-947));
    }
}
