// Write a method called perfectNumbers that accepts an integer as its parameter and
// prints all "perfect numbers" up to and including that maximum.
public class Exercise21 {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void perfectNumbers(int x) {
        System.out.print("Perfect numbers up to " + x + ": ");
        int help = 0;
        for (int i = 2; i <= x; i++) {
            if (isPrime(i)) {
                help = (int) ((Math.pow(2, i) - 1) * (Math.pow(2, i-1)));
                if (help <= x)
                System.out.print(help + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        perfectNumbers(28);
        perfectNumbers(45);
        perfectNumbers(9000);
    }
}
