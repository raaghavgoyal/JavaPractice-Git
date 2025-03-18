package com.raghav.ArraysLecture;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18,4,5,0,3,1};
        System.out.println(maxItem(arr));
        System.out.println(maxItem(arr,3,9));
    }

    private static int maxItem(int[] arr) {
        int res = Integer.MIN_VALUE;
        for(int a : arr){
            if(a>res){
                res = a;
            }
        }
        return res;
    }
    //max value in a range
    private  static int maxItem(int []arr, int start, int end){
        int res = Integer.MIN_VALUE;
        for(int i = start; i<=end ; i++){
            if(arr[i]>res){
                res = arr[i];
            }
        }
        return res;
    }
}
