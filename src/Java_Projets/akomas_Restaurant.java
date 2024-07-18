package Java_Projets;

import java.util.Scanner;

public class akomas_Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Akomas Restaurant,");
        System.out.println("Thank you for coming.");
        System.out.println("Are you a Member?");
        System.out.println("If Yes Type 1, If No Type 2 ");
        //scanner.nextLine();
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Welcome Back");
        } else {
            System.out.println("Register your Information");
        }

        scanner.close();


    }
}
