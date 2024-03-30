// Exercise 3:
// Write a method called removeEvenLength that takes an ArrayList of strings as a
// parameter and removes all of the strings of even length from the list.

// using list.add to get use to working with ArrayList

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("There");      // odd string length should remain in list
        list.add("is");         // even should be removed
        list.add("some");       // even should be removed
        list.add("good");       // even should be removed
        list.add("in");         // even should be removed
        list.add("this");       // even should be removed
        list.add("world");      // odd should remain
        list.add("and");        // odd should remain
        list.add("it's");       // even should be removed including ' char
        list.add("worth");      // odd should remain
        list.add("fighting");   // even should be removed
        list.add("for");        // odd should remain

        System.out.println("List before removeEvenLength is called = " + list);
        removeEvenLength(list);
        System.out.println("List after removeEvenLength is called = " + list);      // should contain 5 words
    }

    public static void removeEvenLength(ArrayList<String> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
