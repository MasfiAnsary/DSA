package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverseInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter the Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the Range: ");
        int sp = in.nextInt();
        int ep = in.nextInt();

        reverse(arr, sp, ep);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr, int sp, int ep){
        while (sp < ep) {
            // swap_indexes.swap(); does the same thing
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
