package Week_1.Day_3;

public class Test {
    public static void main(String[] args) {
        // System.out.println((6 > 13) ? "Nope" : (3 < 7) ? "nope" : "yes");
        // System.out.println(4<6<8);
        // int[] number = new int[5];//var number = new int[5]
      /*  number[0] = 50;
        number[1] = 8;
        number[2] = 3;
        number[3] = 5;
        number[4] = 9;
        number[1] = 2;
        System.out.println(number[1]);
        System.out.println(number.length);*/
        // String[] values = new String[5];
        // values[0] = "bob";
        // values[1] = "Bob";
//        values[2] = "bOb";
//        values[3] = "boB";
//        values[4] = "bbo";
//        System.out.println(values[3]);
        String[] name = {"Bob", "boB", "tyn", "red"};
        //System.out.println(name[0]);
        for (String names : name) {
            System.out.println(names);
        }
        System.out.println("......................................................");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        //  name[0]= name[0].replace("o","r");


    }
}
