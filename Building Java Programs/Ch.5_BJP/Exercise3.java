// Write a method called toBinary that accepts an integer as a parameter and returns
// a string containing that integers binary representation
public class Exercise3 {
    public static String toBinary(int num) {
        // result string to return
        String binary = "";
        // string used to help since binary will be backwards
        String help = "";
        // loop will run while we can divide by 2
        while (num > 0) {
            // convert to binary
            help += num % 2;
            num /= 2;
        }
        // loop to reverse output from helper string to returned binary string
        for (int i = help.length()-1; i >= 0; i--) {
            binary += help.charAt(i);
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println(toBinary(44));
        System.out.println(toBinary(2));
        System.out.println(toBinary(127));
        System.out.println(toBinary(49));
    }
}
