package ArrayList.Java_Projets.Day8.Week6;

public class CombinationOfNumbers {
    int index;
    int[][] array = new int[index][4];
    private int count;
    private int min;
    private int max;

    public CombinationOfNumbers(int min, int max) {
        setCount(0);
        setMax(max);
        setMin(min);
        calculateCombinationsOfFourNumberFromSpecificRange();
    }

    public static void main(String[] args) {
        var obj = new CombinationOfNumbers(4, 8);
        obj.calculateCombinationsOfFourNumberFromSpecificRange();
    }

    private int getCount() {
        return count;
    }

    private void setCount(int count) {
        this.count = count;
    }

    private int getMin() {
        return min;
    }

    private void setMin(int min) {
        this.min = min;
    }

    private int getMax() {
        return max;
    }

    // private void toCharArray() {
    // }

    private void setMax(int max) {
        this.max = max;
    }

    public void calculateCombinationsOfFourNumberFromSpecificRange() {
        //[] array = new char[4];
        // int index = 0;
        for (int i = getMin(); i <= getMax(); i++) {
            for (int j = getMin(); j <= getMax(); j++) {
                for (int k = getMin(); k <= getMax(); k++) {
                    for (int f = getMin(); f <= getMax(); f++) {
                        array[index][0] = i;
                        array[index][1] = j;
                        array[index][2] = k;
                        array[index][3] = f;
                        setCount(getCount() + 1);
                        index++;
                        // if (index < getCount()) {
                        // array[f] = Integer.parseInt("" + i + j + k + f);
                        //index++;
                        // }
                        // for (int num : array) {
                        ///   System.out.println(num);


                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int u = 0; u < array[i].length; u++) {
                System.out.print(array[i][u]);
            }
        }
    }

    public void printCombinationsOfFourNumberFromSpecificRange() {
        for (int[] number : array) {
            for (int num : number) {
                System.out.print(num + " ");
            }
        }
        System.out.println();


    }

    public void printingTheNumberOfCombinationOfArrayFound() {
        System.out.println("The number of arrays found with the " +
                "combination is: " + getCount());
    }
}
