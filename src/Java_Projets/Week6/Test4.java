package Java_Projets.Week6;

public class Test4 {
    public static void main(String[] args) {
        // int numberOfEmptySpaces;
        // var sc = new Scanner(System.in);
        //  String message = sc.nextLine();
        //numbersOfCharInAString("Mathias", 'a');
        numbersOfWordInArray("Im at School with my teacher school", "schoo");
    }

    public static void numbersOfCharInAString(String message, char character) {
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == character) count++;
        }
        System.out.println(count);
    }

    public static void numbersOfWordInArray(String mess, String word) {
        String[] words = mess.split(" ");
        int countWord = 0;
        for (String wor : words) {
            if (wor.equalsIgnoreCase(word)) countWord++;
        }
        System.out.println(countWord);
    }
}
