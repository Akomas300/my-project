package Java_Projets.Week6;

public class ArraysClass {
    private int[] array;

    public ArraysClass(int[] array) {
        setArray(array);
        intArraySortingClass();
    }

    private int[] getArray() {
        return array;
    }

    private void setArray(int[] array) {
        this.array = array;
    }

    private void intArraySortingClass() {
        for (int i = 0; i < getArray().length; i++) {
            for (int j = 0; j < getArray().length - i - 1; j++) {
                if (getArray()[j] > getArray()[j + 1]) {
                    int temp = getArray()[j];
                    getArray()[j] = getArray()[j + 1];
                    getArray()[j + 1] = temp;

                }
            }


        }

    }

    public void printReverseArray() {
        for (int i : getArray()) {
            System.out.print(i + " ");
        }
    }
}