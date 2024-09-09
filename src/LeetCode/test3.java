package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class test3 {
    public static void main(String[] args) {
        int s1;
        int s2 = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            s1 = arr[i];
            arrList.add(arr[i]);
            for (int j = i; j < arr.length; j++) {
                s1 = (s1 + arr[j]);
                if (s1 == 6) {
                    arrList.add(arr[j]);
                }
                System.out.println(arrList);
                break;

            }

            arrList.clear();
        }


    }
}
