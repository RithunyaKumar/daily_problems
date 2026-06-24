package day5;
import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        int count = 0;

        for (int i = 0; i < n; i++) {

            nums[i] = sc.nextInt();

            int number = nums[i];
            int digits = 0;

            while (number > 0) {
                digits++;
                number = number / 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);

        sc.close();
    }
}