package Array_test;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        String[] names = {"Mathias", "Casimir", "Filbert", "Arnauld", "Mathias", "Mathias", "Casimir"};
        HashMap<String, Integer> mapOfNames = new HashMap<String, Integer>();

      /*  for (String name : names) {
            mapOfNames.merge(name, 1, Integer::sum);
        }
        mapOfNames.forEach((name, count) -> System.out.println(name + " => " + count));*/
        for (String name : names) {
            mapOfNames.merge(name, 1, Integer::sum);

        }
        mapOfNames.forEach((name, count) -> System.out.println(name + "=" + count));

    }
}
