package Week_1.Lab_session;

import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("hello " + name);
        scanner.close();

    }
}
