package leetcode;

public class lc27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        int count = 0;

        while (j>=i){
            if (nums[i] == val){
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                    count++;
                }
                j--;
            } else {
                i++;
                count++;
            }
        }

        return count;
    }
}
