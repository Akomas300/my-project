package Week5;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        String str = "ccsfdtwyusjjmmduygtwtyuuwuwhggffcmsjdaasqqt";
        ArrayList<Character> chars = new ArrayList<>();
        HashMap<Character, Integer> charsMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
            charsMap.merge(str.charAt(i), 1, Integer::sum);
        }
        chars.forEach(System.out::println);
        System.out.println("*************************************************");
        charsMap.forEach((cha, count) -> System.out.println("The number of " + cha + " is: " + count));
    }
}
