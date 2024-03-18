// Write a method called printFactors that accepts an integer as ts parameter
// and uses a fencepost loop to print the factors of that number, sperated by the
// word "and".
public class Exercise9 {
    public static void printFactors(int x) {
        int i = 1;
        while (i < x) {
            if (x % i == 0) {
                System.out.print(i + " and ");
            }
            i++;
        }
        System.out.print(x);
        System.out.println();
    }

    public static void main(String[] args) {
        printFactors(24);
    }
}
