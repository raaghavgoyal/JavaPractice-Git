package com.raghav.ArraysLecture;

import java.util.Arrays;

import static com.raghav.ArraysLecture.Swap.swap;

public class Reverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start++,end--);
        }
    }
}
