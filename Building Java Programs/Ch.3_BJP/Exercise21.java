import java.util.Scanner;

public class Exercise21 {
    public static void processName(Scanner scan) {
        System.out.print("Please enter your full name: ");
        String first = scan.next();
        String last = scan.next();
        System.out.println("Your name in reverse order is " + last + ", " + first);
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        processName(console);
        console.close();
    }
}
