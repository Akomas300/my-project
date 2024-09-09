package ArrayList.Java_Projets.Day8;

public class ArraysConfig {
    private int min;
    private int[] numbers;

    public ArraysConfig(int[] numbers) {
        this.numbers = numbers;
    }

    // public ArraysConfig(int min) {
    //    this.min = min;
    //  }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void printTheLargestNumberFromArray() {
        for (int i = 0; i < getNumbers().length; i++) {
            min = getNumbers()[0];
            if (getNumbers()[i] < min) min = getNumbers()[i];
        }
        System.out.println(min);
    }
}
