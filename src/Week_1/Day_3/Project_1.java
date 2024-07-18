package Week_1.Day_3;

import java.util.Scanner;

public class Project_1 {
    public static void main(String[] args) {
        int userChoice;
        int userSubtractionChoice;
        int userDivisionChoice;
        int userMultiplicationChoice;
        int userAddChoice;
        double input1, input2, input3, input4, input5, input6;
        var sc = new Scanner(System.in);
        System.out.println("What kind of operation you want to do?");
        System.out.println("1: Addition(+)");
        System.out.println("2: Subtraction(-)");
        System.out.println("3: Division(/)");
        System.out.println("4: Multiplication(*)");
        System.out.print("choose one of them:");
        userChoice = sc.nextInt();
        if (userChoice == 1) {
            System.out.println("How many number do you want to add?");
            System.out.println("1 for two numbers");
            System.out.println("2 for three numbers");
            System.out.println("3 for four numbers");
            System.out.println("4 for five numbers");
            System.out.println("5 for six numbers");
            System.out.print("Make your choice:");
            userAddChoice = sc.nextInt();
            if (userAddChoice == 1) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Sum of " + input1 + " and " + input2 + " Is: "
                        + (input1 + input2));
            } else if (userAddChoice == 2) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Sum of " + input1 + " ," + input2 + " and "
                        + input3 + " Is: " + (input1 + input2 + input3));
            } else if (userAddChoice == 3) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("Sum of " + input1 + " ," + input2 + " ," + input3 + " and "
                        + input4 + " Is: " + (input1 + input2 + input3 + input4));
            } else if (userAddChoice == 4) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("Enter your 5th number");
                input5 = sc.nextInt();
                System.out.println("Sum of " + input1 + " ," + input2 + " ," + input3 + " ,"
                        + input4 + " and " + input5 + " Is: " + (input1 + input2 + input3 +
                        input4 + input5));
            } else if (userAddChoice == 5) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("Enter your 5th number");
                input5 = sc.nextInt();
                System.out.println("Enter your 6th number");
                input6 = sc.nextInt();
                System.out.println("Sum of " + input1 + " ," + input2 + " ," + input3 + " ," + input4 + " ,"
                        + input5 + " and " + input6 + " Is: " + (input1 + input2 + input3 + input4 +
                        input5 + input6));
            } else {
                System.out.println("Choose the correct number");
            }
        } else if (userChoice == 2) {
            System.out.println("How many number do you want to use?");
            System.out.println("1 for two numbers");
            System.out.println("2 for three numbers");
            System.out.println("3 for four numbers");
            System.out.println("4 for five numbers");
            System.out.println("5 for six numbers");
            System.out.print("Make your choice:");
            userSubtractionChoice = sc.nextInt();
            if (userSubtractionChoice == 1) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("The subtraction of " + input2 + " from " + input1 + " Is: "
                        + (input1 - input2));
            } else if (userSubtractionChoice == 2) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("The subtraction of " + input2 + " ," + input3 + " from " + input1 +
                        " Is: " + (input1 - input2 - input3));
            } else if (userSubtractionChoice == 3) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("The subtraction of " + input2 + " ," + input3 + " ," + input4 + " from "
                        + input1 + " Is: " + (input1 - input2 - input3 - input4));
            } else if (userSubtractionChoice == 4) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("Enter your 5th number");
                input5 = sc.nextInt();
                System.out.println("The subtraction of " + input2 + " ," + input3 + " ," + input4 + " ,"
                        + input5 + " from " + input1 + " Is: " + (input1 - input2 - input3 - input4 - input5));
            } else if (userSubtractionChoice == 5) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("Enter your 5th number");
                input5 = sc.nextInt();
                System.out.println("Enter your 6th number");
                input6 = sc.nextInt();
                System.out.println("The subtraction of " + input2 + " ," + input3 + " ," + input4 + " ," + input5 + " ,"
                        + input6 + " from " + input1 + " Is: " + (input1 - input2 - input3 - input4 - input5 - input6));
            } else {
                System.out.println("Choose the correct number");
            }

        } else if (userChoice == 3) {
            System.out.println("How many number do you want to use?");
            System.out.println("1 for two numbers");
            System.out.println("2 for three numbers");
            System.out.println("3 for four numbers");
            System.out.println("4 for five numbers");
            System.out.println("5 for six numbers");
            System.out.print("Make your choice:");
            userDivisionChoice = sc.nextInt();
            if (userDivisionChoice == 1) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("The division of " + input1 + " by " + input2 + " Is: "
                        + (input1 / input2));
            } else if (userDivisionChoice == 2) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("The division of " + input1 + " by " + input2 + " and by "
                        + input3 + " Is: " + (input1 / input2 / input3));

            } else if (userDivisionChoice == 3) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("The division of " + input1 + " by " + input2 + " by "
                        + input3 + " and by " + input4 + " Is: " + (input1 / input2 / input3 / input4));
            } else if (userDivisionChoice == 4) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("Enter your 5th number");
                input5 = sc.nextInt();
                System.out.println("The division of " + input1 + " by " + input2 + " by " + input3 +
                        " by " + input4 + " and by " + input5 + " Is: "
                        + (input1 / input2 / input3 / input4 / input5));
            } else if (userDivisionChoice == 5) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("Enter your 5th number");
                input5 = sc.nextInt();
                System.out.println("Enter your 6th number");
                input6 = sc.nextInt();
                System.out.println("The division of " + input1 + " by " + input2 + " by " + input3 +
                        " by " + input4 + " by " + input5 + " and by " + input6 + " Is: "
                        + (input1 / input2 / input3 / input4 / input5 / input6));

            } else {
                System.out.println("Choose the correct number");
            }

        } else if (userChoice == 4) {
            System.out.println("How many number do you want to multiply?");
            System.out.println("1 for two numbers");
            System.out.println("2 for three numbers");
            System.out.println("3 for four numbers");
            System.out.println("4 for five numbers");
            System.out.println("5 for six numbers");
            System.out.print("Make your choice:");
            userMultiplicationChoice = sc.nextInt();
            if (userMultiplicationChoice == 1) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("The multiplication of " + input1 + " by " + input2 + " Is: "
                        + (input1 * input2));
            } else if (userMultiplicationChoice == 2) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("The multiplication of " + input1 + " by " + input2 + " and by "
                        + input3 + " Is: " + (input1 * input2 * input3));
            } else if (userMultiplicationChoice == 3) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("The multiplication of " + input1 + " by " + input2 + " by "
                        + input3 + " and by " + input4 + " Is: " + (input1 * input2 * input3 * input4));
            } else if (userMultiplicationChoice == 4) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("Enter your 5th number");
                input5 = sc.nextInt();
                System.out.println("The multiplication of " + input1 + " by " + input2 + " by " + input3 +
                        " by " + input4 + " and by " + input5 + " Is: "
                        + (input1 * input2 * input3 * input4 * input5));
            } else if (userMultiplicationChoice == 5) {
                System.out.println("Enter your first number");
                input1 = sc.nextInt();
                System.out.println("Enter your second number");
                input2 = sc.nextInt();
                System.out.println("Enter the third number");
                input3 = sc.nextInt();
                System.out.println("Enter your 4th number");
                input4 = sc.nextInt();
                System.out.println("Enter your 5th number");
                input5 = sc.nextInt();
                System.out.println("Enter your 6th number");
                input6 = sc.nextInt();
                System.out.println("The multiplication of " + input1 + " by " + input2 + " by " + input3 +
                        " by " + input4 + " by " + input5 + " and by " + input6 + " Is: "
                        + (input1 * input2 * input3 * input4 * input5 * input6));
            } else {
                System.out.println("Choose the correct number");
            }
        } else {
            System.out.println("Please, Choose a valid number");
        }
        sc.close();
    }
}