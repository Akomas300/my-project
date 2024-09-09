package Array_test;

public class FindTheSecondLargerNumberInArray {
    public static void main(String[] args) {
        int a;
        int[] numbers = {3, 6, 1, 1, 8, 9, 23, 6, 54};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] <= numbers[j]) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
