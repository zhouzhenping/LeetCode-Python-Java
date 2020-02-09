import java.util.HashMap;
import java.util.Map;

public class Subject01Solution {
    /**
     * 暴力法：遍历每个元素x, 并查找是否存在一个值与 target-x 相等的目标元素
     * 
     * @param nums 整数数组
     * @param target 目标值
     * @return 对应数组下标
     */
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

    /**
     * 保持数组中的每个元素与其索引相互对应的最好方法是什么？哈希表 -> 以空间换取速度，支持以近似恒定时间进行快速查找
     * 第一次迭代将每个元素的值和它的索引添加到表中。
     * 第二次迭代将检查每个元素对应的目标元素是否存在表中，且不是自身。
     * 
     * @param nums 整数数组
     * @param target 目标值
     * @return 对应数组下标
     */
    public static int[] twoSum02(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum03(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String args[]) {
        int[] nums = { 2, 11, 7, 15 };
        int target = 9;
        int[] solution = {};
        solution = twoSum01(nums, target);
        System.out.println("The target is : " + solution[0] + " and " + solution[1]);
    }
}