package day19;
public class PivotIndex {

    public int pivotIndex(int[] nums) {

        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println(obj.pivotIndex(nums));
    }
}