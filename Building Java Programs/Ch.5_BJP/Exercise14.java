// Write a method called hasMidpoint that accepts three integers as parameters and returns true if one of the integers
// is the midpoint between the other two integers: that is, if one integer is exactly halfway between them. Your method
// should return false if no such midpoint relationship exists.
public class Exercise14 {
    public static boolean hasMidpoint(int x, int y, int z) {
        return ((x + y + z) / 3 == x) || ((x + y + z) / 3 == y) || ((x + y + z) / 3 == z);
    }

    public static void main(String[] args) {
        System.out.println(hasMidpoint(1, 1, 1));
        System.out.println(hasMidpoint(7, 4, 10));
        System.out.println(hasMidpoint(9, 15, 8));
    }
}
