package Java1Lesson3;

import java.util.Arrays;

public class L3N2 {
    public static void main(String args[]) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i +1;
        }
        System.out.print(Arrays.toString(nums));
    }
}
