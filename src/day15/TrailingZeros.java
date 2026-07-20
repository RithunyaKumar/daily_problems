package day15;
public class TrailingZeros {

    public boolean hasTrailingZeros(int[] nums) {

        int evenCount = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount >= 2;
    }

    public static void main(String[] args) {

        TrailingZeros obj = new TrailingZeros();

        int[] nums = {1, 2, 3, 4};

        System.out.println(obj.hasTrailingZeros(nums));
    }
}