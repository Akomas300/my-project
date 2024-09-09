package ArrayList.Day4;

public class Example2 {
    public static void main(String[] args) {
       /* int count = 0;
        String[] names = {"rei", "tony", "tony"};
        for (String name : names) {
            if (name.equals("tony")) count++;
            {
                System.out.println(name);
            }
        }
        System.out.println(count);

        */
        int[] numbers = {6, 9, 89, 65, 34, 77, 0, 8, 3, 194, 79, 57};
        int maxValue = numbers[0];
        for (int number : numbers) {
            if (number > maxValue)
                maxValue = number;
        }
        System.out.println("the maximum value of the array numbers is: " + maxValue);

    }
}
