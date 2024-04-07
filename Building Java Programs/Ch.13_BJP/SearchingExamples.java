// Examples provided by the textbook for various searching algorithms

public class SearchingExamples {

    // Sequential search algorithm
    // Returns the index at which the given target number first
    // appears in the given input array, or -1 if it is not found.
    public static int indexOf(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        // not found
        return -1;
    }

    // Binary search algorithm.
    // Returns an index at which the target
    // appears in the given input array, or -1 if not found
    // pre: array is sorted.
    public static int binarySearch(int[] numbers, int target) {
        int min = 0;
        int max = numbers.length - 1;
        while (min <= max) {
            int mid = (max + min) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                min = mid + 1; // too small
            } else { // (numbers[mid] > target)
                max = mid - 1; // too large
            }
        }
        return -1; // not found
    }

    // Recursive binary search
    public static int binarySearchR(int[] numbers, int target) {
        return binarySearchR(numbers, target, 0, numbers.length-1);
    }

    // helper function
    private static int binarySearchR(int[] numbers, int target, int min, int max) {
        //base case
        if (min > max) {
            return -1; // not found
        } else {
            int mid = (max + min) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                return binarySearchR(numbers, target, mid + 1, max);
            } else {
                return binarySearchR(numbers, target, min, mid - 1);
            }
        }
    }

    // Sequential search algorithm with objects
    public static int indexOf(Object[] objects, Object target) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] strings, String target) {
        int min = 0;
        int max = strings.length - 1;
        while (min <= max) {
            int mid = (max + min) / 2;
            int compare = strings[mid].compareTo(target);
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }
}
