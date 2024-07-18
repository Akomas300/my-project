package Week_2;

import java.util.Random;

public class Example {
    public static void main(String[] args) {
        // String message = " Welcome to *9999::::@@@@@@############PP";
        // System.out.println(message.replaceAll("[a-zA-Z0-9]", "").replace(" ", ""));
        Random random = new Random();
        int[] arrayNumber = new int[20];
        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(100);
            arrayNumber[i] = number;
            System.out.print(arrayNumber[i] + " ");


        }
    }
}
