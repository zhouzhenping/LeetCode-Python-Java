public class Subject01Solution {
    public static int[] twoSum01(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String args[]) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] solution = {};
        solution = twoSum01(nums, target);
        System.out.println("The target is : " + solution[0] +" and " + solution[1]);
    }
}