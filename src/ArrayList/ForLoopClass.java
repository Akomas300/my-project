package ArrayList;

public class ForLoopClass {
    public static void main(String[] args) {
      /*  String name = "Nasiba";
        //Start from 1 to 20
        for (int num = 1; num <= 20; num++) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(name.length());*/
        String message = "We are studying java";
        String[] words = message.split(" ");
        String[] names = {"Nasiba", "Mathias", "Mahdi"};
        //System.out.println(names);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println(names.length);
    }
}
//i++ => i+1
//i+2