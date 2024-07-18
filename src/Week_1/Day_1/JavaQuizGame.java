package Week_1.Day_1;

import java.util.Scanner;

public class JavaQuizGame {
    public static void main(String[] args) {
        String input = "";
        String userInput = "";
        int yourScore = 0;
        int correctAnswers = 0;
        int wrongAnswers = 0;
        boolean isUserChoose = true;
        var sc = new Scanner(System.in);
        while (isUserChoose) {
            System.out.println("Welcome to the Java Quiz Game!");
            System.out.println("Rules:");
            System.out.println("1. You will be asked 10 multiple-choice questions.");
            System.out.println("2. Select the correct option and press 'Next' to proceed.");
            System.out.println("3. On the final question, press 'Submit' to finish the quiz.");
            System.out.print("Are you ready to start the quiz? (Yes/No): ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("No")) {
                System.out.println("Thank you");
                isUserChoose = false;
            } else if (input.equalsIgnoreCase("Yes")) {
                System.out.println("Question 1: What is the default value of a boolean in Java? ");
                System.out.println("a) true   b) false   c) 0   d) Not defined ");
                userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("b")) {
                    yourScore += 10;
                    correctAnswers++;
                } else wrongAnswers++;
                //System.out.println(yourScore + " " + correctAnswers + " " + " " + wrongAnswers);
                System.out.println("Type 'Next' To Proceed");
                userInput = sc.nextLine();
                if (!(userInput.equalsIgnoreCase("Next"))) {
                    isUserChoose = false;
                } else {
                    System.out.println("How to declare an integer variable y?");
                    System.out.println("a) int y b) int y, c) int y= d) int y;");
                    userInput = sc.nextLine();
                    if (userInput.equalsIgnoreCase("d")) {
                        yourScore += 10;
                        correctAnswers++;
                    } else {
                        wrongAnswers++;
                    }
                }
                System.out.println("Type 'Next' To Proceed");
                userInput = sc.nextLine();
                if (!(userInput.equalsIgnoreCase("Next"))) {
                    isUserChoose = false;
                } else {
                    System.out.println("Question 1: What is the best data type use to declare the area of rectangle? ");
                    System.out.println("a) int   b) boolean   c) float   d) double e) char");
                    userInput = sc.nextLine();
                    if (userInput.equalsIgnoreCase("d")) {
                        yourScore += 10;
                        correctAnswers++;
                    } else wrongAnswers++;
                    // System.out.println("Type 'Next' To Proceed");
                }
                System.out.println("Type 'Submit' to finish the quiz");
                input = sc.nextLine();
                if (input.equalsIgnoreCase("Submit")) {
                    System.out.println("Your score is " + yourScore + " You got " + correctAnswers + " correct answer " +
                            "and " + wrongAnswers + " wrong answer");
                    isUserChoose = false;
                } else {
                    System.out.println("Do you want to restart the game?");
                    System.out.println("press 'Yes/No' if you want to");
                    input = sc.nextLine();
                    // System.out.println("Your score is " + yourScore + " You got " + correctAnswers + " correct answer " +
                    //       "and " + wrongAnswers + " wrong answer");
                    isUserChoose = input.equalsIgnoreCase("Yes");
                }

            } else {
                System.out.println("Make The Right Choice");
                isUserChoose = false;
            }
        }
    }
}
