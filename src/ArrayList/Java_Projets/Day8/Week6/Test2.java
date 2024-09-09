package ArrayList.Java_Projets.Day8.Week6;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 60; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 2; i <= 50; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) break;
                else if (i == j + 1) System.out.print(i + " ");
            }
        }
    }
}
