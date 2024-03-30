// Exercise 16:
// Write a method called clump that accepts an ArrayList of strings as a parameter and replaces each
// pair of strings with a single string that consists of the two original strings in parentheses
// separated by a space. If the list is of odd length, the final element is unchanged.

import java.util.*;

public class Exercise16 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("four", "score", "and", 
                        "seven", "years", "ago", "our"));
        
        System.out.println("List before clump is called = " + list);
        clump(list);
        System.out.println("List after clump is called = " + list);
    }

    public static void clump(ArrayList<String> list) {
        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i+1 < list.size()) {
                    String replace = "(" + list.get(i) + " " + list.get(i+1) + ")";
                    list.add(i, replace);
                    list.remove(i+1);
                    list.remove(i+1);
                }
            }
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                if (i+1 < list.size() - 1) {
                    String replace = "(" + list.get(i) + " " + list.get(i+1) + ")";
                    list.add(i, replace);
                    list.remove(i+1);
                    list.remove(i+1);
                }
            }
        }
    }
}
