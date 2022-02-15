package Java1Lesson3;

import java.util.Arrays;

public class L3N5 {
    public static void main(String args[]) {
        int initialValue = 5;
        int len = 3;

        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = initialValue;
        }
        System.out.print(Arrays.toString(nums));
    }
}
