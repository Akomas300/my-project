package Array_test;

public class NewClass {
    public static void main(String[] args) {
        String[] words = {"Flower", "Flow", "Flight"};
        System.out.println(longestCommonPrefix(words));

    }

    public static String longestCommonPrefix(String[] strs) {
        String pre = "";
        String shortestWord = strs[0];
        for (String w : strs) {
            if (w.length() < shortestWord.length()) {
                shortestWord = w;
            }
        }
        // make a loop based on the length of the shortest word
        for (int i = 0; i < shortestWord.length(); i++) {

            // in each itteration go through chars of w vs w
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(shortestWord.substring(0, i + 1))) {
                    continue;
                } else if (j == strs.length - 1 && strs[j].startsWith(shortestWord.substring(0, i + 1))) {
                    pre = shortestWord.substring(0, j);
                    return pre;
                }

            }
            System.out.println("---------------");
        }

        return pre;
    }

}
