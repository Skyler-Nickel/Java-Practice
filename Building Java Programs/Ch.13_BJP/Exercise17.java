// Exercise 17:
// Write a comparator that compares String objects of a particular format. Each string is of a form such as
// "123456 Seattle, WA", beginning with a numeric token that is followed by additional tokens. Your job
// is to treat the first tokens as integers and compare them in numerical order.

import java.util.*;

public class Exercise17 implements Comparator<String> {
    public int compare(String s1, String s2) {
        return findInt(s1) - findInt(s2);
    }

    private int findInt(String s) {
        Scanner scan = new Scanner(s);
        return Integer.parseInt(scan.next());
    } 
}
