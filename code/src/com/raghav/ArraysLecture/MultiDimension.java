package com.raghav.ArraysLecture;

import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        [
        * []
        * []
        ]
        1 2 3
        4 5 6
        7 8 9
        * */
        //int[][] arr = new int[3][];// *adding the rows is mandatory not the columns
        int [][] arr = {
                {1,2,3},
                {4,5,6,666,77,88},
                {7,8,9}
        };
        System.out.println(Arrays.toString(arr[0]));

    }
}
