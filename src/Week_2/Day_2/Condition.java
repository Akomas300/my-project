package Week_2.Day_2;

public class Condition {
    public static void main(String[] args) {
        //   var sc = new Scanner(System.in);
        //   String color1 = "Red", color2 = "Blue";
        // String favoriteColor = "Blue";
        //   System.out.print("What is your favorite color between Red and Blue: ");
        //   String color = sc.nextLine();
        //  String favoriteColor = (color.equals(color2)) ? color2 : color1;
        //  System.out.println("your favorite color is: " + favoriteColor);
        int temperature = 100;
        if (temperature < 10) {
            System.out.println(" Wear a heavy coat");
        } else if (temperature > 10 && temperature < 20) {
            System.out.println("A light jacket will do.");
        } else System.out.println("it's warm");
    }
}
