package arrays;

public class array_min {
    public static void main(String[] args){
        int[] arr = {10, -10, 5, -90, 4, 53, 89, 199, -139, 224};

        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        System.out.print("Minimum value is: " + min);
    }
}
