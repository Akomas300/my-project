package ArrayList.Java_Projets.Day8.Week6.Week_4.Day2;

public class Class1 {
    public static void main(String[] args) {
        String str = "This is a test string , have fun!";
        String[] array = str.split(" ");
        for (String words : array) {
            StringBuilder stringBuilder = new StringBuilder(words);
            System.out.print(stringBuilder.reverse() + " ");
        }
    }
}
