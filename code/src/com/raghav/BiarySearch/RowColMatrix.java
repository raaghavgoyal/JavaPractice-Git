package com.raghav.BiarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int [] [] arr = {{1,3}};/*{
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };*/
        System.out.println(Arrays.toString(search(arr,3)));
    }
    static int [] search(int [][] matrix, int target){
        int r = 0;
        int c = matrix[0].length -1;//handle this in case of empty matrix
        while(r< matrix.length && c>= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
