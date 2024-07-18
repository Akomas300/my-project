package Week_1.Day_2;

public class ForLoopActivity2 {
    public static void main(String[] args) {
        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        int[] numbers = {10, 0, 1, 2, 3, 4, 5, 6, 11, 20, 23, 87, 89};
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                countEvenNumbers++;
                System.out.print(numbers[index] + " ");

            } else {
                countOddNumbers++;
            }
        }
        System.out.println();
        System.out.println("we found " + countEvenNumbers + " Even numbers");
        System.out.println("we found " + countOddNumbers + " Odds numbers");
    }
}
