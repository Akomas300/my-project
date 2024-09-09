package ArrayList.Day4;

public class TriangleLoop {
    public static void main(String[] args) {
        int romws = 4;

        for (int i = 1; i <= 5; i++) {
            // Print spaces
            // for (int j = 5; j >= i; j--) {
            //   System.out.print(" ");
            // }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next row
        }
    }
}