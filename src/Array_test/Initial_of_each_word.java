package Array_test;

import java.util.Collections;
import java.util.HashMap;

public class Initial_of_each_word {
    public static void main(String[] args) {
        String str = "Hello Welcome to Java assignment group , this is a Simple String find the initial of each word and count " +
                "which letter or Character repeated most";
        HashMap<Character, Integer> map = new HashMap<>();
        for (String word : str.split(" ")) {
            map.merge(word.charAt(0), 1, Integer::sum);
        }
        // System.out.println(map);
        int max = Collections.max(map.values());
        // System.out.println(max);
        for (char maxChar : map.keySet()) {
            if (map.get(maxChar) == max) {
                System.out.println(maxChar);
            }

            break;
        }
    }
}
