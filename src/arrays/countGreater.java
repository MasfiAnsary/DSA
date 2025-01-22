/* Given N array elements, count total no of
elements having at-least 1 element greater than itself
 */


package arrays;

public class countGreater {
    public static void main(String[] args) {
        int[] arr = {3, 4, 11, 8, 2, 10, 9, 11};

        System.out.println(greater(arr));

    }

    static int greater(int[] arr){
        int max = arr[0];
        int count = 1;
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            if (arr[i] == max || arr[i] > max) {
                if (arr[i] == max){
                    count++;
                } else {
                    max = arr[i];
                    count = 1;
                }
            }
        }
        return (len - count);
    }
}
