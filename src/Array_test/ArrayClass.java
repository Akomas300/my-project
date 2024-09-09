package Array_test;

public class ArrayClass {

    private int min;
    private int max;
    private int range;
    private int arraySize;
    private int[] arr;
    private int count;

    public ArrayClass(int min, int max) {
        setCount(0);
        setMin(min);
        //this.min = min;
        //this.max = max;
        setMax(max);
        //this.range = max - min + 1;
        setRange(max - min + 1);
        // this.arraySize = range * range * range * range;
        setArraySize(getRange() * getRange() * getRange() * getRange());
        //this.arr = new int[arraySize];
        setArr(new int[getArraySize()]);

        generateArray();
    }


    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int[] generateArray() {
        for (int i = getMin(); i <= getMax(); i++) {
            for (int j = getMin(); j <= getMax(); j++) {
                for (int k = getMin(); k <= getMax(); k++) {
                    for (int f = getMin(); f <= getMax(); f++) {
                        getArr()[getCount()] = i * 1000 + j * 100 + k * 10 + f;
                        setCount(getCount() + 1);
                    }
                }
            }
        }
        return getArr();
    }

    public void printArrays() {
        for (int num : getArr()) {
            System.out.print(num + " ");
        }
    }

    public void printTheNumberOfCombination() {
        System.out.println("The number of combination found is: " + getCount());
    }
}

