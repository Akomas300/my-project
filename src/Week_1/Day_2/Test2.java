package Week_1.Day_2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String[] title = new String[3];
        System.out.print("Enter the first title Name: ");
        title[0] = sc.nextLine();
        System.out.print("Enter the second title Name: ");
        title[1] = sc.nextLine();
        System.out.print("Enter the third title Name: ");
        title[2] = sc.nextLine();
        System.out.println(title[2]);
    }
}
