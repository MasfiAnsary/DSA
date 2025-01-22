
/* rotate a given array from last to fist
    by k times
 */

package arrays;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 6, 9, 8};
        int k = 8;

        rotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int k){
        k = k % arr.length;
        reverse_array.reverse_arr(arr);
        reverseInRange.reverse(arr, 0, k-1);
        reverseInRange.reverse(arr, k, arr.length-1);
    }
}
