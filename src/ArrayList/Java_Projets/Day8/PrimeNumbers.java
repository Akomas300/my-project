package ArrayList.Java_Projets.Day8;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(i + " ");
        }
        var obj = new PrimeNumbers();
        System.out.println();
        obj.primeNumberFromSpecificRang(50, 100);
        System.out.println();
        String message = "Je suis ici";
        char[] mess = message.replace(" ", "").toCharArray();
        for (char mes : mess) System.out.print(mes + " ");
    }

    public void primeNumberFromSpecificRang(int minimum, int maximum) {
        for (int i = minimum; i <= maximum; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(i + " ");
        }
    }
}
