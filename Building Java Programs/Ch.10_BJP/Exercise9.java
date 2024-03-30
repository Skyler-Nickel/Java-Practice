// Exercise 9:
// Write a method called rangeBetweenZeroes that takes as a parameter an ArrayList of integers
// and returns the range number of indexes apart the two farthest occurrences of the number 0 are.


import java.util.*;

public class Exercise9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(4);
        list.add(0);
        list.add(9);
        list.add(0);
        list.add(6);
        list.add(4);
        list.add(8);

        System.out.println("List contents = " + list);
        System.out.println("Range in between Zeroes = " + rangeBetweenZeroes(list));    // should return 6
    
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println("List contents = " + list2);
        System.out.println("Range in between Zeroes = " + rangeBetweenZeroes(list2));   // should return 0

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(0);
        list3.add(3);

        System.out.println("List contents = " + list3);
        System.out.println("Range in between Zeroes = " + rangeBetweenZeroes(list3));

        ArrayList<Integer> list4 = new ArrayList<>();
        System.out.println("List contents = " + list4);
        System.out.println("Range in between Zeroes = " + rangeBetweenZeroes(list4));

    }

    public static int rangeBetweenZeroes(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        int firstZero = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                firstZero = i;
                break;
            }
        }
        int secondZero = 0;
        for (int i = firstZero; i < list.size(); i++) {
            if (list.get(i) == 0) {
                secondZero = i;
            }
        }
        if (firstZero == 0 && secondZero == 0) {
            return 0;
        } else if (firstZero > 0 && firstZero == secondZero) {
            return 1;
        } else {
            return (secondZero - firstZero) + 1;
        }
    }
}
