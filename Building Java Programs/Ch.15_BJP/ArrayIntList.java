// Chapter 15 example of implementing a collection class
// Class ArrayIntList can be used to store a list of integers.

import java.util.NoSuchElementException;

public class ArrayIntList {
    private int[] elementData;      // list of integers
    private int size;               // number of elements in the list

    public static final int DEFAULT_CAPACITY = 100;

    // post: constructs an empty list of default capacity
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    // pre : capacity >= 0 (throws IllegalArgumentException if not)
    // post : constructs an empty list with the given capacity
    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
        elementData = new int[capacity];
        size = 0;
    }

    // post : returns the current number of elements in the list
    public int size() {
        return size;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post : returns the integer at the given index in the list
    public int get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    // post : returns comma-seperated, bracketed version of list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given value
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // pre : size() < capacity (throws IllegalStateException if not)
    // post : appends the given value to the end of the list
    public void add(int value) {
        checkCapacity(size + 1);
        elementData[size] = value;
        size++;
    }

    // pre : size() < capacity && 0 <= index <= size()
    // post : inserts the given value at the given index, shifting subsequent values right
    public void add(int index, int value) {
        for (int i = size; i >= index + 1; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post : removes value at the given index, shifting subsequent values left
    public void remove(int index) {
        checkIndex(index);
        for (int i = 0; i < size -1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }

    // post : checks if a particular value is in the list
    public boolean contains(int value) {
        return indexOf(value) >= 0;
    }

    // post : checks if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // pre : 0 <= index < size (throws IndexOutOfBoundsException if not)
    // post : replaces a value at a certain location
    public void set(int index, int value) {
        checkIndex(index);
        elementData[index] = value;
    }

    // post : checks that the underlying array has the given capacity, throwing an
    // IllegalStateException if it does not
    private void checkCapacity(int capacity) {
        if (capacity > elementData.length) {
            throw new IllegalStateException("exceeds list capacity");
        }
    }

    // post : throws an IndexOutOfBoundsException if the given index is not a legal
    // index of the current list
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    // post : throws an NoSuchElementException if no elements are in list
    private void checkElement(int size) {
        if (size == 0) {
            throw new NoSuchElementException("size: " + size);
        }
    }

    // pre : size() + other.size() < capacity (throws IllegalStateException if not)
    // post : adds all values to arrayintlist from another arrayintlist
    public void addAll(ArrayIntList other) {
        checkCapacity(size + other.size);
        for (int i = 0; i < other.size; i++) {
            add(other.elementData[i]);
        }
    }

    public ArrayIntListIterator iterator() {
        return new ArrayIntListIterator(this);
    }

    // Exercise 1:
    // Write a method called lastIndexOf that accepts an integer as a parameter and returns
    // the index of the last occurrence
    public int lastIndexOf(int value) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Exercise 2:
    // Write a method called indexOfSubList that accepts another list L as a parameter and returns
    // the starting index of where l first appears in this list or -1 if not found.
    public int indexOfSubList(ArrayIntList other) {
        int index = -1;
        
        if (other.size > size || other.size == 0) {
            return -1;
        }

        // find and store the index
        for (int i = 0; i < size; i++) {
            if (elementData[i] == other.elementData[0]) {
                index = i;
                break;
            }
        }

        // used to traverse this list
        int count = index;
        // check that other subList is in our list
        for (int i = 0; i < other.size; i++) {
            if (other.elementData[i] != elementData[count]) {
                return -1;
            }
            count++;
        }

        return index;
    }

    // Exercise 3:
    // Write a mmethod called replaceAll that accepts two integer values as parameters and replaces
    // all occurrences of the first value in the list with the second value.
    public void replaceAll(int value, int rValue) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                elementData[i] = rValue;
            }
        }
    }

    // Exercise 4:
    // Write a method called reverse that reverses the order of the elements in the array list.
    public void reverse() {
        if (size == 0 || size == 1) {
            return;
        }
        for (int i = 0; i < size / 2; i++) {
            int temp = elementData[size - i - 1];
            elementData[size - i - 1] = elementData[i];
            elementData[i] = temp;
        }
    }

    // Exercise 5:
    // Write a method called runningTotal that returns a new ArrayIntList that contains a running
    // total of the original list.
    public ArrayIntList runningTotal() {
        ArrayIntList list2 = new ArrayIntList(size);
        if (size == 0) {
            return list2;
        }
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                list2.add(elementData[i]);
            } else {
                list2.add(list2.elementData[i - 1] + elementData[i]);
            }
        }
        return list2;
    }

    // Exercise 6:
    // Write a method called fill that accepts an integer value as a parameter and replaces
    // every value in the list with that value
    public void fill(int value) {
        for (int i = 0; i < size; i++) {
            elementData[i] = value;
        }
    }

    // Exercise 7:
    // Write a method called isPairwiseSorted that returns whether or not a list of integers is
    // pairwise sorted. A list is considered pairwise sorted if each successive pair of numbers
    // is in nondecreasing order.
    public boolean isPairwiseSorted() {
        if (size == 0 || size == 1) {
            return true;
        }
        for (int i = 0; i < size; i+=2) {
            int temp = elementData[i];
            int temp2 = 0;
            if (i + 1 < size) {
                temp2 = elementData[i+1];
            } else {
                temp2 = elementData[i];
            }
            if (temp > temp2) {
                return false;
            }
        }
        return true;
    }

    // Exercise 8:
    // Write a method called count that accepts an element value as a parameter and returns the 
    // number of occurrences of that value in the list.
    public int count(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                count++;
            }
        }
        return count;
    }

    // Exercise 9:
    // Write a method called maxCount that returns the number of occurrences of the most frequently
    // occurring value in a sorted list of integers.
    public int maxCount() {
        int max = 0;
        int count = 1;
        for (int i = 0; i < size; i++) {
            if (i + 1 < size) {
                if (elementData[i] == elementData[i+1]) {
                    count++;
                } else {
                    count = 1;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    // Exercise 10:
    // Write a method called longestSortedSequence that returns the length of the longest sorted 
    // sequence within a list of integers
    public int longestSortedSequence() {
        int longest = 0;
        int count = 1;
        for (int i = 0; i < size; i++) {
            if (i + 1 < size) {
                if (elementData[i] <= elementData[i+1]) {
                    count++;
                } else {
                    count = 1;
                }
            }
            if (count > longest) {
                longest = count;
            }
        }
        return longest;
    }

    // Exercise 11:
    // Write a method called removeLast that removes and returns the last value from a 
    // list of integers.
    public int removeLast() {
        checkElement(size);
        int element = elementData[size-1];
        size--;
        return element;
    }

    // Exercise 12:
    // Write a method called remove front that takes an integer n as a parameter and that removes
    // the first n values from the list of integers.
    public void removeFront(int n) {
        checkCapacity(n);
        int count = 0;
        for (int i = n; i < size; i++) {
            elementData[count] = elementData[i];
            count++;
        }
        size -= n;
    }

    // Exercise 13:
    // Write a method removeAll that accepts an integer value as a parameter and that removes all
    // occurrences of the given value from the list.
    public void removeAll(int value) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (elementData[i] != value) {
                elementData[index] = elementData[i];
                index++;
            }
            if (elementData[i] == value) {
                count++;
            }
        }
        size -= count;
    }

    // Exercise 14:
    // Write a method called printInversions that lists all inversions in a list of integers. An
    // inversion is a pair of numbers in which the first appears before the second in the list
    // but the first is greater than the second.
    public void printInversions() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (elementData[i] > elementData[j]) {
                    System.out.println("(" + elementData[i] + ", " + elementData[j] + ")");
                }
            }
        }
    }

    // Exercise 15:
    // Write a method called mirror that doubles the size of a list by appending the mirror image
    // of the original sequence to the end of the list.
    public void mirror() {
        checkCapacity(size * 2);
        int index = size;
        size *= 2;
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[index-1];
            index--;
        }
    }

    // Exercise 16:
    // Write a method called stutter that replaces every value with two of that value.
    public void stutter() {
        checkCapacity(size * 2);
        int index = size;
        size *= 2;
        for (int i = size - 1; i >= 1; i-=2) {
            elementData[i] = elementData[index - 1];
            elementData[i-1] = elementData[index - 1];
            index--;
        }
    }

    // Exercise 17:
    // Write a method called stretch that takes an integer n as a parameter and that increases a
    // list of integers by a factor of n by replacing each integer integer in the original list
    // with n copies of that integer.
    public void stretch(int n) {
        checkCapacity(n * size);
        int index = size;
        int count = 0;
        size *= n;
        int index2 = size - 1;
        while (index >= 0) {
            while (count < n) {
                if (index - 1 >= 0) {
                    elementData[index2] = elementData[index-1];
                }
                index2--;
                count++;
            }
            index--;
            count = 0;
        }
    }

    // Exercise 18:
    // Write a method called doubleList that doubles the size of a list by appending a copy of the
    // original sequence to the end of the list.
    public void doubleList() {
        checkCapacity(size * 2);
        int index = 0;
        int index2 = size;
        size *= 2;
        for (int i = index2; i < size; i++) {
            elementData[i] = elementData[index];
            index++;
        }
    }

    // Exercise 19:
    // Write a method called compress that replaces every pair of elements in the list with a single
    // element equal to the sum of the pair.
    public void compress() {
        int count = 0;
        int index = 0;
        if (size % 2 != 0) {
            int last = elementData[size-1];
            for (int i = 0; i < size-1; i+=2) {
                elementData[index] = elementData[i] + elementData[i+1];
                count++;
                index++;
            }
            size -= count;
            elementData[size-1] = last;
        } else {
            for (int i = 0; i < size; i+=2) {
                elementData[index] = elementData[i] + elementData[i+1];
                count++;
                index++;
            }
            size -= count;
        }
    } 

    // Exercise 20:
    // Write a method called rotate that moves the value at the front of a list of integers to
    // the end of the list.
    public void rotate() {
        int first = elementData[0];
        for (int i = 0; i < size; i++) {
            elementData[i] = elementData[i+1];
        }
        elementData[size-1] = first;
    }

    // Exercise 21:
    // Write a method called switchPairs that switches the order of values in the list in a
    // pairwise fashion.
    public void switchPairs() {
        if (size % 2 != 0) {
            for (int i = 0; i < size-1; i+=2) {
                int temp = elementData[i];
                elementData[i] = elementData[i+1];
                elementData[i+1] = temp;
            }
        } else {
            for (int i = 0; i < size; i+=2) {
                int temp = elementData[i];
                elementData[i] = elementData[i+1];
                elementData[i+1] = temp;
            }
        }
    }

    // Exercise 22:
    // Write a method called fromCounts that converts an ArrayIntList of counts into a new
    // ArrayIntList of values that displays the previous element n(element) times
    public ArrayIntList fromCounts() {
        ArrayIntList list2 = new ArrayIntList();
        for (int i = 0; i < size; i+=2) {
            for (int j = 0; j < elementData[i]; j++) {
                list2.add(elementData[i+1]);
            }
        }
        return list2;
    }
}