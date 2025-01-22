package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr2d = new int[3][3]; //must declare the number of rows
                                    // number of columns is optional

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = in.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr2d));
    }
}
