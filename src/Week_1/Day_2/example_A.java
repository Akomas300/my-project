package Week_1.Day_2;

import java.util.Scanner;

public class example_A {
    public static void main(String[] args) {
        int userInput;
        var scnObj = new Scanner(System.in);
        int[] numbers = {10, 0, 1, 2, 3, 4, 6, 20, 23, 87, 89, 2, 1};

        // Actions
        System.out.println("1. Print Even Numbers ");
        System.out.println("2. Print Odd Numbers");
        System.out.print("Please select one of the options: ");
        userInput = scnObj.nextInt();
        // if (userInput != 1 && userInput != 2) System.out.println("Invalid entry, please re-enter the option!");

        switch (userInput) {
            case 1:
                int countEven = 0;
                for (int number : numbers) {
                    if (number % 2 == 0) {
                        System.out.print(number + "  ");
                        countEven++;
                    }
                }
                break;
            case 2:
                int countOdd = 0;
                for (int number : numbers) {
                    if (number % 2 != 0) {
                        System.out.print(number + " ");
                        countOdd++;
                    }
                }
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }
}