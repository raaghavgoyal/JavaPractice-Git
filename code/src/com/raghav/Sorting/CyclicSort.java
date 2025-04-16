package com.raghav.Sorting;

import java.util.Arrays;

import static com.raghav.Sorting.SelectionSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5,6,7};
        System.out.println(Arrays.toString(arr));
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        for (int i = 0; i < arr.length;) {
            if(arr[i]==i+1){
                i++;
            }else {
                swap(arr,i,arr[i]-1);
            }
        }
    }
}
