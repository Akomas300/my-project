package Java_Projets.Day4;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        boolean usersVIP;
        int gameHour;
        int userChoice;
        System.out.println("Are you VIP Member? ");
        System.out.println("1 for No");
        System.out.println("2 for Yes");
        System.out.print("Make your choice: ");
        userChoice = sc.nextInt();
        usersVIP = userChoice != 1;
        switch (userChoice) {
            case 1:
                usersVIP = false;
                System.out.print("How many hour did you play the game?: ");
                gameHour = sc.nextInt();
                if (gameHour < 100)
                    System.out.println("You don't have access");
                else {
                    usersVIP = true;
                    System.out.println("You have access to The game");
                }
                break;
            case 2:
                System.out.println("you have access to the game");
                break;
            default:
                System.out.println("Invalid entry");
        }


    }
}
