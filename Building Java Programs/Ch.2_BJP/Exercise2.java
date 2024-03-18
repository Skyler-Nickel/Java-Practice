// This exercise is to use a for loop to square loop values
public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // standard way of squaring
            System.out.print(i*i + " ");
        }
        System.out.println();

        // variables used to increment i without multiplying
        int help = 2;
        int help2 = 2;
        for (int i = 1; i <= 100; i++) {
            // Added challenge portion (not to use * multiplication operator)
            System.out.print(i + " ");
            i = i + help;
            help = help + help2;
        }
        System.out.println();
    }
}
