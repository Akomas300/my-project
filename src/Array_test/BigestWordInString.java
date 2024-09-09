package Array_test;

import java.util.Collections;
import java.util.HashMap;

public class BigestWordInString {
    public static void main(String[] args) {

        String str = "we are learning java fundemental with mathias and farhad ";
        HashMap<String, Integer> map = new HashMap<>();
        String[] str2 = str.split(" ");
        for (int i = 0; i < str2.length; i++) {
            map.put(str2[i], str2[i].length());
        }
        //System.out.println(Collections.max(map.values()));
        for (String word : map.keySet()) {
            if (map.get(word) == (Collections.max(map.values()))) {
                System.out.println(word);

            }
        }
        System.out.println(map);
    }
}