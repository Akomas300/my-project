package Java_Projets.Day7;

public class BMW extends Vehicle {

    int speed;

    public static void main(String[] args) {
        String reverse = "";
        String message = "Welcome to my house";
        for (int i = 0; i < message.length(); i++) {
            reverse = message.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }

}

