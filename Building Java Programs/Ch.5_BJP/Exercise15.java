// Write a method called dominant that accepts three integers and return true if any of the three
// integers is larger than the sum of the other two integers.
public class Exercise15 {
    public static boolean dominant(int a, int b, int c) {
        return (a > b+c) || (b > a+c) || (c > a+b);
    }
    
    public static void main(String[] args) {
        System.out.println(dominant(4, 9, 2));
        System.out.println(dominant(1, 1, 1));
        System.out.println(dominant(0, 2, 40));
        System.out.println(dominant(10, 5, 4));
    }
}
