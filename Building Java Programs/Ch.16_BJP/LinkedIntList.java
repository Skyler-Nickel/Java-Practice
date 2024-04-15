// Example included in the textbook that will include exercises
// Class LinkedIntList can be used to store a list of integers.

import java.util.NoSuchElementException;

public class LinkedIntList {
    private ListNode front; // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre: 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: returns the position of the first occurrence of the
    // given value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index -1 );
            current.next = new ListNode(value, current.next);
        }
    }

    // pre: 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre: 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // Exercise 1:
    // Write a method called set that accepts an index and a value and sets the list's elements
    // at that index to have the given value.
    public void set(int index, int value) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = value;
    }

    // Exercise 2:
    // Write a method called min that returns the minimum value in a list of integers. If the list
    // is empty, it should throw a NoSuchElementException.
    public int min() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        int min = Integer.MAX_VALUE;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    // Exercise 3:
    // Write a method called isSorted that returns truw if the list is in sorted order and returns
    // false otherwise. An empty list is considered to be sorted
    public boolean isSorted() {
        if (size() == 0) {
            return true;
        }
        ListNode current = front;
        ListNode nextNode = front;
        while (nextNode.next != null) {
            nextNode = nextNode.next;
            if (nextNode.data < current.data) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    // Exercise 4:
    // Write a method called lastIndexOf that accepts an integer value as a parameter and that
    // returns the index in the list of the last occurrence of that value, or -1 if the value
    // is not found in the list.
    public int lastIndexOf(int value) {
        if (size() == 0) {
            return -1;
        }
        ListNode current = front;
        int index = -1;
        int count = 1;
        while (current != null) {
            if (current.data == value) {
                index = count;
            }
            current = current.next;
            count++;
        }
        return index;
    }

    // Exercise 5:
    // Write a method called countDuplicates that returns the number of duplicates in a sorted
    // list. The list will be in sorted order, so all of the duplicates will be grouped together.
    public int countDuplicates() {
        if (size() == 0) {
            return 0;
        }
        ListNode current = front;
        ListNode nextNode = front;
        int count = 0;
        while (nextNode.next != null) {
            nextNode = nextNode.next;
            if (current.data == nextNode.data) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    // Exercise 6:
    // Write a method called hasTwoConsecutive that returns whether or not a list of integers
    // has two adjacent numbers that are consecutive integers(true if such a pair exists
    // and false otherwise).
    public boolean hasTwoConsecutive() {
        if (size() == 0) {
            return false;
        }
        ListNode current = front;
        ListNode nextNode = front;
        while (nextNode.next != null) {
            nextNode = nextNode.next;
            if (current.data + 1 == nextNode.data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Exercise 7:
    // Write a method called deleteBack that deletes the last value(the value at the back of
    // the list) and returns the deleted value. If the list is empty throw NoSuchElementException
    public int deleteBack() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        while (current.next.next != null) {
            current = current.next;
        }
        int value = current.next.data;
        current.next = null;
        return value;
    }

    // Exercise 8:
    // Write a method called switchPairs that switches the order of the values in the list in a
    // pairwise fashion. Your method should switch the order of the first two values, then switch
    // the order of the next two values, and so on.
    public void switchPairs() {
        if (size() == 0 || size() == 1) {
            return;
        }
        ListNode current = front;
        ListNode nextNode = front;
        if (nextNode.next != null) {
            nextNode = nextNode.next;
        }
        while (nextNode != null) {
            int temp = current.data;
            current.data = nextNode.data;
            nextNode.data = temp;
            current = current.next.next;
            nextNode = nextNode.next.next;
        }
    }

    // Exercise 9:
    // Write a method called stutter that doubles the size of a list by replacing every integer in
    // the list with two of that integer.
    public void stutter() {
        if (size() == 0) {
            return;
        }
        ListNode current = front;
        while (current != null) {
            current.next = new ListNode(current.data, current.next);
            current = current.next.next;
        }
    }

    // Exercise 10:
    // Write a method called stretch that takes an integer n as a parameter and that increases
    // a list of integers by a factor of n by replacing each integer in the original list
    // with n copies of that integer
    public void stretch(int n) {
        if (size() == 0) {
            return;
        }
        ListNode current = front;
        int count = 1;
        while (current != null) {
            if (count < n) {
                current.next = new ListNode(current.data, current.next);
                current = current.next;
                count++;
            } else {
                current = current.next;
                count = 1;
            }
        }
    }

    // Exercise 11:
    // Write a method called compress that replaces every pair of elements in the list with a
    // single element equal to the sum of the pair. If the list is of odd size, leave the last
    // element unchanged.
    public void compress() {
        if (size() <= 1) {
            return;
        }
        ListNode compressed = front;
        ListNode nextNode = front;
        ListNode current = front;
        if (size() % 2 != 0) {
            while (nextNode.next != null) {
                nextNode = nextNode.next;
                compressed.data = current.data + nextNode.data;
                compressed = compressed.next;
                nextNode = nextNode.next;
                current = current.next.next;
            }
            compressed.next = null;
            compressed.data = nextNode.data;
        } else {
            while (nextNode != null) {
                nextNode = nextNode.next;
                compressed.data = current.data + nextNode.data;
                nextNode = nextNode.next;
                current = current.next.next;
                if (nextNode != null) {
                    compressed = compressed.next;
                }
            }
            compressed.next = null;
        }
    }

    // Exercise 12:
    // Write a method called split that rearranges the elements of a list so that all of the
    // negative values appear before all the nonnegatives.
    public void split() {
        if (size() <= 1) {
            return;
        }
        ListNode current = front;
        ListNode nextNode = front;
    }
}