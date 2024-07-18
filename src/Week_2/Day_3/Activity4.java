package Week_2.Day_3;

public class Activity4 {
    public static void main(String[] args) {
        int age = 14;
        if (age > 0 && age <= 12)
            System.out.println("You're a Child");
        else if (age >= 13 && age <= 19)
            System.out.println("You're a Teenager");
        else if (age >= 20)
            System.out.println("You're a Adult");
        else
            System.out.println("Wrong value of age");
    }
}
