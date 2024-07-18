package Pratice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) throws InterruptedException {

        String userRowColChoose;
        int userInput;
        boolean isUserChoose = false;
        int attempt = 0;
        var random = new Random();
        char cr = 'a';
        int[][] numbers = new int[3][3];
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = random.nextInt(10);
                //System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
        for (char cm = 'A'; cm <= 'C'; cm++) {
            System.out.print("    " + "col" + cm);
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("row" + (i + 1) + "   ");
            //System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "     ");

            }
            System.out.println();
        }
        try {


            while ((!isUserChoose) && attempt <= 3) {
                var sc = new Scanner(System.in);
                System.out.println("Welcome back");
                System.out.println("For your identification enter any valid number from your identification table");
                System.out.println("For example: row1colA with no space for the first number of the table");
                System.out.println("You can choose different one after a wrong attempt");
                System.out.print("Choose a location: ");
                userRowColChoose = sc.nextLine();
                System.out.print("Enter the valid number of the location choose: ");
                userInput = sc.nextInt();

                if ((userRowColChoose.equalsIgnoreCase("row1colA") && userInput == numbers[0][0]) ||
                        (userRowColChoose.equalsIgnoreCase("row1colB") && userInput == numbers[0][1]) ||
                        (userRowColChoose.equalsIgnoreCase("row1colC") && userInput == numbers[0][2]) ||
                        (userRowColChoose.equalsIgnoreCase("row2colA") && userInput == numbers[1][0]) ||
                        (userRowColChoose.equalsIgnoreCase("row2colB") && userInput == numbers[1][1]) ||
                        (userRowColChoose.equalsIgnoreCase("row2colC") && userInput == numbers[1][2]) ||
                        (userRowColChoose.equalsIgnoreCase("row3colA") && userInput == numbers[2][0]) ||
                        (userRowColChoose.equalsIgnoreCase("row3colB") && userInput == numbers[2][1]) ||
                        (userRowColChoose.equalsIgnoreCase("row3colC") && userInput == numbers[2][2])) {
                    System.out.println("Valid number!! Welcome to your home page");
                    isUserChoose = true;
                } else {
                    System.out.println("Wrong attempt");
                    attempt++;
                }
                if (attempt == 3) {
                    System.out.println("3 Wrong attempts,Try again later after 30s");
                    Thread.sleep(30000);
                    isUserChoose = true;
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            System.out.println("Read correctly the instruction and try again");

        }

    }
}
