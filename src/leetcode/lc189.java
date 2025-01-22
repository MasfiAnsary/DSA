package leetcode;

class lc189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);
    }
    static void reverse(int[] arr, int sp, int ep){
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
