package Java_Projets.Week_4.Day1;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {6, 8, 3, 19, 5};
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            // max = numbers[0];
            if (numbers[i] > max)
                max = numbers[i];
        }

        System.out.println(max);

    }
}
