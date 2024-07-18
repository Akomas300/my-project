package Week_2.Day_2;

import java.util.Scanner;

public class weather_decision {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        String firstName, lastName;
        System.out.println("enter your first name: ");
        firstName = sc.nextLine();
        System.out.println(" enter your last name: ");
        lastName = sc.nextLine();
        if (firstName.equals(lastName)) {
            System.out.println(" your first name and last name are the same");
        } else {
            System.out.println(" your first name and last name are not the same ");
        }


    }
}
