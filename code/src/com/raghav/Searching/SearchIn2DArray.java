package com.raghav.Searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 31;
        int[] ans = search(arr, target);//{row, column}
        System.out.println(Arrays.toString(ans));
        System.out.println("Max value in the 2D array is : "+ max(arr));
    }

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;    // or arr[0][0];
        for (int[] ints : arr) {
            for (int element : ints) {
                if (max < element) {
                    max = element;
                }
            }
        }
        return max;
    }
}
