import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store number with index
            map.put(nums[i], i);
        }

        // If no solution found
        return new int[] { -1, -1 };
    }
} 