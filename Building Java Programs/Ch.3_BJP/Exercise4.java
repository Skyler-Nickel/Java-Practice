// This program writes a method called printSquare that accpets a minimum and maximum
// integer and prints a square of lines increasing in number
// the first line will start with the minimum and each line after will start with
// the next highest
public class Exercise4 {
    public static void printSquare(int number, int number2) {
        for (int i = 0; i <= (number2 - number); i++) {
            for (int j = number + i; j <= number2; j++) {
                System.out.print(j);
            }
            for (int j = number; j < number + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSquare(3, 7);
    }
}
