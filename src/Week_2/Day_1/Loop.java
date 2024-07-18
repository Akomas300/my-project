package Week_2.Day_1;

public class Loop {
    public static void main(String[] args) {
        // for (int i = 0; i <= 100; i++) {
        // if (i % 2 == 0)
        //   System.out.print(" " + i);
        int i = 0;
        while (i <= 100) {
            //i++ can also be here
            if (i % 2 == 0) {

                System.out.println(i);
            }
            i++; //Don't put the i++ in the if statement block, it can be before or after.
        }
    }
}
