// Write a method called padString that accepts two parameters a string and an integer
// representing length. The method should pad the parameter stringwith spaces
// until its length is the given length 
public class Exercise17 {
    public static String padString(String s, int padding) {
        String newS = s;
        for (int i = s.length(); i < padding; i++) {
            newS += " ";
        }
        System.out.println("The length of newS is: " + newS.length());
        return newS;
    }

    public static void main(String[] args) {
        // the bar in print statement is to see if spaces were added
        System.out.println(padString("hello", 8));
        System.out.println(padString("congratulations", 10));
    }
}
