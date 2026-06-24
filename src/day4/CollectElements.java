package day4;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int operations = 0;

        for (int i = n - 1; i >= 0; i--) {

            operations++;

            if (nums[i] <= k && !list.contains(nums[i])) {
                list.add(nums[i]);
            }

            if (list.size() == k) {
                break;
            }
        }

        System.out.println("Minimum Operations = " + operations);

        sc.close();
    }
}