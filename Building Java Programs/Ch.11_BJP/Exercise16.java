// Exercise 16:
// Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and
// returns true if no two keys map to the same value.

// Alright im done for the night will finish tomorrow....

import java.util.*;

public class Exercise16 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        
        Map<String, String> map2 = new TreeMap<>();

        System.out.println(is1to1(map));
        System.out.println(is1to1(map2));
    }

    public static boolean is1to1(Map<String, String> map) {
        
        return true;
    }
}
