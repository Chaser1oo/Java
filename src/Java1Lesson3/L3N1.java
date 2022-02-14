package Java1Lesson3;

import java.util.Arrays;

public class L3N1 {
    public static void main(String args[]) {
        int[] nums = {0, 1, 1, 0, 0, 1, 1};  //v1
        System.out.print(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        System.out.print(Arrays.toString(nums));

        int[] nums2 = {0, 1, 1, 0, 0, 1, 1}; // v2
        System.out.print(Arrays.toString(nums2));
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = 1 - nums2[i];
        }
        System.out.print(Arrays.toString(nums2));
    }
}

