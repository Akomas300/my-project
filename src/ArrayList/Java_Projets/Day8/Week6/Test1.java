package ArrayList.Java_Projets.Day8.Week6;

public class Test1 {
    static String[] arrayNames = {"Mathias", "Arnauld", "Casimir", "Mothias",};

    public static void main(String[] args) {
        for (int i = 0; i < arrayNames.length; i++) {
            for (int j = 0; j < arrayNames.length - i - 1; j++)
                if (arrayNames[j].compareTo(arrayNames[j + 1]) < 0) {
                    String temp = arrayNames[j];
                    arrayNames[j] = arrayNames[j + 1];
                    arrayNames[j + 1] = temp;
                }
        }
        for (String name : arrayNames) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("****************************************************");
        for (int i = 0; i < arrayNames.length; i++) {
            for (int j = 0; j < arrayNames.length - i - 1; j++) {
                if (arrayNames[j].charAt(i) < arrayNames[j + 1].charAt(i)) {
                    String temp = arrayNames[j];
                    arrayNames[j] = arrayNames[j + 1];
                    arrayNames[j + 1] = temp;
                }
            }
        }
        for (String na : arrayNames) {
            System.out.print(na + " ");
        }
    }
}
