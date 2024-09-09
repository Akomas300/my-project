package ArrayList.Java_Projets.Day8;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       /* var obj = new ScannerClass();
        String Name = obj.stringFullNameScannerMethod(new Scanner(System.in));
        System.out.println("Your name is: " + Name);

        */
        String[] names = {"Mathias", "Bosco", "Arnaud", "Casimir"};
        Arrays.sort(names);
        for (String i : names) {
            System.out.println(i);
        }
    }
}
