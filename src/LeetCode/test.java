package LeetCode;

public class test {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length - 1; j++) {
                if (arr[i] + arr[j] + arr[j + 1] == 6) System.out.println(i + "" + j + (j + 1));
            }
        }
    }
}