package Week_1.Day_2;

public class Example1 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 3, 8, 1}, {7, 9, 0}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }
    }
}
