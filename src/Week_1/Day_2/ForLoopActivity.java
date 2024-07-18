package Week_1.Day_2;

public class ForLoopActivity {
    public static void main(String[] args) {
        int result = 0;
        int[] numbers = {3, 7, 2, 8, 5};
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i]; // same as result = numbers[i] + result
        }
        System.out.println(result);
    }
}
