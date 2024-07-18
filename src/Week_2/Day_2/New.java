package Week_2.Day_2;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("what time is it? : ");
        int time = sc.nextInt();
        System.out.println((time >= 20 || time <= 4) ? "dark" : "not dark");
    }
}
