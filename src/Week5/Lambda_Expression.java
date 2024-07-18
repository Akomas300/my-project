package Week5;

import java.util.*;

public class Lambda_Expression {
    public static void main(String[] args) {


        int[] arr1 = {2, 6, 5, 90, 56, 10, 5, 8, 67, 54, 91, 66, 9};
        String[] arr = {"kkjm", "hgfty", "jhgfv"};
        ArrayList<String> arrList = new ArrayList<>();
        Collections.addAll(arrList, arr);
        //ArrayList<Integer> arr1List = Arrays.asList(arr1);
        List<Integer> arrList2 = Arrays.asList(8, 67, 0, 67, 99, 8, 3);
        Optional<Integer> max = arrList2.stream().reduce(Math::max);
        max.ifPresent(num -> System.out.println(num));
        ArrayList<Integer> numList = new ArrayList<>();
        System.out.println("*********************************************");
        for (int num : arr1) numList.add(num);
        Optional<Integer> ma = numList.stream().reduce(Math::min);
        ma.ifPresent(m -> System.out.println(m));


    }
}
