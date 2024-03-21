// Write a method called countCoins that accepts a Scanner representing an input file whose
// data is a series of pairs of tokens, where each pair begins with an integer and is followed
// by the type of coin, which will be "pennies" (1 cent each), "nickels" (5 cents each),
// "dimes" (10 cents each), or "quarters" (25 cents each),

import java.util.Scanner;

public class Exercise4 {
    public static void countCoins(Scanner scan) {
        int temp = 0;
        String s = "";
        double total = 0;

        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                temp = scan.nextInt();
            }
            s = scan.next();
            s = s.toLowerCase();
            if (s.equals("pennies")) {
                total += temp * 1;
            } else if (s.equals("nickels")) {
                total += temp * 5;
            } else if (s.equals("dimes")) {
                total += temp * 10;
            } else if (s.equals("quarters")) {
                total += temp * 25;
            }
        }

        total /= 100.0;
        System.out.println("Total money: $" + total);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner("3 pennies 2 quarters 1 Pennies 23 NiCkeLs 4 DIMES");
        countCoins(scan);
        scan.close();
    }
}
