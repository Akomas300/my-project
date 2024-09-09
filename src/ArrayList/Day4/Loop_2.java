package ArrayList.Day4;

public class Loop_2 {
    public static void main(String[] args) {
        // one loop to print the rows
        for (int row = 1; row <= 6; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }  // one loop to print the rows
        for (int row = 1; row <= 6; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}