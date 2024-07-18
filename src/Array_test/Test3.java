package Array_test;

import java.util.ArrayList;
import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {
        String[] names = {"Mathias", "Mahdi", "Tony", "Tony", "Mahdi", "Tony", "Mathias"};
        ArrayList<String> nameList = new ArrayList<String>();
        HashMap<String, Integer> nameMap = new HashMap<>();

        // Collections.addAll(nameList, names);

        for (String name : names) {
            nameList.add(name);
            nameMap.merge(name, 1, Integer::sum);
        }
        nameList.forEach(System.out::println);
        System.out.println("**************************************************");
        nameMap.forEach((name, count) -> System.out.println(name + "=>" + count));
    }
}
