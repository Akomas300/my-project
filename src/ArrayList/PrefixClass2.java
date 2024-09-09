package ArrayList;

public class PrefixClass2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 5, 6, 77, 3};
        System.out.println(removeDouble(nums));

    }

    public static int removeDouble(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // Start with the first element being unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
