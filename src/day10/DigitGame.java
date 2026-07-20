package day10;
public class DigitGame {

    public boolean canAliceWin(int[] nums) {

        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            if (num < 10) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }

        return singleDigitSum != doubleDigitSum;
    }

    public static void main(String[] args) {

        DigitGame obj = new DigitGame();

        int[] nums = {1, 2, 11, 12};

        System.out.println(obj.canAliceWin(nums));
    }
}