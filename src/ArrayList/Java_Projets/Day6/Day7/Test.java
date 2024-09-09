package ArrayList.Java_Projets.Day6.Day7;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rd = new Random();
        // rd.nextInt(5);
        System.out.println(rd.nextInt((4 - 2 + 1) + 2));
        String message = "I like java";
        var reverseObj = new Reverse();
        System.out.println(Reverse.reverseMessage(message));
    }
}
