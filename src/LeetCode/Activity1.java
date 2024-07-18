package LeetCode;

import java.util.HashMap;

public class Activity1 {
    public static void main(String[] args) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        String input = "MD";
        int s1;
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            s1 = romanMap.get(input.charAt(i));
            if ((i + 1) < input.length() && (romanMap.get(input.charAt(i)) < romanMap.get(input.charAt(i + 1)))) {
                result -= s1;
            } else result += s1;
        }
        System.out.println(result);

    }
}