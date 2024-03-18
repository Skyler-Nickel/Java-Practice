public class Exercise14 {
    public static void loop() {
        int k = 9;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(k);
            }
            k--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        loop();
        loop();
        loop();
        loop();
    }
}
