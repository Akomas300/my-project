package Week_1.Lab_session;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println("I got it");
            x++;
        }
        while (x < 7);
        char ba = 's', bs = 'f';
        System.out.println(ba + bs);
        Scanner scanner = new Scanner(System.in);
        System.out.println("your name:");
        String userName =
                scanner.nextLine();
        System.out.println("hello:" + userName);
        scanner.close();
    }
}