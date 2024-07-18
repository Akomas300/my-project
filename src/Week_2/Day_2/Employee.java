package Week_2.Day_2;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scobj = new Scanner(System.in);
        String firstName, lastName, city;
        String phoneNumber;
        double salary;
        System.out.println("Hello! inter your firstname please: ");
        firstName = scobj.nextLine();
        System.out.println("What about your lastname? ");
        lastName = scobj.nextLine();
        System.out.println("What is your city?: ");
        city = scobj.nextLine();
        System.out.println("Thank you so much " + firstName + " " + lastName);
        System.out.println("Mr/Ms " + firstName + " " + lastName + " What is your Phone number? ");
        phoneNumber = scobj.nextLine();
        System.out.println("What about your salary? ");
        salary = scobj.nextDouble();
        System.out.println("thank you " + firstName + " " + lastName +
                " we will call you on " + " " + phoneNumber + " or come to " + city +
                " for mor information");
    }
}
