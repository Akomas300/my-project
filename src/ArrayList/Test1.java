package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        String[] names = {"thsh", "gdgdv", "gggd"};
        ArrayList<String> Names = new ArrayList<>();
        Names.add(Arrays.toString(names));
        System.out.println(Names);
        System.out.println("*******************************************************");
        for (int i = 0; i < Names.size(); i++) {
            System.out.print(Names.get(i) + " ");
        }
        System.out.println();
        System.out.println("*************************************************");
        for (String nam : Names) {
            System.out.print(nam + " ");

        }
        System.out.println();
        System.out.println(Names.get(0));
        System.out.println();
        System.out.println(Names);
        System.out.println();

    }
}
