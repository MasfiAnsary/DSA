package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare a 2D array with 4 rows and 3 columns
        int[][] arr2d = new int[4][3];

        // Input values into the 2D array row by row
        for (int row = 0; row < arr2d.length; row++) { // Iterate through each row
            for (int col = 0; col < arr2d[row].length; col++) { // Iterate through each column
                arr2d[row][col] = in.nextInt(); // Read input from the user
            }
        }

        // Print the array in row-wise order
        output(arr2d);
        System.out.println(); // Print a blank line for better readability

        // Print the array column by column
        colWise(arr2d);
        System.out.println(); // Another blank line for separation

        // Print the entire array using Arrays.deepToString (compact representation)
        System.out.println(Arrays.deepToString(arr2d));

        // Perform a wave traversal of the array and print the elements
        wave(arr2d);
    }

    // Method to print the array row by row
    static void output(int[][] arr) {
        for (int[] ints : arr) { // For each row in the array
            for (int anInt : ints) { // For each element in the row
                System.out.print(anInt + " "); // Print the element
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Method to print the array column by column
    static void colWise(int[][] arr) {
        for (int i = 0; i < arr[i].length; i++) { // Loop through columns
            for (int j = 0; j < arr.length; j++) { // Loop through rows
                System.out.print(arr[j][i] + " "); // Print the element at [row][column]
            }
            System.out.println(); // Move to the next line after each column
        }
    }

    // Method to print the array in a wave pattern
    static void wave(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // Iterate through each row
            if (i % 2 == 0) { // For even rows (0-based index)
                for (int j = 0; j < arr[i].length; j++) { // Print left to right
                    System.out.print(arr[i][j] + " ");
                }
            } else { // For odd rows (1-based index)
                for (int j = arr[i].length - 1; j >= 0; j--) { // Print right to left
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
