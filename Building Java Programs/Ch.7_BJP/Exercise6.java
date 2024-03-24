// Write a method called stdev that returns standard deviation of an array of integers.
// Standard deviation is computed by taking the square root of the sum of the squares
// of the differences between each element and the mean, divided by one less than
// than the number of elements.
public class Exercise6 {
    public static double stdev(int[] arr) {
        double sum = 0.0;
        double mean = 0.0;
        double eleMinusOne = arr.length-1;
        for (double i: arr) {
            mean += i;
        }
        mean = (mean / arr.length);
        for (double x: arr) {
            sum += Math.pow(x - mean, 2);
        }
        return Math.sqrt(sum / eleMinusOne);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println("The standard deviation is " + stdev(arr));
    }
}
