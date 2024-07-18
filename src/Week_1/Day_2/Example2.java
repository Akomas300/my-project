package Week_1.Day_2;

public class Example2 {
    public static void main(String[] args) {

        int[][] numbs = {{11, 3, 5, 0, 9}, {6, 13, 5, 3, 1}};
        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbs[i].length; j++) {
                System.out.print(numbs[i][j] + " ");
            }
            System.out.println();
        }
    }
}

