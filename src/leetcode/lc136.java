package leetcode;

public class lc136 {
    public int singleNumber(int[] nums) {
        int num = 0;

        for (int i : nums) {
            num = num ^ i;
        }


        return num;
    }
}
