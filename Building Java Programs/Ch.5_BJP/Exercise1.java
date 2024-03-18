// Write a method called showTwos that shows the factors of 2 in a given integer
public class Exercise1 {
    public static void showTwos(int num) {
        int help = num;
        int count = 0;
        while (help % 2 == 0) {
            help /= 2;
            count++;
        }
        if (count > 0) {
            System.out.print(num + " = ");
            for (int i = 0; i < count; i++) {
                System.out.print(2 + " * ");
            }
            System.out.print(help);
        } else {
            System.out.print(num + " = " + help);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
    }
}