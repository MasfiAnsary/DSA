package arrays;

public class reverse_array {
    public static void main(String[] args){

        int[] arr = {10, 20, 30, 40, 50, 60};

        reverse_arr(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void reverse_arr(int[] arr){
        int sp = 0;
        int ep = arr.length-1;

        while (sp < ep){
            // swap_indexes.swap(); does the same thing
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
