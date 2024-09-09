package Array_test;

import java.util.Arrays;
import java.util.List;

public class Class1 {
    int num2 = 8;

    public static int sumOfNumber() {
        return 4 + 6;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mahdi", "Mathias");
        // names.add("Casimir");
        System.out.println(names);
        List<String> name = List.of("Mahdi", "Mathias", "Something");
        //name.add("Casimir");
        System.out.println(name);
    }
}