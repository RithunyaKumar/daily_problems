package day21;
public class RotatedSortedArray {

    public int findMin(int[] nums) {

        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        int[] nums = {3, 4, 5, 1, 2};

        System.out.println(obj.findMin(nums));
    }
}