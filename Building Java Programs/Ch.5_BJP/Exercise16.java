// Write a method called anglePairs that accepts three angles (integers), measured in degrees, as parameters
// and returns whether or not there exist both complementary and supplementary angles among the three angles passed.

public class Exercise16 {
    public static boolean anglePairs(int x, int y, int z) {
        return ((x + y == 90) || (x + z == 90) || (y + z == 90)) && ((x + y == 180) || (x + z == 180) || (y + z == 180));
    }    

    public static void main(String[] args) {
        System.out.println(anglePairs(120, 60, 30));
        System.out.println(anglePairs(135, 18, 42));
    }
}
