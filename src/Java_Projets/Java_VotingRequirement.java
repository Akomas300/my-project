package Java_Projets;

import java.util.Scanner;

public class Java_VotingRequirement {
    //This App is created to check if eligible to vote in USA
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        int legalAge = 0;
        boolean citizenship = false;
        System.out.println("Welcome");
        System.out.println("Please, Inter Your Name: ");
        String answer = scanner.nextLine();
        System.out.println("Thank you " + answer + " For coming");
        System.out.println("How Old Are you, " + answer + "?");
        legalAge = scanner.nextInt();
        System.out.println("Are you a US citizen?");
        citizenship = scanner.nextBoolean();
        scanner.close();

        if (legalAge >= 18 && citizenship) {
            System.out.println("you can vote");
        } else {
            System.out.println("you can't");
        }

    }
}
