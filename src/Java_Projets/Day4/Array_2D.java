package Java_Projets.Day4;

public class Array_2D {
    public static void main(String[] args) {
        String[][] names = {{"bob", "Rya", "Gob"}, {"Filbert", "Arnold"}, {"Piere"}};
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {

                System.out.print(names[i][j] + " ");

            }
            System.out.println();
        }


    }
}