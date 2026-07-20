package day23;
import java.util.HashMap;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            result[i] = -1;

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    for (int k = j + 1; k < nums2.length; k++) {

                        if (nums2[k] > nums2[j]) {
                            result[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] ans = obj.nextGreaterElement(nums1, nums2);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}