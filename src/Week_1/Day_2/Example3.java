package Week_1.Day_2;

public class Example3 {
    public static void main(String[] args) {
        int[][][] numbs = {{{1, 2, 5}, {9, 7, 4}}, {{4, 0, 11}, {12, 5, 8}}};
        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbs[i].length; j++) {
                for (int x = 0; x < numbs[i][j].length; x++) {
                    System.out.print(numbs[i][j][x] + " ");
                }
                //System.out.println();
            }
            //System.out.println();
        }
        //System.out.println();
    }
}
