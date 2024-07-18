package Java_Projets.Day4;

public class ExeciseLoop {
    public static void main(String[] args) {
//
        String message = "i'm student of Tekschool";
        String[] word = message.split(" ");
        for (String wor : word) {
            System.out.println(wor);
        }
    }
}
