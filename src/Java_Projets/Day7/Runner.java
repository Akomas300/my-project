package Java_Projets.Day7;

public class Runner {
    public static void main(String[] args) {
        var objBMW = new BMW();
        objBMW.color = "Red";
        objBMW.speed = 220;
        System.out.println("Your " + objBMW.color + " BMW " + " has " + objBMW.speed + " speed");
    }
}
