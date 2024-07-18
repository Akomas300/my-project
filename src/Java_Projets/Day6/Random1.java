package Java_Projets.Day6;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
    public static void main(String[] args) {
        var ran = new Random();
        var sc = new Scanner(System.in);
        System.out.print("What is the size of array do you want? ");
        int userImput = sc.nextInt();
        int[] number = new int[userImput];
        for (int i = 0; i < userImput; i++) {
            number[i] = ran.nextInt(100);
        }
        for (int numb : number) {
            if (numb % 2 == 0) System.out.println(numb);
        }
    }
}