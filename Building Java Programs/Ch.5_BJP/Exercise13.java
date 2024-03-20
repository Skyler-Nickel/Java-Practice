// Write a method called consecutive that accepts three integer as parameters and returns true if they are three
// consecutive numbers--that is, if the numbers can be arranged into an order such that, assuming some integers k, the
// parameters' values are k, k + 1, and k + 2. Your method should return false if the integers are not consecutive.
public class Exercise13 {
    public static boolean consecutive(int a, int b, int c) {
        return ((a+1 == b) || (a+1 == c) || (a-1 == b) || (a-1 == c)) && (a + b + c) % 3 == 0;
    }

    public static void main(String[] args) {
        System.out.println(consecutive(1, 2, 3));
        System.out.println(consecutive(3, 2, 4));
        System.out.println(consecutive(-10, -8, -9));
        System.out.println(consecutive(3, 5, 7));
        System.out.println(consecutive(1, 2, 2));
        System.out.println(consecutive(7, 7, 9));
    }
}
