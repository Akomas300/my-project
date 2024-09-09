package ArrayList.Java_Projets.Day8.Week6;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = sc.nextInt();

        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a element of your array:" + (i + 1));
            array[i] = sc.next();
        }

        for (String print : array) {
            System.out.println(print);
        }
    }
}

//