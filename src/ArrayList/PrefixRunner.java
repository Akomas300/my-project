package ArrayList;

public class PrefixRunner {
    public static void main(String[] args) {
        String[] str = {"mathias", "mahdi", "mati", "maths"};
        PrefixClass obj = new PrefixClass();
        System.out.println(obj.theLongestPrefixInArrayOfString(str));
    }
}
