package Java_Projets;

public class Week_5 {
    public static void main(String[] args) throws InterruptedException {
        int[][] array2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20},};
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                Thread.sleep(1000);
                System.out.print(array2D[row][col] + " ");
            }
            System.out.println();
        }

    }
}
