package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the array to avoid duplicates
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int start, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target - candidates[i] >= 0) {
                current.add(candidates[i]);
                backtrack(candidates, i, target - candidates[i], current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = combinationSum(numbers, target);
        if (combinations.isEmpty()) {
            System.out.println("No valid combinations found.");
        } else {
            System.out.println("Valid combinations:");
            for (List<Integer> combination : combinations) {
                System.out.println(combination);
            }
        }
    }
}



