package Array_test;

public class Test4 {
    public static void main(String[] args) {

        var obj = new Test4();
        int[] nms = {1, 2, 4, 3, 3, 5};
        int nm = 6;
        obj.twoSum(nms, nm);
    }

    public void twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                }

            }
        }

    }
}
