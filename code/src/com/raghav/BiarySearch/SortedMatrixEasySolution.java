package com.raghav.BiarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrixEasySolution {
    public static void main(String[] args) {
        int [] [] arr = {
                {1, 2,  3,  4,  5},
                {6, 7,  8,  9,  10},
                {11,12, 13, 14, 15},
                {16,17, 18, 19, 20}
        };
        //Scanner sc = new Scanner(System.in);
        //int target = sc.nextInt();
        int target = 16;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int [][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;//Warning: will give error in empty matrix
        int cLast = cols-1;
        int rStart = 0;
        int rEnd = rows-1;
        int rMid;
        //to find the row having the target
        while(rStart<rEnd){
            rMid = rStart + (rEnd-rStart)/2;
            if(matrix[rMid][cLast] == target){
                return new int[] {rMid, cLast};
            } else if (matrix[rMid][cLast] > target) {
                rEnd = rMid;
            } else {
                rStart = rMid+1;
            }
        }
        rMid = rStart + (rEnd-rStart)/2;
        if(matrix[rMid][cLast] == target){
            return new int[] {rMid, cLast};
        }
        int cStart = 0;
        int cEnd = cLast-1;
        int cMid;
        //binary search in that particular row
        while(cStart<=cEnd){
            cMid= cStart + (cEnd-cStart)/2;
            if(matrix[rStart][cMid]==target){
                return new int[] {rStart,cMid};
            } else if (matrix[rStart][cMid]>target) {
                cEnd = cMid-1;
            }else {
                cStart = cMid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
