// Exercise 14:
// Write a method called removeShorterStrings that accepts an ArrayList of strings as a parameter
// and removes from each pair of values the shorter string in the pair. If the list is of odd length
// the final element is unchanged.

import java.util.*;

public class Exercise14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("four");
        list.add("score");
        list.add("and");
        list.add("seven");
        list.add("years");
        list.add("ago");
        list.add("our");

        System.out.println("List before calling removeShorterStrings = " + list);
        removeShorterStrings(list);
        System.out.println("List after calling removeShorterStrings = " + list);
    }

    public static void removeShorterStrings(ArrayList<String> list) {
        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size(); i++) {
                String s1 = list.get(i);
                String s2 = list.get(i+1);
                if (s1.length() < s2.length()) {
                    list.remove(i);
                } else {
                    list.remove(i+1);
                }
            }
        } else {
            for (int i = 0; i < list.size()-1; i++) {
                String s1 = list.get(i);
                String s2 = list.get(i+1);
                if (s1.length() < s2.length()) {
                    list.remove(i);
                } else {
                    list.remove(i+1);
                }
            }
        }
    }
}
