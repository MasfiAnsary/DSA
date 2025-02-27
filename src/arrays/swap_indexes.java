package arrays;

public class swap_indexes {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};

        swap(arr, 1, 3);

        for (int i: arr){
            System.out.println(i);
        }

    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
