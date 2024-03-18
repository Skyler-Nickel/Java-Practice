// Write a method called distance that accepts four integer coordinates
// as parameters and computes the distance between points
public class Exercise11 {
    public static double distance(int x1, int y1, int x2, int y2) {
        int xSquares = (x2 - x1) * (x2 - x1);
        int ySquares = (y2 - y1) * (y2 - y1);
        return Math.sqrt(xSquares + ySquares);
    }

    public static void main(String[] args) {
        System.out.println(distance(1, 0, 4, 4));
        System.out.println(distance(10, 2, 3, 15));
    }
}
