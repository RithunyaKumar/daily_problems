package day10;
public class EvenDigitNumbers {

    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            int digits = String.valueOf(num).length();

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        EvenDigitNumbers obj = new EvenDigitNumbers();

        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(obj.findNumbers(nums));
    }
}