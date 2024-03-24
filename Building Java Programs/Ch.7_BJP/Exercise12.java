// Write a method called priceIsRight that mimics the guessing rules from the game show
// the price is right. The method accepts as parameters an array of integers representing
// the contestents' bids and an integer representing the correct price. The method returns
// the element in the bids that is closest in value to the correct price without being
// larger than that price.

public class Exercise12 {
    public static int priceIsRight(int[] guess, int price) {
        int closest = -1;
        for (int i = 0; i < guess.length; i++) {
            int temp = 0;
            if (guess[i] <= price) {
                temp = guess[i];
                if (temp > closest) {
                    closest = temp;
                }
            }
        }
        return closest;
    }
    
    public static void main(String[] args) {
        int[] arr = {200, 300, 250, 1, 950, 40};
        int[] arr2 = {500, 750, 900, 650, 320, 150};
        System.out.println("The closest bid is " + priceIsRight(arr, 280));
        System.out.println("All bids were over so method returns " + priceIsRight(arr2, 75));
    }
}
