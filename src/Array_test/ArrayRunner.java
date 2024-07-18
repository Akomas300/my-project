package Array_test;

public class ArrayRunner {
    public static void main(String[] args) {
        var arrayClassObj = new ArrayClass(2, 4);
        arrayClassObj.printArrays();
        System.out.println();
        arrayClassObj.printTheNumberOfCombination();
    }
}
