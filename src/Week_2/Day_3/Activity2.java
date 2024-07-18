package Week_2.Day_3;

public class Activity2 {
    public static void main(String[] args) {
        boolean isWeekend = true,
                isHoliday = true;
        if (!((isWeekend = true) && (isHoliday = true)))
            System.out.println(" Set your alarm");
        else
            System.out.println("Don't set your alarm");

    }
}

