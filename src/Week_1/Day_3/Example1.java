package Week_1.Day_3;

public class Example1 {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 8, 2, 0, 1};
        int totalOfNUmber = 0;
        int count = 0;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                totalOfNUmber = numbers[index] + totalOfNUmber;
                count++;
                System.out.print(numbers[index] + " ");
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println(totalOfNUmber);

        System.out.println(".................................................................");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}