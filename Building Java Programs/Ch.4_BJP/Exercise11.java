// Write a method called longestName that accepts a scanner for a console and an integer
// n as parameters and prompts for n names, then prints the longest name

import java.util.Scanner;

public class Exercise11 {
    public static void longestName(Scanner scan, int n) {
        String longest = "";
        for (int i = 1; i <= n; i++) {
            String temp = "";
            System.out.print("name #" + i + "? ");
            temp = scan.next();
            if (longest.length() < temp.length()) {
                longest = temp;
            }
        }

        // used to make first character capital and rest of string lowercase
        char c = Character.toUpperCase(longest.charAt(0));
        longest = longest.toLowerCase();
        longest = longest.replace(longest.charAt(0), c);
        
        System.out.println(longest + "\'s name is longest");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        longestName(console, 4);
        console.close();
    }
}
