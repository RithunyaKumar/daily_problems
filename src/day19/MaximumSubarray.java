package day19;
import java.util.HashMap;

public class MaximumSubarray {

    public int maxSubArrayLen(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum == k) {
                max = i + 1;
            }

            if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        int[] nums = {1, -1, 5, -2, 3};

        System.out.println(obj.maxSubArrayLen(nums, 3));
    }
}