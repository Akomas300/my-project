package Java_Projets.Day8;

public class ArrayClass {
    private int[][] array;

    public ArrayClass(int[][] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        int[][] matrixOne = {{2, 4}, {6, 0}};
        int[][] matrixTwo = {{10, 7}, {3, 5}};
        int[][] result = new int[2][2];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixTwo.length; j++) {
                result[i][j] = matrixOne[i][j] * matrixTwo[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public void arrayClass() {
        for (int row = 0; row < getArray().length; row++) {
            for (int col = 0; col < getArray()[row].length; col++) {

            }

        }
    }
}
