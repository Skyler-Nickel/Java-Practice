public class Exercise3 {
    public static void main(String[] args) {
        int fib1 = 1;
        int fib2 = 1;
        int fib3;
        for (int i = 1; i <= 12; i++) {
            System.out.print(fib1 + " ");
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        System.out.println();
    }
}
