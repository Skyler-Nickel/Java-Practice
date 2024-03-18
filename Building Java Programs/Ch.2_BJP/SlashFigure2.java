public class SlashFigure2 {
    
    public static final int HEIGHT = 8; 

    public static void main(String[] args) {
        int temp = HEIGHT * 2;
        int slash = 0;
        int mark = (temp-1) * 2;
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < slash; j++) {
                System.out.print("\\");
            }
            for (int j = 0; j < mark; j++) {
                System.out.print("!");
            }
            for (int j = 0; j < slash; j++) {
                System.out.print("/");
            }
            System.out.println();
            slash+=2;
            mark-=4;
        }
    }
}
