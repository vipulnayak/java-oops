

public class For {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            System.out.println("Day " + i);
            System.out.println("");
            for (int j = 1; j <= 9; j++) {
                System.out.println("" + (j + 8) + "-" + (j + 9));
            }
            System.out.println(" ");
        }
    }
}