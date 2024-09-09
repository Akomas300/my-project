package ArrayList.Day4;

public class WhileLoop_1 {
    public static void main(String[] args) {
        String message = "learning Java is fun!";
        for (int i = 0; i < message.length() - 3; i++) {
            System.out.print(message.replace(" ", "").charAt(i) + " ");
        }
    }

}

