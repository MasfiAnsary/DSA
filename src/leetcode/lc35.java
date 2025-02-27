package leetcode;

public class lc35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;

        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        int mid = -1;

        while (low <= high){
            mid = low + (high-low)/2;
            if (nums[mid]== target){
                return mid;
            }
            if (nums[mid] < target){
                low = mid+1;
            } else {
                high = mid-1;
            }

        }

        if (target > nums[mid]){
            return mid+1;
        } else {
            return mid;
        }

    }
}