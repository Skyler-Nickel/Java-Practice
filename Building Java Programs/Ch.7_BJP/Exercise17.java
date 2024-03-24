// Write a method called vowelCount that accepts a String as a parameter and produces
// and returns an array of integers representing the counts of each vowel in the string.
// The array returned by your method should hold five elements, one for each vowel.

public class Exercise17 {
    public static int[] vowelCount(String s) {
        int[] newArr = new int[5];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                newArr[0]++;
            } else if (s.charAt(i) == 'e') {
                newArr[1]++;
            } else if (s.charAt(i) == 'i') {
                newArr[2]++;
            } else if (s.charAt(i) == 'o') {
                newArr[3]++;
            } else if (s.charAt(i) == 'u') {
                newArr[4]++;
            }
        }

        return newArr;
    }

    public static void printArr(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "i think, therefore i am";
        int[] vowel = vowelCount(s);
        printArr(vowel);
    }
}
