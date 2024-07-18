package Week_2.Day_3;

import java.util.Scanner;

public class DiscountAtStore {
    public static void main(String[] args) {
        double originalPrice;
        double discount;
        double finalPrice;
        int customerChoice;
        boolean member = true;
        var sc = new Scanner(System.in);
        System.out.print("Enter the product original price: ");
        originalPrice = sc.nextDouble();
        System.out.println("Are you a Member?");
        System.out.println("1 for yes");
        System.out.println("2 for No");
        System.out.println("3 To Exit");
        System.out.print("Select One Number: ");
        customerChoice = sc.nextInt();
        switch (customerChoice) {
            case 1:
                member = true;
                break;
            case 2:
                member = false;
                break;
            case 3:
                System.out.println(" Thank You");
                break;
            default:
                System.out.println("Wrong choice");

        }
        finalPrice = (member) ? (originalPrice - originalPrice * 0.1) : originalPrice;
        if (member = true) {
            System.out.println("Your Product Price Is: " + "$" + finalPrice);
        } else {
            System.out.println("Your Product Price Is: " + "$" + finalPrice);
        }

    }
}
