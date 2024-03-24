// Write a method called percentEven that accepts an array of integers as a parameter
// and returns the percentage of even numbers in the array as a real number.
public class Exercise10 {
    public static double percentEven(int[] a) {
        double total = 0.0;
        double even = 0.0;
        if (a.length <= 0) {
            return 0.0;
        }
        for (int i: a) {
            if (i % 2 == 0) {
                even++;
            }
            total++;
        }
        return (even / total) * 100.0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 12};
        System.out.println(percentEven(arr));
    }
}
