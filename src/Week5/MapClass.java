package Week5;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    private String message;


    public MapClass(String message) {
        setMessage(message);
    }

    public static HashMap<String, Integer> countNumberOfEachWordFindInAString(String text, boolean print) {
        HashMap<String, Integer> myMap = new HashMap<>();
        for (String word : text.split(" ")) {
            if (myMap.containsKey(word)) {
                myMap.put(word, myMap.get(word) + 1);
            } else myMap.put(word, 1);
        }
        if (print) {
            for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }
        return myMap;
    }

    private String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public void countTheNumberOfEachWordInAParagraph() {
        String[] arr = getMessage().split(" ");
        HashMap<String, Integer> arrMap = new HashMap<>();
        for (String word : arr) {
            arrMap.merge(word, 1, Integer::sum);
        }
        arrMap.forEach((eachWord, count) -> System.out.println(eachWord + " => " + count));
    }

    public void countEachCharacterInAString() {
        char[] charArr = getMessage().toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char character : charArr) {
            if (charMap.containsKey(character)) {
                charMap.put(character, charMap.get(character) + 1);
            } else charMap.put(character, charMap.get(character));
        }
        // charMap.forEach((character,count) -> System.out.println(character+" => "+count));
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
