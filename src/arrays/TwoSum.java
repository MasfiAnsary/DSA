package arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 5};
        int k = 12;

        System.out.println(twoSum(arr, k));

    }
    static boolean twoSum(int[] arr, int k){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }
}
