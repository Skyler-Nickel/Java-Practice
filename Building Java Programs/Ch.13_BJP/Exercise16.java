// Exercise 16:
// Write a comparator that compares String objects by the number of words they contain.

import java.util.*;

public class Exercise16 implements Comparator<String> {
    public int compare(String s1, String s2) {
        int wCount1 = wCount(s1);
        int wCount2 = wCount(s2);
        
        if (wCount1 == wCount2) {
            return 0;
        } else if (wCount1 < wCount2) {
            return -1;
        } else {
            return 1;
        }
    }

    private int wCount(String s) {
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                spaces++;
            }
        }
        return spaces;
    }
}
