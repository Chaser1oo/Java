package Java1Lesson3;

import java.util.Arrays;

public class L3N6 {


    public static void main(String args[]) {
        //int[] nums = new int[100];
        int[] nums = { 50, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
    System.out.println(Arrays.toString(nums));
        System.out.println(max);
    }
}
