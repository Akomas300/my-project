package LeetCode;

public class Activity2 {
    public static void main(String[] args) {
        String str = "MDCLXIV";
        int s1;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            s1 = eachChar(str.charAt(i));
            if ((i + 1) < str.length() && s1 < eachChar(str.charAt(i + 1))) {
                result -= s1;
            } else result += s1;
        }
        System.out.println(result);
    }

    public static int eachChar(char character) {

        if (character == 'I') return 1;
        else if (character == 'V') return 5;
        else if (character == 'X') return 10;
        else if (character == 'L') return 50;
        else if (character == 'C') return 100;
        else if (character == 'D') return 500;
        else if (character == 'M') return 1000;
        else return -1;
    }
}