// Write a method called average that takes two ints as parameters and returns the 
// average of the two ints
public class Exercise13 {
    public static double average(int a, int b) {
        return ( (double) (a + b) / 2);
    }

    public static void main(String[] args) {
        System.out.println(average(5, 6));
        System.out.println(average(10, 20));
    }
}
