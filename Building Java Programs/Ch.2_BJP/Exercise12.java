public class Exercise12 {

    public static void loop() {
        int k = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = k; j < k+3; j++) {
                System.out.print(k);
            }
            k++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        loop();
        loop();
        loop();
    }
}
