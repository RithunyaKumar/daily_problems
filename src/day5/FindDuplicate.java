package day5;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int duplicate = -1;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {
                    duplicate = nums[i];
                }
            }
        }

        System.out.println("Duplicate Number = " + duplicate);

        sc.close();
    }
}