package Week_2.Day_2;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        int time;
        String activity;
        var sc = new Scanner(System.in);
        //Tracking Mathias Monday Activities
        System.out.print("Enter the time you want to track. for example 10am ==>10 and 10pm==> 22: ");
        time = sc.nextInt();
        if
        (time >= 5 && time <= 12)
            activity = "Driving";
        else if
        (time > 12 && time <= 18)
            activity = "Resting or Studying";
        else if
        (time > 18 && time <= 22)
            activity = "At school";
        else if
        (time < 1 || time > 24)
            activity = "Wrong timing";
        else
            activity = "Sleeping";
        System.out.println(activity + " I'll get back to you soon");
    }
}
