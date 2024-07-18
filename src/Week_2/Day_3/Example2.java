package Week_2.Day_3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        //  String[] teamNames = {"Baca", "Real", "PSG", "Inter", "Miami"};
        //  System.out.println(teamNames[0]);
        double temperatureOnC;
        System.out.print("Enter the Temperature on C: ");
        temperatureOnC = sc.nextDouble();
        System.out.println("Your Temperature on F is: " + (temperatureOnC * 1.8 + 32) + "F");

    }
}
