package ArrayList.Java_Projets.Day6.Day7;

public class Reverse {
    public static String reverseMessage(String message) {
        String reverse = "";
        for (int i = 0; i < message.length(); i++) {
            reverse = message.charAt(i) + reverse;
        }
        return reverse;
    }

    public static void main(String[] args) {
        String message = "Hello";
        System.out.println(reverseMessage(message));
        int a = 5;
        int b = 2;
    }


}
