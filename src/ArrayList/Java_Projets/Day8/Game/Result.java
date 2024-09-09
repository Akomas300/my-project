package ArrayList.Java_Projets.Day8.Game;

import java.util.Random;

public class Result {
    public int point;
    public String name;

    // public Result(int point, String name) {
    //  this.point = point;
    //  this.name = name;
    //  }

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void main(String[] args) {
        System.out.println(Result.valueOf(true));
    }

    public void result() {
        String[] names = {"John", "Mathias", "Doe", "Ali", "Ahmed"};
        var random = new Random();
        System.out.println("The name select is: " + names[random.nextInt(names.length)]);
    }
}
