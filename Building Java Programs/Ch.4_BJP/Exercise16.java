// Write a method called printPalindrome that accepts a scanner for the console as a 
// parameter, prompts the user to enter one or more words, and prints whether the string
// entered is a palindrome

import java.util.Scanner;

public class Exercise16 {
    public static void printPalindrome(Scanner scan) {
        System.out.print("Please enter one or more words: ");
        String s = scan.nextLine();
        String s2 = s;
        String s3 = s;
        s = s.toLowerCase();
        s2 = s2.toLowerCase();
        int j = s.length()-1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s2.charAt(j)) {
                System.out.println(s3 + " is not a palindrome");
                return;
            }
            j--;
        }
        System.out.println(s3 + " is a palindrome");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printPalindrome(console);
        printPalindrome(console);
        console.close();
    }
}
