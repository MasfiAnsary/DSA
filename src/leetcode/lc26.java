package leetcode;

import java.util.Arrays;

public class lc26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int count = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int current_num = nums[0];
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            if (nums[i] != current_num){
                nums[index] = temp;
                current_num = temp;
                index++;
            }
        }
        return count;
    }
}