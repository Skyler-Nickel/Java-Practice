public class Exercise13 {
    public static void loop() {
        int k = 9;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
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
        loop();
    }
}
