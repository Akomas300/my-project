package ArrayList.Java_Projets.Day8;

public class ReverseString {
    String reverse;
    String str;


    public static void main(String[] args) {
        var obj = new ReverseString();
        obj.reverseWord("Java Code");
    }

    public void reverseWord(String str) {
        String[] words = str.split(" ");
        reverse = "";
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                reverse = word.charAt(i) + reverse;
            }

        }
        System.out.println(reverse + " ");

    }
}
