// Exercise 10:
// Write a method called removeInRange that accepts three parameters, an ArrayList of strings, a
// beginning string, and an ending string, and removes from the list any strings that fall
// alphabetically between the start and end strings.

import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("that");
        list.add("is");
        list.add("the");
        list.add("question");

        System.out.println("List before calling removeInRange = " + list);
        removeInRange(list, "free", "rich");
        System.out.println("List after calling removeInRange = " + list);
    }

    public static void removeInRange(ArrayList<String> list, String s1, String s2) {
        if (list.size() == 0) {
            return;
        }
        String temp = null;
        for (int i = list.size()-1; i >= 0; i--) {
            temp = list.get(i);
            if ((temp.compareTo(s1) >= 0) && (temp.compareTo(s2) <= 0)) {
                list.remove(i);
            }
        }
    }
}
