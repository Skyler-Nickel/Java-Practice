// Exercise 12:
// Write a method contains3 that accepts a list of strings as a parameter and returns true if any single
// string occurs at least 3 times in the list, and false otherwise. Use a map as auxiliary storage

import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("hello" , "hello", "hello", "how", "are", "you"));
        List<String> list2 = new ArrayList<>(List.of("hello"));
        List<String> list3 = new ArrayList<>();

        System.out.println(contains3(list1));
        System.out.println(contains3(list2));
        System.out.println(contains3(list3));
    }

    public static boolean contains3(List<String> list) {
        if (list.size() == 0) {
            return false;
        }
        // More will go here but taking a break
    }
}
